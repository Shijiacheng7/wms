package com.ruoyi.wms.domain.vo;

import com.ruoyi.wms.domain.entity.ItemCategory;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-13T16:38:17+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.9 (Oracle Corporation)"
)
@Component
public class ItemCategoryVoToItemCategoryMapperImpl implements ItemCategoryVoToItemCategoryMapper {

    @Override
    public ItemCategory convert(ItemCategoryVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ItemCategory itemCategory = new ItemCategory();

        itemCategory.setId( arg0.getId() );
        itemCategory.setParentId( arg0.getParentId() );
        itemCategory.setCategoryName( arg0.getCategoryName() );
        itemCategory.setOrderNum( arg0.getOrderNum() );
        itemCategory.setStatus( arg0.getStatus() );

        return itemCategory;
    }

    @Override
    public ItemCategory convert(ItemCategoryVo source, ItemCategory target) {
        if ( source == null ) {
            return target;
        }

        target.setId( source.getId() );
        target.setParentId( source.getParentId() );
        target.setCategoryName( source.getCategoryName() );
        target.setOrderNum( source.getOrderNum() );
        target.setStatus( source.getStatus() );

        return target;
    }
}
