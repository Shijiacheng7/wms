package com.ruoyi.wms.domain.vo;

import com.ruoyi.wms.domain.entity.MovementOrderDetail;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-13T16:38:15+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.9 (Oracle Corporation)"
)
@Component
public class MovementOrderDetailVoToMovementOrderDetailMapperImpl implements MovementOrderDetailVoToMovementOrderDetailMapper {

    @Override
    public MovementOrderDetail convert(MovementOrderDetailVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        MovementOrderDetail movementOrderDetail = new MovementOrderDetail();

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
    public MovementOrderDetail convert(MovementOrderDetailVo source, MovementOrderDetail target) {
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
