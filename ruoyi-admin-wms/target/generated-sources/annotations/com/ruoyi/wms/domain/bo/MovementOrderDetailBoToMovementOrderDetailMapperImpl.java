package com.ruoyi.wms.domain.bo;

import com.ruoyi.wms.domain.entity.MovementOrderDetail;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-06T21:50:28+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class MovementOrderDetailBoToMovementOrderDetailMapperImpl implements MovementOrderDetailBoToMovementOrderDetailMapper {

    @Override
    public MovementOrderDetail convert(MovementOrderDetailBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        MovementOrderDetail movementOrderDetail = new MovementOrderDetail();

        movementOrderDetail.setSearchValue( arg0.getSearchValue() );
        movementOrderDetail.setCreateBy( arg0.getCreateBy() );
        movementOrderDetail.setCreateTime( arg0.getCreateTime() );
        movementOrderDetail.setUpdateBy( arg0.getUpdateBy() );
        movementOrderDetail.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            movementOrderDetail.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        movementOrderDetail.setId( arg0.getId() );
        movementOrderDetail.setOrderId( arg0.getOrderId() );
        movementOrderDetail.setSkuId( arg0.getSkuId() );
        movementOrderDetail.setQuantity( arg0.getQuantity() );
        movementOrderDetail.setAmount( arg0.getAmount() );
        movementOrderDetail.setRemark( arg0.getRemark() );
        movementOrderDetail.setSourceWarehouseId( arg0.getSourceWarehouseId() );
        movementOrderDetail.setTargetWarehouseId( arg0.getTargetWarehouseId() );

        return movementOrderDetail;
    }

    @Override
    public MovementOrderDetail convert(MovementOrderDetailBo source, MovementOrderDetail target) {
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
        target.setSourceWarehouseId( source.getSourceWarehouseId() );
        target.setTargetWarehouseId( source.getTargetWarehouseId() );

        return target;
    }
}
