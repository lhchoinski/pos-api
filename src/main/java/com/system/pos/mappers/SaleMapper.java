package com.system.pos.mappers;

import com.system.pos.dtos.SaleDTO;
import com.system.pos.entities.Sale;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface SaleMapper {

    Sale toEntity(SaleDTO saleDTO);

    SaleDTO toDto(Sale sale);

    List<SaleDTO> toSaleDTOs(List<Sale> sales);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Sale partialUpdate(SaleDTO saleDTO, @MappingTarget Sale sale);
}
