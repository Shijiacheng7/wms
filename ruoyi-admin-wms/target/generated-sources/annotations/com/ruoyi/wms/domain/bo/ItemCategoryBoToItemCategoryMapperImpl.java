package com.ruoyi.wms.domain.bo;

import com.ruoyi.wms.domain.entity.ItemCategory;
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
public class ItemCategoryBoToItemCategoryMapperImpl implements ItemCategoryBoToItemCategoryMapper {

    @Override
    public ItemCategory convert(ItemCategoryBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ItemCategory itemCategory = new ItemCategory();

        itemCategory.setSearchValue( arg0.getSearchValue() );
        itemCategory.setCreateBy( arg0.getCreateBy() );
        itemCategory.setCreateTime( arg0.getCreateTime() );
        itemCategory.setUpdateBy( arg0.getUpdateBy() );
        itemCategory.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            itemCategory.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        itemCategory.setId( arg0.getId() );
        itemCategory.setParentId( arg0.getParentId() );
        itemCategory.setCategoryName( arg0.getCategoryName() );
        itemCategory.setOrderNum( arg0.getOrderNum() );
        itemCategory.setStatus( arg0.getStatus() );

        return itemCategory;
    }

    @Override
    public ItemCategory convert(ItemCategoryBo source, ItemCategory target) {
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
        target.setParentId( source.getParentId() );
        target.setCategoryName( source.getCategoryName() );
        target.setOrderNum( source.getOrderNum() );
        target.setStatus( source.getStatus() );

        return target;
    }
}
