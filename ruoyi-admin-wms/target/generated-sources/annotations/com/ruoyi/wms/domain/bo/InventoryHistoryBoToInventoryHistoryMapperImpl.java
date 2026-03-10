package com.ruoyi.wms.domain.bo;

import com.ruoyi.wms.domain.entity.InventoryHistory;
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
public class InventoryHistoryBoToInventoryHistoryMapperImpl implements InventoryHistoryBoToInventoryHistoryMapper {

    @Override
    public InventoryHistory convert(InventoryHistoryBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        InventoryHistory inventoryHistory = new InventoryHistory();

        inventoryHistory.setCreateTime( arg0.getCreateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            inventoryHistory.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        inventoryHistory.setId( arg0.getId() );
        inventoryHistory.setOrderId( arg0.getOrderId() );
        inventoryHistory.setOrderNo( arg0.getOrderNo() );
        inventoryHistory.setOrderType( arg0.getOrderType() );
        inventoryHistory.setSkuId( arg0.getSkuId() );
        inventoryHistory.setAmount( arg0.getAmount() );
        inventoryHistory.setQuantity( arg0.getQuantity() );
        inventoryHistory.setRemark( arg0.getRemark() );
        inventoryHistory.setWarehouseId( arg0.getWarehouseId() );

        return inventoryHistory;
    }

    @Override
    public InventoryHistory convert(InventoryHistoryBo source, InventoryHistory target) {
        if ( source == null ) {
            return target;
        }

        target.setCreateTime( source.getCreateTime() );
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
        target.setOrderNo( source.getOrderNo() );
        target.setOrderType( source.getOrderType() );
        target.setSkuId( source.getSkuId() );
        target.setAmount( source.getAmount() );
        target.setQuantity( source.getQuantity() );
        target.setRemark( source.getRemark() );
        target.setWarehouseId( source.getWarehouseId() );

        return target;
    }
}
