package com.ruoyi.wms.domain.bo;

import com.ruoyi.wms.domain.entity.ItemSku;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface ItemSkuBoToItemSkuMapper extends BaseMapper<ItemSkuBo, ItemSku> {
  ItemSku convert(ItemSkuBo source, @MappingTarget ItemSku target);
}
