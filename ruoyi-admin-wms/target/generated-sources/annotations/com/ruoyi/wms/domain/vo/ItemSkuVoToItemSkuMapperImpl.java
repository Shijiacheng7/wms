package com.ruoyi.wms.domain.vo;

import com.ruoyi.wms.domain.entity.ItemSku;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-13T16:38:16+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.9 (Oracle Corporation)"
)
@Component
public class ItemSkuVoToItemSkuMapperImpl implements ItemSkuVoToItemSkuMapper {

    @Override
    public ItemSku convert(ItemSkuVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ItemSku itemSku = new ItemSku();

        itemSku.setId( arg0.getId() );
        itemSku.setSkuName( arg0.getSkuName() );
        itemSku.setItemId( arg0.getItemId() );
        itemSku.setBarcode( arg0.getBarcode() );
        itemSku.setSkuCode( arg0.getSkuCode() );
        itemSku.setLength( arg0.getLength() );
        itemSku.setWidth( arg0.getWidth() );
        itemSku.setHeight( arg0.getHeight() );
        itemSku.setGrossWeight( arg0.getGrossWeight() );
        itemSku.setNetWeight( arg0.getNetWeight() );
        itemSku.setCostPrice( arg0.getCostPrice() );
        itemSku.setSellingPrice( arg0.getSellingPrice() );

        return itemSku;
    }

    @Override
    public ItemSku convert(ItemSkuVo source, ItemSku target) {
        if ( source == null ) {
            return target;
        }

        target.setId( source.getId() );
        target.setSkuName( source.getSkuName() );
        target.setItemId( source.getItemId() );
        target.setBarcode( source.getBarcode() );
        target.setSkuCode( source.getSkuCode() );
        target.setLength( source.getLength() );
        target.setWidth( source.getWidth() );
        target.setHeight( source.getHeight() );
        target.setGrossWeight( source.getGrossWeight() );
        target.setNetWeight( source.getNetWeight() );
        target.setCostPrice( source.getCostPrice() );
        target.setSellingPrice( source.getSellingPrice() );

        return target;
    }
}
