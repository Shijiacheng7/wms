package com.ruoyi.wms.domain.vo;

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
public interface ShipmentOrderVoToShipmentOrderMapper extends BaseMapper<ShipmentOrderVo, ShipmentOrder> {
  ShipmentOrder convert(ShipmentOrderVo source, @MappingTarget ShipmentOrder target);
}
