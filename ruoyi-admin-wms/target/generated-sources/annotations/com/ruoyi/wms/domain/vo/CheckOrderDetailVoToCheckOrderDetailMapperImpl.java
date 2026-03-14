package com.ruoyi.wms.domain.vo;

import com.ruoyi.wms.domain.entity.CheckOrderDetail;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-13T16:38:16+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.9 (Oracle Corporation)"
)
@Component
public class CheckOrderDetailVoToCheckOrderDetailMapperImpl implements CheckOrderDetailVoToCheckOrderDetailMapper {

    @Override
    public CheckOrderDetail convert(CheckOrderDetailVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        CheckOrderDetail checkOrderDetail = new CheckOrderDetail();

        checkOrderDetail.setId( arg0.getId() );
        checkOrderDetail.setOrderId( arg0.getOrderId() );
        checkOrderDetail.setSkuId( arg0.getSkuId() );
        checkOrderDetail.setQuantity( arg0.getQuantity() );
        checkOrderDetail.setAmount( arg0.getAmount() );
        checkOrderDetail.setRemark( arg0.getRemark() );
        checkOrderDetail.setCheckQuantity( arg0.getCheckQuantity() );
        checkOrderDetail.setWarehouseId( arg0.getWarehouseId() );
        checkOrderDetail.setInventoryId( arg0.getInventoryId() );

        return checkOrderDetail;
    }

    @Override
    public CheckOrderDetail convert(CheckOrderDetailVo source, CheckOrderDetail target) {
        if ( source == null ) {
            return target;
        }

        target.setId( source.getId() );
        target.setOrderId( source.getOrderId() );
        target.setSkuId( source.getSkuId() );
        target.setQuantity( source.getQuantity() );
        target.setAmount( source.getAmount() );
        target.setRemark( source.getRemark() );
        target.setCheckQuantity( source.getCheckQuantity() );
        target.setWarehouseId( source.getWarehouseId() );
        target.setInventoryId( source.getInventoryId() );

        return target;
    }
}
