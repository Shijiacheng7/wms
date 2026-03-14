package com.ruoyi.wms.domain.vo;

import com.ruoyi.wms.domain.entity.Inventory;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-13T16:38:17+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.9 (Oracle Corporation)"
)
@Component
public class InventoryVoToInventoryMapperImpl implements InventoryVoToInventoryMapper {

    @Override
    public Inventory convert(InventoryVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Inventory inventory = new Inventory();

        inventory.setId( arg0.getId() );
        inventory.setSkuId( arg0.getSkuId() );
        inventory.setWarehouseId( arg0.getWarehouseId() );
        inventory.setQuantity( arg0.getQuantity() );
        inventory.setRemark( arg0.getRemark() );

        return inventory;
    }

    @Override
    public Inventory convert(InventoryVo source, Inventory target) {
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
