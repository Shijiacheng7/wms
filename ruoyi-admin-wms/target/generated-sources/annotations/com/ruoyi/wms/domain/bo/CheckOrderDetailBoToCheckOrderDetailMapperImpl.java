package com.ruoyi.wms.domain.bo;

import com.ruoyi.wms.domain.entity.CheckOrderDetail;
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
public class CheckOrderDetailBoToCheckOrderDetailMapperImpl implements CheckOrderDetailBoToCheckOrderDetailMapper {

    @Override
    public CheckOrderDetail convert(CheckOrderDetailBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        CheckOrderDetail checkOrderDetail = new CheckOrderDetail();

        checkOrderDetail.setSearchValue( arg0.getSearchValue() );
        checkOrderDetail.setCreateBy( arg0.getCreateBy() );
        checkOrderDetail.setCreateTime( arg0.getCreateTime() );
        checkOrderDetail.setUpdateBy( arg0.getUpdateBy() );
        checkOrderDetail.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            checkOrderDetail.setParams( new LinkedHashMap<String, Object>( map ) );
        }
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
    public CheckOrderDetail convert(CheckOrderDetailBo source, CheckOrderDetail target) {
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
        target.setCheckQuantity( source.getCheckQuantity() );
        target.setWarehouseId( source.getWarehouseId() );
        target.setInventoryId( source.getInventoryId() );

        return target;
    }
}
