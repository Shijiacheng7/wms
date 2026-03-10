package com.ruoyi.wms.domain.entity;

import com.ruoyi.wms.domain.vo.ShipmentOrderDetailVo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-06T21:50:28+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class ShipmentOrderDetailToShipmentOrderDetailVoMapperImpl implements ShipmentOrderDetailToShipmentOrderDetailVoMapper {

    @Override
    public ShipmentOrderDetailVo convert(ShipmentOrderDetail arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ShipmentOrderDetailVo shipmentOrderDetailVo = new ShipmentOrderDetailVo();

        shipmentOrderDetailVo.setId( arg0.getId() );
        shipmentOrderDetailVo.setOrderId( arg0.getOrderId() );
        shipmentOrderDetailVo.setSkuId( arg0.getSkuId() );
        shipmentOrderDetailVo.setQuantity( arg0.getQuantity() );
        shipmentOrderDetailVo.setAmount( arg0.getAmount() );
        shipmentOrderDetailVo.setRemark( arg0.getRemark() );
        shipmentOrderDetailVo.setWarehouseId( arg0.getWarehouseId() );

        return shipmentOrderDetailVo;
    }

    @Override
    public ShipmentOrderDetailVo convert(ShipmentOrderDetail source, ShipmentOrderDetailVo target) {
        if ( source == null ) {
            return target;
        }

        target.setId( source.getId() );
        target.setOrderId( source.getOrderId() );
        target.setSkuId( source.getSkuId() );
        target.setQuantity( source.getQuantity() );
        target.setAmount( source.getAmount() );
        target.setRemark( source.getRemark() );
        target.setWarehouseId( source.getWarehouseId() );

        return target;
    }
}
