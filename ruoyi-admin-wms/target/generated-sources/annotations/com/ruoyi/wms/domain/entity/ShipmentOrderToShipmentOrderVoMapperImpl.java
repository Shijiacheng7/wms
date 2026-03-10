package com.ruoyi.wms.domain.entity;

import com.ruoyi.wms.domain.vo.ShipmentOrderVo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-06T21:50:28+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class ShipmentOrderToShipmentOrderVoMapperImpl implements ShipmentOrderToShipmentOrderVoMapper {

    @Override
    public ShipmentOrderVo convert(ShipmentOrder arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ShipmentOrderVo shipmentOrderVo = new ShipmentOrderVo();

        shipmentOrderVo.setCreateBy( arg0.getCreateBy() );
        shipmentOrderVo.setCreateTime( arg0.getCreateTime() );
        shipmentOrderVo.setUpdateBy( arg0.getUpdateBy() );
        shipmentOrderVo.setUpdateTime( arg0.getUpdateTime() );
        shipmentOrderVo.setId( arg0.getId() );
        shipmentOrderVo.setOrderNo( arg0.getOrderNo() );
        shipmentOrderVo.setTotalQuantity( arg0.getTotalQuantity() );
        shipmentOrderVo.setTotalAmount( arg0.getTotalAmount() );
        shipmentOrderVo.setOrderStatus( arg0.getOrderStatus() );
        shipmentOrderVo.setWarehouseId( arg0.getWarehouseId() );
        shipmentOrderVo.setRemark( arg0.getRemark() );
        shipmentOrderVo.setOptType( arg0.getOptType() );
        shipmentOrderVo.setMerchantId( arg0.getMerchantId() );
        shipmentOrderVo.setBizOrderNo( arg0.getBizOrderNo() );

        return shipmentOrderVo;
    }

    @Override
    public ShipmentOrderVo convert(ShipmentOrder source, ShipmentOrderVo target) {
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
        target.setWarehouseId( source.getWarehouseId() );
        target.setRemark( source.getRemark() );
        target.setOptType( source.getOptType() );
        target.setMerchantId( source.getMerchantId() );
        target.setBizOrderNo( source.getBizOrderNo() );

        return target;
    }
}
