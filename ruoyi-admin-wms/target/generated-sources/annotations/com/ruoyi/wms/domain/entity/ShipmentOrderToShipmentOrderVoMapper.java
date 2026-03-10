package com.ruoyi.wms.domain.entity;

import com.ruoyi.wms.domain.vo.ShipmentOrderVo;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface ShipmentOrderToShipmentOrderVoMapper extends BaseMapper<ShipmentOrder, ShipmentOrderVo> {
  ShipmentOrderVo convert(ShipmentOrder source, @MappingTarget ShipmentOrderVo target);
}
