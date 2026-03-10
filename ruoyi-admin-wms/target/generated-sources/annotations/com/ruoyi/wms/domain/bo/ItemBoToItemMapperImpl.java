package com.ruoyi.wms.domain.bo;

import com.ruoyi.wms.domain.entity.Item;
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
public class ItemBoToItemMapperImpl implements ItemBoToItemMapper {

    @Override
    public Item convert(ItemBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Item item = new Item();

        item.setSearchValue( arg0.getSearchValue() );
        item.setCreateBy( arg0.getCreateBy() );
        item.setCreateTime( arg0.getCreateTime() );
        item.setUpdateBy( arg0.getUpdateBy() );
        item.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            item.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        item.setId( arg0.getId() );
        item.setItemCode( arg0.getItemCode() );
        item.setItemName( arg0.getItemName() );
        item.setItemCategory( arg0.getItemCategory() );
        item.setUnit( arg0.getUnit() );
        item.setItemBrand( arg0.getItemBrand() );
        item.setRemark( arg0.getRemark() );

        return item;
    }

    @Override
    public Item convert(ItemBo source, Item target) {
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
        target.setItemCode( source.getItemCode() );
        target.setItemName( source.getItemName() );
        target.setItemCategory( source.getItemCategory() );
        target.setUnit( source.getUnit() );
        target.setItemBrand( source.getItemBrand() );
        target.setRemark( source.getRemark() );

        return target;
    }
}
