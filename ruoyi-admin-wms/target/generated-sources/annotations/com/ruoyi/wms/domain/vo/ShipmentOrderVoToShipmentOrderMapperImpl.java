package com.ruoyi.wms.domain.vo;

import com.ruoyi.wms.domain.entity.ShipmentOrder;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-06T21:50:28+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class ShipmentOrderVoToShipmentOrderMapperImpl implements ShipmentOrderVoToShipmentOrderMapper {

    @Override
    public ShipmentOrder convert(ShipmentOrderVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ShipmentOrder shipmentOrder = new ShipmentOrder();

        shipmentOrder.setCreateBy( arg0.getCreateBy() );
        shipmentOrder.setCreateTime( arg0.getCreateTime() );
        shipmentOrder.setUpdateBy( arg0.getUpdateBy() );
        shipmentOrder.setUpdateTime( arg0.getUpdateTime() );
        shipmentOrder.setId( arg0.getId() );
        shipmentOrder.setOrderNo( arg0.getOrderNo() );
        shipmentOrder.setTotalQuantity( arg0.getTotalQuantity() );
        shipmentOrder.setTotalAmount( arg0.getTotalAmount() );
        shipmentOrder.setOrderStatus( arg0.getOrderStatus() );
        shipmentOrder.setRemark( arg0.getRemark() );
        shipmentOrder.setWarehouseId( arg0.getWarehouseId() );
        shipmentOrder.setOptType( arg0.getOptType() );
        shipmentOrder.setBizOrderNo( arg0.getBizOrderNo() );
        shipmentOrder.setMerchantId( arg0.getMerchantId() );

        return shipmentOrder;
    }

    @Override
    public ShipmentOrder convert(ShipmentOrderVo source, ShipmentOrder target) {
        if ( source == null ) {
            return target;
        }

        target.setCreateBy( source.getCreateBy() );
        target.setCreateTime( source.getCreateTime() );
        target.setUpdateBy( source.getUpdateBy() );
        target.setUpdateTime( source.getUpdateTime() );
        target.setId( source.getId() );
        target.setOrderNo( source.getOrderNo() );
        target.setTotalQuantity( source.getTotalQuantity() );
        target.setTotalAmount( source.getTotalAmount() );
        target.setOrderStatus( source.getOrderStatus() );
        target.setRemark( source.getRemark() );
        target.setWarehouseId( source.getWarehouseId() );
        target.setOptType( source.getOptType() );
        target.setBizOrderNo( source.getBizOrderNo() );
        target.setMerchantId( source.getMerchantId() );

        return target;
    }
}
