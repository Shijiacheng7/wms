package com.ruoyi.wms.domain.entity;

import com.ruoyi.wms.domain.vo.ItemSkuVo;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface ItemSkuToItemSkuVoMapper extends BaseMapper<ItemSku, ItemSkuVo> {
  ItemSkuVo convert(ItemSku source, @MappingTarget ItemSkuVo target);
}
