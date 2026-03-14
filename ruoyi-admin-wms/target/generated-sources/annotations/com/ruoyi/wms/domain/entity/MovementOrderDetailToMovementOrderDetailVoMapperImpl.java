package com.ruoyi.wms.domain.entity;

import com.ruoyi.wms.domain.vo.MovementOrderDetailVo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-13T16:38:16+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.9 (Oracle Corporation)"
)
@Component
public class MovementOrderDetailToMovementOrderDetailVoMapperImpl implements MovementOrderDetailToMovementOrderDetailVoMapper {

    @Override
    public MovementOrderDetailVo convert(MovementOrderDetail arg0) {
        if ( arg0 == null ) {
            return null;
        }

        MovementOrderDetailVo movementOrderDetailVo = new MovementOrderDetailVo();

        movementOrderDetailVo.setId( arg0.getId() );
        movementOrderDetailVo.setOrderId( arg0.getOrderId() );
        movementOrderDetailVo.setSkuId( arg0.getSkuId() );
        movementOrderDetailVo.setQuantity( arg0.getQuantity() );
        movementOrderDetailVo.setAmount( arg0.getAmount() );
        movementOrderDetailVo.setRemark( arg0.getRemark() );
        movementOrderDetailVo.setSourceWarehouseId( arg0.getSourceWarehouseId() );
        movementOrderDetailVo.setTargetWarehouseId( arg0.getTargetWarehouseId() );

        return movementOrderDetailVo;
    }

    @Override
    public MovementOrderDetailVo convert(MovementOrderDetail source, MovementOrderDetailVo target) {
        if ( source == null ) {
            return target;
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
