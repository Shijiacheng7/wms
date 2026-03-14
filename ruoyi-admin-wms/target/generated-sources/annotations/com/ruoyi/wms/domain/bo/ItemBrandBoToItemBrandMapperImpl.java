package com.ruoyi.wms.domain.bo;

import com.ruoyi.wms.domain.entity.ItemBrand;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-13T16:38:16+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.9 (Oracle Corporation)"
)
@Component
public class ItemBrandBoToItemBrandMapperImpl implements ItemBrandBoToItemBrandMapper {

    @Override
    public ItemBrand convert(ItemBrandBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ItemBrand itemBrand = new ItemBrand();

        itemBrand.setSearchValue( arg0.getSearchValue() );
        itemBrand.setCreateBy( arg0.getCreateBy() );
        itemBrand.setCreateTime( arg0.getCreateTime() );
        itemBrand.setUpdateBy( arg0.getUpdateBy() );
        itemBrand.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            itemBrand.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        itemBrand.setId( arg0.getId() );
        itemBrand.setBrandName( arg0.getBrandName() );

        return itemBrand;
    }

    @Override
    public ItemBrand convert(ItemBrandBo source, ItemBrand target) {
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
        target.setBrandName( source.getBrandName() );

        return target;
    }
}
