package com.ruoyi.wms.domain.entity;

import com.ruoyi.wms.domain.vo.ReceiptOrderDetailVo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-06T21:50:28+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class ReceiptOrderDetailToReceiptOrderDetailVoMapperImpl implements ReceiptOrderDetailToReceiptOrderDetailVoMapper {

    @Override
    public ReceiptOrderDetailVo convert(ReceiptOrderDetail arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ReceiptOrderDetailVo receiptOrderDetailVo = new ReceiptOrderDetailVo();

        receiptOrderDetailVo.setId( arg0.getId() );
        receiptOrderDetailVo.setOrderId( arg0.getOrderId() );
        receiptOrderDetailVo.setSkuId( arg0.getSkuId() );
        receiptOrderDetailVo.setQuantity( arg0.getQuantity() );
        receiptOrderDetailVo.setAmount( arg0.getAmount() );
        receiptOrderDetailVo.setRemark( arg0.getRemark() );
        receiptOrderDetailVo.setWarehouseId( arg0.getWarehouseId() );

        return receiptOrderDetailVo;
    }

    @Override
    public ReceiptOrderDetailVo convert(ReceiptOrderDetail source, ReceiptOrderDetailVo target) {
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
