package com.system.pos.controllers;

import com.fasterxml.jackson.annotation.JsonView;
import com.system.pos.dtos.SaleDTO;
import com.system.pos.dtos.groups.AppGroup;
import com.system.pos.services.SaleService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sales")
@RequiredArgsConstructor
@Tag(name = "Sale")
public class SaleController {

    private final SaleService saleService;

    @Operation(summary = "Create", description = "Create sale")
    @PostMapping
    @JsonView(AppGroup.Response.class)
    public ResponseEntity<SaleDTO> create(
            @RequestBody
            @Valid
            @JsonView(AppGroup.Request.class)
            SaleDTO saleDTO
    ) {
        return ResponseEntity.ok(saleService.processSale(saleDTO));
    }
}
