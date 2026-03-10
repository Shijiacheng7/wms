package com.ruoyi.wms.domain.entity;

import com.ruoyi.wms.domain.vo.CheckOrderVo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-06T21:50:28+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class CheckOrderToCheckOrderVoMapperImpl implements CheckOrderToCheckOrderVoMapper {

    @Override
    public CheckOrderVo convert(CheckOrder arg0) {
        if ( arg0 == null ) {
            return null;
        }

        CheckOrderVo checkOrderVo = new CheckOrderVo();

        checkOrderVo.setCreateBy( arg0.getCreateBy() );
        checkOrderVo.setCreateTime( arg0.getCreateTime() );
        checkOrderVo.setUpdateBy( arg0.getUpdateBy() );
        checkOrderVo.setUpdateTime( arg0.getUpdateTime() );
        checkOrderVo.setId( arg0.getId() );
        checkOrderVo.setOrderNo( arg0.getOrderNo() );
        checkOrderVo.setTotalQuantity( arg0.getTotalQuantity() );
        checkOrderVo.setTotalAmount( arg0.getTotalAmount() );
        checkOrderVo.setOrderStatus( arg0.getOrderStatus() );
        checkOrderVo.setWarehouseId( arg0.getWarehouseId() );
        checkOrderVo.setRemark( arg0.getRemark() );

        return checkOrderVo;
    }

    @Override
    public CheckOrderVo convert(CheckOrder source, CheckOrderVo target) {
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

        return target;
    }
}
