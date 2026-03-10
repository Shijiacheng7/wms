package com.ruoyi.wms.domain.bo;

import com.ruoyi.wms.domain.entity.CheckOrder;
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
public class CheckOrderBoToCheckOrderMapperImpl implements CheckOrderBoToCheckOrderMapper {

    @Override
    public CheckOrder convert(CheckOrderBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        CheckOrder checkOrder = new CheckOrder();

        checkOrder.setSearchValue( arg0.getSearchValue() );
        checkOrder.setCreateBy( arg0.getCreateBy() );
        checkOrder.setCreateTime( arg0.getCreateTime() );
        checkOrder.setUpdateBy( arg0.getUpdateBy() );
        checkOrder.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            checkOrder.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        checkOrder.setId( arg0.getId() );
        checkOrder.setOrderNo( arg0.getOrderNo() );
        checkOrder.setTotalQuantity( arg0.getTotalQuantity() );
        checkOrder.setTotalAmount( arg0.getTotalAmount() );
        checkOrder.setOrderStatus( arg0.getOrderStatus() );
        checkOrder.setRemark( arg0.getRemark() );
        checkOrder.setWarehouseId( arg0.getWarehouseId() );

        return checkOrder;
    }

    @Override
    public CheckOrder convert(CheckOrderBo source, CheckOrder target) {
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

        return target;
    }
}
