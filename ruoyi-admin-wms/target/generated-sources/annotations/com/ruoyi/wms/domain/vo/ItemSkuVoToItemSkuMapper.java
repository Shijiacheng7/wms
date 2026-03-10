package com.ruoyi.wms.domain.vo;

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
public interface ItemSkuVoToItemSkuMapper extends BaseMapper<ItemSkuVo, ItemSku> {
  ItemSku convert(ItemSkuVo source, @MappingTarget ItemSku target);
}
