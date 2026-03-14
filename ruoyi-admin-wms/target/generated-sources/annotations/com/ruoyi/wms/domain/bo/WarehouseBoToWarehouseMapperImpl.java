package com.ruoyi.wms.domain.bo;

import com.ruoyi.wms.domain.entity.Warehouse;
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
public class WarehouseBoToWarehouseMapperImpl implements WarehouseBoToWarehouseMapper {

    @Override
    public Warehouse convert(WarehouseBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Warehouse warehouse = new Warehouse();

        warehouse.setSearchValue( arg0.getSearchValue() );
        warehouse.setCreateBy( arg0.getCreateBy() );
        warehouse.setCreateTime( arg0.getCreateTime() );
        warehouse.setUpdateBy( arg0.getUpdateBy() );
        warehouse.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            warehouse.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        warehouse.setId( arg0.getId() );
        warehouse.setWarehouseCode( arg0.getWarehouseCode() );
        warehouse.setWarehouseName( arg0.getWarehouseName() );
        warehouse.setOrderNum( arg0.getOrderNum() );
        warehouse.setRemark( arg0.getRemark() );

        return warehouse;
    }

    @Override
    public Warehouse convert(WarehouseBo source, Warehouse target) {
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
        target.setWarehouseCode( source.getWarehouseCode() );
        target.setWarehouseName( source.getWarehouseName() );
        target.setOrderNum( source.getOrderNum() );
        target.setRemark( source.getRemark() );

        return target;
    }
}
