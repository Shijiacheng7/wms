package com.ruoyi.wms.domain.bo;

import com.ruoyi.wms.domain.entity.ShipmentOrder;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface ShipmentOrderBoToShipmentOrderMapper extends BaseMapper<ShipmentOrderBo, ShipmentOrder> {
  ShipmentOrder convert(ShipmentOrderBo source, @MappingTarget ShipmentOrder target);
}
