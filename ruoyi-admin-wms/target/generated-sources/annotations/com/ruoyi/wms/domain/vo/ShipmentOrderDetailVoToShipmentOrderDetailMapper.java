package com.ruoyi.wms.domain.vo;

import com.ruoyi.wms.domain.entity.ShipmentOrderDetail;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface ShipmentOrderDetailVoToShipmentOrderDetailMapper extends BaseMapper<ShipmentOrderDetailVo, ShipmentOrderDetail> {
  ShipmentOrderDetail convert(ShipmentOrderDetailVo source,
      @MappingTarget ShipmentOrderDetail target);
}
