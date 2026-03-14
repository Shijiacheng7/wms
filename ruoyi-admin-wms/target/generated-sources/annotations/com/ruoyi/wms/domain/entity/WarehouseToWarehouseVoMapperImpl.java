package com.ruoyi.wms.domain.entity;

import com.ruoyi.wms.domain.vo.WarehouseVo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-13T16:38:15+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.9 (Oracle Corporation)"
)
@Component
public class WarehouseToWarehouseVoMapperImpl implements WarehouseToWarehouseVoMapper {

    @Override
    public WarehouseVo convert(Warehouse arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WarehouseVo warehouseVo = new WarehouseVo();

        warehouseVo.setCreateBy( arg0.getCreateBy() );
        warehouseVo.setCreateTime( arg0.getCreateTime() );
        warehouseVo.setUpdateBy( arg0.getUpdateBy() );
        warehouseVo.setUpdateTime( arg0.getUpdateTime() );
        warehouseVo.setId( arg0.getId() );
        warehouseVo.setWarehouseCode( arg0.getWarehouseCode() );
        warehouseVo.setWarehouseName( arg0.getWarehouseName() );
        warehouseVo.setOrderNum( arg0.getOrderNum() );
        warehouseVo.setRemark( arg0.getRemark() );

        return warehouseVo;
    }

    @Override
    public WarehouseVo convert(Warehouse source, WarehouseVo target) {
        if ( source == null ) {
            return target;
        }

        target.setCreateBy( source.getCreateBy() );
        target.setCreateTime( source.getCreateTime() );
        target.setUpdateBy( source.getUpdateBy() );
        target.setUpdateTime( source.getUpdateTime() );
        target.setId( source.getId() );
        target.setWarehouseCode( source.getWarehouseCode() );
        target.setWarehouseName( source.getWarehouseName() );
        target.setOrderNum( source.getOrderNum() );
        target.setRemark( source.getRemark() );

        return target;
    }
}
