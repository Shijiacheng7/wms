package com.ruoyi.wms.domain.bo;

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
public class ShipmentOrderDetailBoToInventoryBoMapperImpl implements ShipmentOrderDetailBoToInventoryBoMapper {

    @Override
    public InventoryBo convert(ShipmentOrderDetailBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        InventoryBo inventoryBo = new InventoryBo();

        inventoryBo.setSearchValue( arg0.getSearchValue() );
        inventoryBo.setCreateBy( arg0.getCreateBy() );
        inventoryBo.setCreateTime( arg0.getCreateTime() );
        inventoryBo.setUpdateBy( arg0.getUpdateBy() );
        inventoryBo.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            inventoryBo.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        inventoryBo.setId( arg0.getId() );
        inventoryBo.setSkuId( arg0.getSkuId() );
        inventoryBo.setWarehouseId( arg0.getWarehouseId() );
        inventoryBo.setQuantity( arg0.getQuantity() );
        inventoryBo.setRemark( arg0.getRemark() );

        return inventoryBo;
    }

    @Override
    public InventoryBo convert(ShipmentOrderDetailBo source, InventoryBo target) {
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
