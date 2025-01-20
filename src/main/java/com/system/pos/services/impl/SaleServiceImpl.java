package com.system.pos.services.impl;

import com.system.pos.dtos.SaleDTO;
import com.system.pos.dtos.SaleItemDTO;
import com.system.pos.entities.Customer;
import com.system.pos.exeptions.NotFoundException;
import com.system.pos.mappers.SaleMapper;
import com.system.pos.producers.SaleProducer;
import com.system.pos.repositories.CustomerRepository;
import com.system.pos.repositories.SaleRepository;
import com.system.pos.services.SaleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SaleServiceImpl implements SaleService {

    private final SaleRepository saleRepository;
    private final SaleMapper saleMapper;
    private final CustomerRepository customerRepository;
    private final SaleProducer saleProducer;

    public SaleDTO processSale(SaleDTO saleDTO) {

        Customer customer = getCustomer(saleDTO.getCustomerId());

        List<SaleItemDTO> saleItems = saleDTO.getItems().stream()
                .map(itemDTO -> {
                    SaleItemDTO saleItem = new SaleItemDTO();
                    saleItem.setItemId(itemDTO.getItemId());
                    saleItem.setQuantity(itemDTO.getQuantity());


                    saleProducer.sendItemToQueue(saleItem);

                    return saleItem;
                })
                .toList();

        return null;
    }


    private Customer getCustomer(Long id) throws NotFoundException {
        return customerRepository.findByIdAndDeletedAtIsNull(id).orElseThrow(()
                -> new NotFoundException("Customer not found"));
    }
}
