package com.system.pos.producers;

import com.system.pos.dtos.SaleItemDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class SaleProducer {

    private final RabbitTemplate rabbitTemplate;

    @Value(value = "stock.#")
    private String routingKey;

    public void sendItemToQueue(SaleItemDTO saleItemDTO) {

        rabbitTemplate.convertAndSend("stock_exchange", routingKey, saleItemDTO);
    }
//
//    private final SaleService saleService;
//
//    @RabbitListener(queues = "stock_queue")
//    public void listenEmailQueue(@Payload SaleDTO saleDTO) {
//        log.info(">>>>>>> {}",saleDTO.getItems().getName());
//
//        saleService.processSale(saleDTO);
//    }

}
