package com.ruoyi.wms.domain.entity;

import com.ruoyi.wms.domain.vo.InventoryVo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-06T21:50:27+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class InventoryToInventoryVoMapperImpl implements InventoryToInventoryVoMapper {

    @Override
    public InventoryVo convert(Inventory arg0) {
        if ( arg0 == null ) {
            return null;
        }

        InventoryVo inventoryVo = new InventoryVo();

        inventoryVo.setId( arg0.getId() );
        inventoryVo.setSkuId( arg0.getSkuId() );
        inventoryVo.setWarehouseId( arg0.getWarehouseId() );
        inventoryVo.setQuantity( arg0.getQuantity() );
        inventoryVo.setRemark( arg0.getRemark() );

        return inventoryVo;
    }

    @Override
    public InventoryVo convert(Inventory source, InventoryVo target) {
        if ( source == null ) {
            return target;
        }

        target.setId( source.getId() );
        target.setSkuId( source.getSkuId() );
        target.setWarehouseId( source.getWarehouseId() );
        target.setQuantity( source.getQuantity() );
        target.setRemark( source.getRemark() );

        return target;
    }
}
