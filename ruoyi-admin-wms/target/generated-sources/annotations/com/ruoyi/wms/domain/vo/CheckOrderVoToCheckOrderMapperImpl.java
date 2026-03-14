package com.ruoyi.wms.domain.vo;

import com.ruoyi.wms.domain.entity.CheckOrder;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-13T16:38:17+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.9 (Oracle Corporation)"
)
@Component
public class CheckOrderVoToCheckOrderMapperImpl implements CheckOrderVoToCheckOrderMapper {

    @Override
    public CheckOrder convert(CheckOrderVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        CheckOrder checkOrder = new CheckOrder();

        checkOrder.setCreateBy( arg0.getCreateBy() );
        checkOrder.setCreateTime( arg0.getCreateTime() );
        checkOrder.setUpdateBy( arg0.getUpdateBy() );
        checkOrder.setUpdateTime( arg0.getUpdateTime() );
        checkOrder.setId( arg0.getId() );
        checkOrder.setOrderNo( arg0.getOrderNo() );
        checkOrder.setTotalQuantity( arg0.getTotalQuantity() );
        checkOrder.setTotalAmount( arg0.getTotalAmount() );
        checkOrder.setOrderStatus( arg0.getOrderStatus() );
        checkOrder.setRemark( arg0.getRemark() );
        checkOrder.setWarehouseId( arg0.getWarehouseId() );

        return checkOrder;
    }

    @Override
    public CheckOrder convert(CheckOrderVo source, CheckOrder target) {
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

        return target;
    }
}
