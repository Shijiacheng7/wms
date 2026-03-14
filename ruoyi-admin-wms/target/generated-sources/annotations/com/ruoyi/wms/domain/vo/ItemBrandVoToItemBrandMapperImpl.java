package com.ruoyi.wms.domain.vo;

import com.ruoyi.wms.domain.entity.ItemBrand;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-13T16:38:16+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.9 (Oracle Corporation)"
)
@Component
public class ItemBrandVoToItemBrandMapperImpl implements ItemBrandVoToItemBrandMapper {

    @Override
    public ItemBrand convert(ItemBrandVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ItemBrand itemBrand = new ItemBrand();

        itemBrand.setCreateBy( arg0.getCreateBy() );
        itemBrand.setCreateTime( arg0.getCreateTime() );
        itemBrand.setUpdateBy( arg0.getUpdateBy() );
        itemBrand.setUpdateTime( arg0.getUpdateTime() );
        itemBrand.setId( arg0.getId() );
        itemBrand.setBrandName( arg0.getBrandName() );

        return itemBrand;
    }

    @Override
    public ItemBrand convert(ItemBrandVo source, ItemBrand target) {
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
