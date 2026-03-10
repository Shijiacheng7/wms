package com.ruoyi.wms.domain.entity;

import com.ruoyi.wms.domain.vo.ItemBrandVo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-06T21:50:27+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class ItemBrandToItemBrandVoMapperImpl implements ItemBrandToItemBrandVoMapper {

    @Override
    public ItemBrandVo convert(ItemBrand arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ItemBrandVo itemBrandVo = new ItemBrandVo();

        itemBrandVo.setCreateBy( arg0.getCreateBy() );
        itemBrandVo.setCreateTime( arg0.getCreateTime() );
        itemBrandVo.setUpdateBy( arg0.getUpdateBy() );
        itemBrandVo.setUpdateTime( arg0.getUpdateTime() );
        itemBrandVo.setId( arg0.getId() );
        itemBrandVo.setBrandName( arg0.getBrandName() );

        return itemBrandVo;
    }

    @Override
    public ItemBrandVo convert(ItemBrand source, ItemBrandVo target) {
        if ( source == null ) {
            return target;
        }

        target.setCreateBy( source.getCreateBy() );
        target.setCreateTime( source.getCreateTime() );
        target.setUpdateBy( source.getUpdateBy() );
        target.setUpdateTime( source.getUpdateTime() );
        target.setId( source.getId() );
        target.setBrandName( source.getBrandName() );

        return target;
    }
}
