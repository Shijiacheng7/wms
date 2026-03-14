package com.ruoyi.wms.domain.entity;

import com.ruoyi.wms.domain.vo.InventoryHistoryVo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-13T16:38:15+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.9 (Oracle Corporation)"
)
@Component
public class InventoryHistoryToInventoryHistoryVoMapperImpl implements InventoryHistoryToInventoryHistoryVoMapper {

    @Override
    public InventoryHistoryVo convert(InventoryHistory arg0) {
        if ( arg0 == null ) {
            return null;
        }

        InventoryHistoryVo inventoryHistoryVo = new InventoryHistoryVo();

        inventoryHistoryVo.setId( arg0.getId() );
        inventoryHistoryVo.setOrderId( arg0.getOrderId() );
        inventoryHistoryVo.setOrderNo( arg0.getOrderNo() );
        inventoryHistoryVo.setOrderType( arg0.getOrderType() );
        inventoryHistoryVo.setSkuId( arg0.getSkuId() );
        inventoryHistoryVo.setAmount( arg0.getAmount() );
        inventoryHistoryVo.setQuantity( arg0.getQuantity() );
        inventoryHistoryVo.setRemark( arg0.getRemark() );
        inventoryHistoryVo.setWarehouseId( arg0.getWarehouseId() );
        inventoryHistoryVo.setBeforeQuantity( arg0.getBeforeQuantity() );
        inventoryHistoryVo.setAfterQuantity( arg0.getAfterQuantity() );
        inventoryHistoryVo.setCreateTime( arg0.getCreateTime() );

        return inventoryHistoryVo;
    }

    @Override
    public InventoryHistoryVo convert(InventoryHistory source, InventoryHistoryVo target) {
        if ( source == null ) {
            return target;
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
        target.setBeforeQuantity( source.getBeforeQuantity() );
        target.setAfterQuantity( source.getAfterQuantity() );
        target.setCreateTime( source.getCreateTime() );

        return target;
    }
}
