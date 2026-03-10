package com.ruoyi.wms.domain.entity;

import com.ruoyi.wms.domain.vo.ItemVo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-06T21:50:27+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class ItemToItemVoMapperImpl implements ItemToItemVoMapper {

    @Override
    public ItemVo convert(Item arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ItemVo itemVo = new ItemVo();

        itemVo.setId( arg0.getId() );
        itemVo.setItemCode( arg0.getItemCode() );
        itemVo.setItemName( arg0.getItemName() );
        itemVo.setItemCategory( arg0.getItemCategory() );
        itemVo.setUnit( arg0.getUnit() );
        itemVo.setItemBrand( arg0.getItemBrand() );
        itemVo.setRemark( arg0.getRemark() );

        return itemVo;
    }

    @Override
    public ItemVo convert(Item source, ItemVo target) {
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
