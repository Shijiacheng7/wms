package com.ruoyi.wms.domain.bo;

import com.ruoyi.wms.domain.entity.ReceiptOrder;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-06T21:50:28+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class ReceiptOrderBoToReceiptOrderMapperImpl implements ReceiptOrderBoToReceiptOrderMapper {

    @Override
    public ReceiptOrder convert(ReceiptOrderBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ReceiptOrder receiptOrder = new ReceiptOrder();

        receiptOrder.setSearchValue( arg0.getSearchValue() );
        receiptOrder.setCreateBy( arg0.getCreateBy() );
        receiptOrder.setCreateTime( arg0.getCreateTime() );
        receiptOrder.setUpdateBy( arg0.getUpdateBy() );
        receiptOrder.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            receiptOrder.setParams( new LinkedHashMap<String, Object>( map ) );
        }
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
    public ReceiptOrder convert(ReceiptOrderBo source, ReceiptOrder target) {
        if ( source == null ) {
            return target;
        }

        target.setSearchValue( source.getSearchValue() );
        target.setCreateBy( source.getCreateBy() );
        target.setCreateTime( source.getCreateTime() );
        target.setUpdateBy( source.getUpdateBy() );
        target.setUpdateTime( source.getUpdateTime() );
        if ( target.getParams() != null ) {
            Map<String, Object> map = source.getParams();
            if ( map != null ) {
                target.getParams().clear();
                target.getParams().putAll( map );
            }
            else {
                target.setParams( null );
            }
        }
        else {
            Map<String, Object> map = source.getParams();
            if ( map != null ) {
                target.setParams( new LinkedHashMap<String, Object>( map ) );
            }
        }
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
