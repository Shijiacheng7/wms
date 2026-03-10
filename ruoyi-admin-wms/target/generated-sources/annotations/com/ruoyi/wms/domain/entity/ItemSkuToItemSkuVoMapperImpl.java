package com.ruoyi.wms.domain.entity;

import com.ruoyi.wms.domain.vo.ItemSkuVo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-06T21:50:27+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class ItemSkuToItemSkuVoMapperImpl implements ItemSkuToItemSkuVoMapper {

    @Override
    public ItemSkuVo convert(ItemSku arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ItemSkuVo itemSkuVo = new ItemSkuVo();

        itemSkuVo.setId( arg0.getId() );
        itemSkuVo.setSkuName( arg0.getSkuName() );
        itemSkuVo.setItemId( arg0.getItemId() );
        itemSkuVo.setBarcode( arg0.getBarcode() );
        itemSkuVo.setSkuCode( arg0.getSkuCode() );
        itemSkuVo.setLength( arg0.getLength() );
        itemSkuVo.setWidth( arg0.getWidth() );
        itemSkuVo.setHeight( arg0.getHeight() );
        itemSkuVo.setGrossWeight( arg0.getGrossWeight() );
        itemSkuVo.setNetWeight( arg0.getNetWeight() );
        itemSkuVo.setCostPrice( arg0.getCostPrice() );
        itemSkuVo.setSellingPrice( arg0.getSellingPrice() );

        return itemSkuVo;
    }

    @Override
    public ItemSkuVo convert(ItemSku source, ItemSkuVo target) {
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
