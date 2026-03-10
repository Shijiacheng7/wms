package com.ruoyi.wms.domain.entity;

import com.ruoyi.wms.domain.vo.ItemCategoryVo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-06T21:50:28+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class ItemCategoryToItemCategoryVoMapperImpl implements ItemCategoryToItemCategoryVoMapper {

    @Override
    public ItemCategoryVo convert(ItemCategory arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ItemCategoryVo itemCategoryVo = new ItemCategoryVo();

        itemCategoryVo.setId( arg0.getId() );
        itemCategoryVo.setParentId( arg0.getParentId() );
        itemCategoryVo.setCategoryName( arg0.getCategoryName() );
        itemCategoryVo.setOrderNum( arg0.getOrderNum() );
        itemCategoryVo.setStatus( arg0.getStatus() );

        return itemCategoryVo;
    }

    @Override
    public ItemCategoryVo convert(ItemCategory source, ItemCategoryVo target) {
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
