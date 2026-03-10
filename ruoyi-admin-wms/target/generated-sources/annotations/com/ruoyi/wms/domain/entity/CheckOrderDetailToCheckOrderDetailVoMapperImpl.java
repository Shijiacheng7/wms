package com.ruoyi.wms.domain.entity;

import com.ruoyi.wms.domain.vo.CheckOrderDetailVo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-06T21:50:28+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class CheckOrderDetailToCheckOrderDetailVoMapperImpl implements CheckOrderDetailToCheckOrderDetailVoMapper {

    @Override
    public CheckOrderDetailVo convert(CheckOrderDetail arg0) {
        if ( arg0 == null ) {
            return null;
        }

        CheckOrderDetailVo checkOrderDetailVo = new CheckOrderDetailVo();

        checkOrderDetailVo.setId( arg0.getId() );
        checkOrderDetailVo.setOrderId( arg0.getOrderId() );
        checkOrderDetailVo.setSkuId( arg0.getSkuId() );
        checkOrderDetailVo.setQuantity( arg0.getQuantity() );
        checkOrderDetailVo.setAmount( arg0.getAmount() );
        checkOrderDetailVo.setRemark( arg0.getRemark() );
        checkOrderDetailVo.setWarehouseId( arg0.getWarehouseId() );
        checkOrderDetailVo.setCheckQuantity( arg0.getCheckQuantity() );
        checkOrderDetailVo.setInventoryId( arg0.getInventoryId() );

        return checkOrderDetailVo;
    }

    @Override
    public CheckOrderDetailVo convert(CheckOrderDetail source, CheckOrderDetailVo target) {
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
        target.setCheckQuantity( source.getCheckQuantity() );
        target.setInventoryId( source.getInventoryId() );

        return target;
    }
}
