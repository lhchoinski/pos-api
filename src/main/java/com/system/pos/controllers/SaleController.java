package com.system.pos.controllers;

import com.system.pos.services.PosService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sales")
@RequiredArgsConstructor
@Tag(name = "Sale")
public class SaleController {

    private final PosService posService;

    @PostMapping("/sale")
    public String createSale(@RequestBody String saleRequest) {
        return posService.processSale(saleRequest);
    }
}
