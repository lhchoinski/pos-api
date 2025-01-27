package com.system.pos.services.impl;

import com.system.pos.entities.Customer;
import com.system.pos.exeptions.NotFoundException;
import com.system.pos.mappers.SaleMapper;
//import com.system.pos.producers.SaleProducer;
import com.system.pos.repositories.CustomerRepository;
import com.system.pos.repositories.SaleRepository;
import com.system.pos.services.PosService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PosServiceImpl implements PosService {

    private final SaleRepository saleRepository;
    private final SaleMapper saleMapper;
    private final CustomerRepository customerRepository;
    private final RabbitTemplate rabbitTemplate;

    public String processSale(String saleRequest) {
        try {

            String salesResponse = (String) rabbitTemplate.convertSendAndReceive("sales.queue", saleRequest);
            if (salesResponse == null || salesResponse.contains("error")) {
                throw new RuntimeException("Erro no serviço de vendas: " + salesResponse);
            }

            String paymentResponse = (String) rabbitTemplate.convertSendAndReceive("payment.queue", salesResponse);
            if (paymentResponse == null || paymentResponse.contains("error")) {
                throw new RuntimeException("Erro no serviço de pagamento: " + paymentResponse);
            }

            String stockResponse = (String) rabbitTemplate.convertSendAndReceive("stock.queue", paymentResponse);
            if (stockResponse == null || stockResponse.contains("error")) {
                throw new RuntimeException("Erro no serviço de estoque: " + stockResponse);
            }

            return "Processamento concluído com sucesso.";

        } catch (Exception e) {
            return "Erro no processamento: " + e.getMessage();
        }
    }


    private Customer getCustomer(Long id) throws NotFoundException {
        return customerRepository.findByIdAndDeletedAtIsNull(id).orElseThrow(()
                -> new NotFoundException("Customer not found"));
    }
}
