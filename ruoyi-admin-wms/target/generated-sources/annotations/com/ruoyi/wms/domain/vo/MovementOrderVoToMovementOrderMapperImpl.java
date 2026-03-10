package com.ruoyi.wms.domain.vo;

import com.ruoyi.wms.domain.entity.MovementOrder;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-06T21:50:27+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class MovementOrderVoToMovementOrderMapperImpl implements MovementOrderVoToMovementOrderMapper {

    @Override
    public MovementOrder convert(MovementOrderVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        MovementOrder movementOrder = new MovementOrder();

        movementOrder.setCreateBy( arg0.getCreateBy() );
        movementOrder.setCreateTime( arg0.getCreateTime() );
        movementOrder.setUpdateBy( arg0.getUpdateBy() );
        movementOrder.setUpdateTime( arg0.getUpdateTime() );
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
    public MovementOrder convert(MovementOrderVo source, MovementOrder target) {
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
        target.setSourceWarehouseId( source.getSourceWarehouseId() );
        target.setTargetWarehouseId( source.getTargetWarehouseId() );

        return target;
    }
}
