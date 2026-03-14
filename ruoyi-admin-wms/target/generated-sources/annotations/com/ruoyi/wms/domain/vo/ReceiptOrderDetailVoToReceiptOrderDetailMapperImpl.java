package com.ruoyi.wms.domain.vo;

import com.ruoyi.wms.domain.entity.ReceiptOrderDetail;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-13T16:38:17+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.9 (Oracle Corporation)"
)
@Component
public class ReceiptOrderDetailVoToReceiptOrderDetailMapperImpl implements ReceiptOrderDetailVoToReceiptOrderDetailMapper {

    @Override
    public ReceiptOrderDetail convert(ReceiptOrderDetailVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ReceiptOrderDetail receiptOrderDetail = new ReceiptOrderDetail();

        receiptOrderDetail.setId( arg0.getId() );
        receiptOrderDetail.setOrderId( arg0.getOrderId() );
        receiptOrderDetail.setSkuId( arg0.getSkuId() );
        receiptOrderDetail.setQuantity( arg0.getQuantity() );
        receiptOrderDetail.setAmount( arg0.getAmount() );
        receiptOrderDetail.setRemark( arg0.getRemark() );
        receiptOrderDetail.setWarehouseId( arg0.getWarehouseId() );

        return receiptOrderDetail;
    }

    @Override
    public ReceiptOrderDetail convert(ReceiptOrderDetailVo source, ReceiptOrderDetail target) {
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

        return target;
    }
}
