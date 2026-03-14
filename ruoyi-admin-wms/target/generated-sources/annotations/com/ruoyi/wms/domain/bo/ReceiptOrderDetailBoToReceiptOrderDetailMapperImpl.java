package com.ruoyi.wms.domain.bo;

import com.ruoyi.wms.domain.entity.ReceiptOrderDetail;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-13T16:38:17+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.9 (Oracle Corporation)"
)
@Component
public class ReceiptOrderDetailBoToReceiptOrderDetailMapperImpl implements ReceiptOrderDetailBoToReceiptOrderDetailMapper {

    @Override
    public ReceiptOrderDetail convert(ReceiptOrderDetailBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ReceiptOrderDetail receiptOrderDetail = new ReceiptOrderDetail();

        receiptOrderDetail.setSearchValue( arg0.getSearchValue() );
        receiptOrderDetail.setCreateBy( arg0.getCreateBy() );
        receiptOrderDetail.setCreateTime( arg0.getCreateTime() );
        receiptOrderDetail.setUpdateBy( arg0.getUpdateBy() );
        receiptOrderDetail.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            receiptOrderDetail.setParams( new LinkedHashMap<String, Object>( map ) );
        }
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
    public ReceiptOrderDetail convert(ReceiptOrderDetailBo source, ReceiptOrderDetail target) {
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
        target.setOrderId( source.getOrderId() );
        target.setSkuId( source.getSkuId() );
        target.setQuantity( source.getQuantity() );
        target.setAmount( source.getAmount() );
        target.setRemark( source.getRemark() );
        target.setWarehouseId( source.getWarehouseId() );

        return target;
    }
}
