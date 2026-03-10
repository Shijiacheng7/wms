package com.ruoyi.wms.domain.vo;

import com.ruoyi.wms.domain.entity.InventoryHistory;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-06T21:50:27+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class InventoryHistoryVoToInventoryHistoryMapperImpl implements InventoryHistoryVoToInventoryHistoryMapper {

    @Override
    public InventoryHistory convert(InventoryHistoryVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        InventoryHistory inventoryHistory = new InventoryHistory();

        inventoryHistory.setCreateTime( arg0.getCreateTime() );
        inventoryHistory.setId( arg0.getId() );
        inventoryHistory.setOrderId( arg0.getOrderId() );
        inventoryHistory.setOrderNo( arg0.getOrderNo() );
        inventoryHistory.setOrderType( arg0.getOrderType() );
        inventoryHistory.setSkuId( arg0.getSkuId() );
        inventoryHistory.setAmount( arg0.getAmount() );
        inventoryHistory.setQuantity( arg0.getQuantity() );
        inventoryHistory.setBeforeQuantity( arg0.getBeforeQuantity() );
        inventoryHistory.setAfterQuantity( arg0.getAfterQuantity() );
        inventoryHistory.setRemark( arg0.getRemark() );
        inventoryHistory.setWarehouseId( arg0.getWarehouseId() );

        return inventoryHistory;
    }

    @Override
    public InventoryHistory convert(InventoryHistoryVo source, InventoryHistory target) {
        if ( source == null ) {
            return target;
        }

        target.setCreateTime( source.getCreateTime() );
        target.setId( source.getId() );
        target.setOrderId( source.getOrderId() );
        target.setOrderNo( source.getOrderNo() );
        target.setOrderType( source.getOrderType() );
        target.setSkuId( source.getSkuId() );
        target.setAmount( source.getAmount() );
        target.setQuantity( source.getQuantity() );
        target.setBeforeQuantity( source.getBeforeQuantity() );
        target.setAfterQuantity( source.getAfterQuantity() );
        target.setRemark( source.getRemark() );
        target.setWarehouseId( source.getWarehouseId() );

        return target;
    }
}
