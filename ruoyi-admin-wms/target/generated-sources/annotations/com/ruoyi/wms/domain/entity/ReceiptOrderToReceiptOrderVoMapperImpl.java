package com.ruoyi.wms.domain.entity;

import com.ruoyi.wms.domain.vo.ReceiptOrderVo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-13T16:38:15+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.9 (Oracle Corporation)"
)
@Component
public class ReceiptOrderToReceiptOrderVoMapperImpl implements ReceiptOrderToReceiptOrderVoMapper {

    @Override
    public ReceiptOrderVo convert(ReceiptOrder arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ReceiptOrderVo receiptOrderVo = new ReceiptOrderVo();

        receiptOrderVo.setCreateBy( arg0.getCreateBy() );
        receiptOrderVo.setCreateTime( arg0.getCreateTime() );
        receiptOrderVo.setUpdateBy( arg0.getUpdateBy() );
        receiptOrderVo.setUpdateTime( arg0.getUpdateTime() );
        receiptOrderVo.setId( arg0.getId() );
        receiptOrderVo.setOrderNo( arg0.getOrderNo() );
        receiptOrderVo.setTotalQuantity( arg0.getTotalQuantity() );
        receiptOrderVo.setTotalAmount( arg0.getTotalAmount() );
        receiptOrderVo.setOrderStatus( arg0.getOrderStatus() );
        receiptOrderVo.setWarehouseId( arg0.getWarehouseId() );
        receiptOrderVo.setRemark( arg0.getRemark() );
        receiptOrderVo.setOptType( arg0.getOptType() );
        receiptOrderVo.setMerchantId( arg0.getMerchantId() );
        receiptOrderVo.setBizOrderNo( arg0.getBizOrderNo() );

        return receiptOrderVo;
    }

    @Override
    public ReceiptOrderVo convert(ReceiptOrder source, ReceiptOrderVo target) {
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
        target.setOptType( source.getOptType() );
        target.setMerchantId( source.getMerchantId() );
        target.setBizOrderNo( source.getBizOrderNo() );

        return target;
    }
}
