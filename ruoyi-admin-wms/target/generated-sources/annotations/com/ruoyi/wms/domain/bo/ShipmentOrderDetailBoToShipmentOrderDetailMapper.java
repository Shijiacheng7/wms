package com.ruoyi.wms.domain.bo;

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
public interface ShipmentOrderDetailBoToShipmentOrderDetailMapper extends BaseMapper<ShipmentOrderDetailBo, ShipmentOrderDetail> {
  ShipmentOrderDetail convert(ShipmentOrderDetailBo source,
      @MappingTarget ShipmentOrderDetail target);
}
