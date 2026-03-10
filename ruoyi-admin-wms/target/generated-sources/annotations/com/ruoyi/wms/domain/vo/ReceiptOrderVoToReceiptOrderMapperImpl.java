package com.ruoyi.wms.domain.vo;

import com.ruoyi.wms.domain.entity.ReceiptOrder;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-06T21:50:27+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class ReceiptOrderVoToReceiptOrderMapperImpl implements ReceiptOrderVoToReceiptOrderMapper {

    @Override
    public ReceiptOrder convert(ReceiptOrderVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ReceiptOrder receiptOrder = new ReceiptOrder();

        receiptOrder.setCreateBy( arg0.getCreateBy() );
        receiptOrder.setCreateTime( arg0.getCreateTime() );
        receiptOrder.setUpdateBy( arg0.getUpdateBy() );
        receiptOrder.setUpdateTime( arg0.getUpdateTime() );
        receiptOrder.setId( arg0.getId() );
        receiptOrder.setOrderNo( arg0.getOrderNo() );
        receiptOrder.setTotalQuantity( arg0.getTotalQuantity() );
        receiptOrder.setTotalAmount( arg0.getTotalAmount() );
        receiptOrder.setOrderStatus( arg0.getOrderStatus() );
        receiptOrder.setRemark( arg0.getRemark() );
        receiptOrder.setWarehouseId( arg0.getWarehouseId() );
        receiptOrder.setOptType( arg0.getOptType() );
        receiptOrder.setBizOrderNo( arg0.getBizOrderNo() );
        receiptOrder.setMerchantId( arg0.getMerchantId() );

        return receiptOrder;
    }

    @Override
    public ReceiptOrder convert(ReceiptOrderVo source, ReceiptOrder target) {
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
        target.setOptType( source.getOptType() );
        target.setBizOrderNo( source.getBizOrderNo() );
        target.setMerchantId( source.getMerchantId() );

        return target;
    }
}
