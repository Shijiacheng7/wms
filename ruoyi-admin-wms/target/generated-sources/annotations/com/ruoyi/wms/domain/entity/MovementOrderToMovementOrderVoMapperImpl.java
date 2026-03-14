package com.ruoyi.wms.domain.entity;

import com.ruoyi.wms.domain.vo.MovementOrderVo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-13T16:38:16+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.9 (Oracle Corporation)"
)
@Component
public class MovementOrderToMovementOrderVoMapperImpl implements MovementOrderToMovementOrderVoMapper {

    @Override
    public MovementOrderVo convert(MovementOrder arg0) {
        if ( arg0 == null ) {
            return null;
        }

        MovementOrderVo movementOrderVo = new MovementOrderVo();

        movementOrderVo.setCreateBy( arg0.getCreateBy() );
        movementOrderVo.setCreateTime( arg0.getCreateTime() );
        movementOrderVo.setUpdateBy( arg0.getUpdateBy() );
        movementOrderVo.setUpdateTime( arg0.getUpdateTime() );
        movementOrderVo.setId( arg0.getId() );
        movementOrderVo.setOrderNo( arg0.getOrderNo() );
        movementOrderVo.setTotalQuantity( arg0.getTotalQuantity() );
        movementOrderVo.setTotalAmount( arg0.getTotalAmount() );
        movementOrderVo.setOrderStatus( arg0.getOrderStatus() );
        movementOrderVo.setRemark( arg0.getRemark() );
        movementOrderVo.setSourceWarehouseId( arg0.getSourceWarehouseId() );
        movementOrderVo.setTargetWarehouseId( arg0.getTargetWarehouseId() );

        return movementOrderVo;
    }

    @Override
    public MovementOrderVo convert(MovementOrder source, MovementOrderVo target) {
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
