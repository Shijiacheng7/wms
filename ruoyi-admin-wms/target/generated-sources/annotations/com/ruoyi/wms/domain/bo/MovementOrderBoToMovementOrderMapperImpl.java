package com.ruoyi.wms.domain.bo;

import com.ruoyi.wms.domain.entity.MovementOrder;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-06T21:50:27+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class MovementOrderBoToMovementOrderMapperImpl implements MovementOrderBoToMovementOrderMapper {

    @Override
    public MovementOrder convert(MovementOrderBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        MovementOrder movementOrder = new MovementOrder();

        movementOrder.setSearchValue( arg0.getSearchValue() );
        movementOrder.setCreateBy( arg0.getCreateBy() );
        movementOrder.setCreateTime( arg0.getCreateTime() );
        movementOrder.setUpdateBy( arg0.getUpdateBy() );
        movementOrder.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            movementOrder.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        movementOrder.setId( arg0.getId() );
        movementOrder.setOrderNo( arg0.getOrderNo() );
        movementOrder.setTotalQuantity( arg0.getTotalQuantity() );
        movementOrder.setTotalAmount( arg0.getTotalAmount() );
        movementOrder.setOrderStatus( arg0.getOrderStatus() );
        movementOrder.setRemark( arg0.getRemark() );
        movementOrder.setSourceWarehouseId( arg0.getSourceWarehouseId() );
        movementOrder.setTargetWarehouseId( arg0.getTargetWarehouseId() );

        return movementOrder;
    }

    @Override
    public MovementOrder convert(MovementOrderBo source, MovementOrder target) {
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
        target.setOrderNo( source.getOrderNo() );
        target.setTotalQuantity( source.getTotalQuantity() );
        target.setTotalAmount( source.getTotalAmount() );
        target.setOrderStatus( source.getOrderStatus() );
        target.setRemark( source.getRemark() );
        target.setSourceWarehouseId( source.getSourceWarehouseId() );
        target.setTargetWarehouseId( source.getTargetWarehouseId() );

        return target;
    }
}
