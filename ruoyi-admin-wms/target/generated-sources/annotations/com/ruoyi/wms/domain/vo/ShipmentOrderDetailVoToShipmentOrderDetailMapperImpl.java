package com.ruoyi.wms.domain.vo;

import com.ruoyi.wms.domain.entity.ShipmentOrderDetail;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-13T16:38:17+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.9 (Oracle Corporation)"
)
@Component
public class ShipmentOrderDetailVoToShipmentOrderDetailMapperImpl implements ShipmentOrderDetailVoToShipmentOrderDetailMapper {

    @Override
    public ShipmentOrderDetail convert(ShipmentOrderDetailVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ShipmentOrderDetail shipmentOrderDetail = new ShipmentOrderDetail();

        shipmentOrderDetail.setId( arg0.getId() );
        shipmentOrderDetail.setOrderId( arg0.getOrderId() );
        shipmentOrderDetail.setSkuId( arg0.getSkuId() );
        shipmentOrderDetail.setQuantity( arg0.getQuantity() );
        shipmentOrderDetail.setAmount( arg0.getAmount() );
        shipmentOrderDetail.setRemark( arg0.getRemark() );
        shipmentOrderDetail.setWarehouseId( arg0.getWarehouseId() );

        return shipmentOrderDetail;
    }

    @Override
    public ShipmentOrderDetail convert(ShipmentOrderDetailVo source, ShipmentOrderDetail target) {
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
