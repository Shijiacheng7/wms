package com.ruoyi.wms.domain.bo;

import com.ruoyi.wms.domain.entity.Inventory;
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
public class MovementOrderDetailBoToInventoryMapperImpl implements MovementOrderDetailBoToInventoryMapper {

    @Override
    public Inventory convert(MovementOrderDetailBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Inventory inventory = new Inventory();

        inventory.setSearchValue( arg0.getSearchValue() );
        inventory.setCreateBy( arg0.getCreateBy() );
        inventory.setCreateTime( arg0.getCreateTime() );
        inventory.setUpdateBy( arg0.getUpdateBy() );
        inventory.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            inventory.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        inventory.setId( arg0.getId() );
        inventory.setSkuId( arg0.getSkuId() );
        inventory.setWarehouseId( arg0.getWarehouseId() );
        inventory.setQuantity( arg0.getQuantity() );
        inventory.setRemark( arg0.getRemark() );

        return inventory;
    }

    @Override
    public Inventory convert(MovementOrderDetailBo source, Inventory target) {
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
        target.setSkuId( source.getSkuId() );
        target.setWarehouseId( source.getWarehouseId() );
        target.setQuantity( source.getQuantity() );
        target.setRemark( source.getRemark() );

        return target;
    }
}
