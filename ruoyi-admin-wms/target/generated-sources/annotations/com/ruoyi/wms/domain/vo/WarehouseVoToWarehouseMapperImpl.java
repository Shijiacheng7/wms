package com.ruoyi.wms.domain.vo;

import com.ruoyi.wms.domain.entity.Warehouse;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-06T21:50:27+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class WarehouseVoToWarehouseMapperImpl implements WarehouseVoToWarehouseMapper {

    @Override
    public Warehouse convert(WarehouseVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Warehouse warehouse = new Warehouse();

        warehouse.setCreateBy( arg0.getCreateBy() );
        warehouse.setCreateTime( arg0.getCreateTime() );
        warehouse.setUpdateBy( arg0.getUpdateBy() );
        warehouse.setUpdateTime( arg0.getUpdateTime() );
        warehouse.setId( arg0.getId() );
        warehouse.setWarehouseCode( arg0.getWarehouseCode() );
        warehouse.setWarehouseName( arg0.getWarehouseName() );
        warehouse.setOrderNum( arg0.getOrderNum() );
        warehouse.setRemark( arg0.getRemark() );

        return warehouse;
    }

    @Override
    public Warehouse convert(WarehouseVo source, Warehouse target) {
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
