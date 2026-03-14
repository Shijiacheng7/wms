package com.ruoyi.wms.domain.bo;

import com.ruoyi.wms.domain.entity.ShipmentOrderDetail;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-13T16:38:16+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.9 (Oracle Corporation)"
)
@Component
public class ShipmentOrderDetailBoToShipmentOrderDetailMapperImpl implements ShipmentOrderDetailBoToShipmentOrderDetailMapper {

    @Override
    public ShipmentOrderDetail convert(ShipmentOrderDetailBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ShipmentOrderDetail shipmentOrderDetail = new ShipmentOrderDetail();

        shipmentOrderDetail.setSearchValue( arg0.getSearchValue() );
        shipmentOrderDetail.setCreateBy( arg0.getCreateBy() );
        shipmentOrderDetail.setCreateTime( arg0.getCreateTime() );
        shipmentOrderDetail.setUpdateBy( arg0.getUpdateBy() );
        shipmentOrderDetail.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            shipmentOrderDetail.setParams( new LinkedHashMap<String, Object>( map ) );
        }
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
    public ShipmentOrderDetail convert(ShipmentOrderDetailBo source, ShipmentOrderDetail target) {
        if ( source == null ) {
            return target;
        }

        target.setSearchValue( source.getSearchValue() );
        target.setCreateBy( source.getCreateBy() );
        target.setCreateTime( source.getCreateTime() );
        target.setUpdateBy( source.getUpdateBy() );
        target.setUpdateTime( source.getUpdateTime() );
        if ( target.getParams() != null ) {
            Map<String, Object> map = source.getParams();
            if ( map != null ) {
                target.getParams().clear();
                target.getParams().putAll( map );
            }
            else {
                target.setParams( null );
            }
        }
        else {
            Map<String, Object> map = source.getParams();
            if ( map != null ) {
                target.setParams( new LinkedHashMap<String, Object>( map ) );
            }
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
