package com.ruoyi.wms.domain.bo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface ShipmentOrderDetailBoToInventoryBoMapper extends BaseMapper<ShipmentOrderDetailBo, InventoryBo> {
  InventoryBo convert(ShipmentOrderDetailBo source, @MappingTarget InventoryBo target);
}
