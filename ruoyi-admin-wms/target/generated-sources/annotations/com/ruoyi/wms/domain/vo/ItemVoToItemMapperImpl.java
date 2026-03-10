package com.ruoyi.wms.domain.vo;

import com.ruoyi.wms.domain.entity.Item;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-06T21:50:27+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class ItemVoToItemMapperImpl implements ItemVoToItemMapper {

    @Override
    public Item convert(ItemVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Item item = new Item();

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
    public Item convert(ItemVo source, Item target) {
        if ( source == null ) {
            return target;
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
