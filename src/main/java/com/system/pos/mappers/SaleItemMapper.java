package com.system.pos.mappers;

import com.system.pos.dtos.SaleItemDTO;
import com.system.pos.entities.SaleItem;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface SaleItemMapper {

    SaleItem toEntity(SaleItemDTO saleItemDTO);

    SaleItemDTO toDto(SaleItem saleItem);

    List<SaleItemDTO> toSaleItemDTOs(List<SaleItem> saleItems);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    SaleItem partialUpdate(SaleItemDTO saleItemDTO, @MappingTarget SaleItem saleItem);
}
