package com.ruoyi.wms.domain.vo;

import com.ruoyi.wms.domain.entity.Item;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface ItemVoToItemMapper extends BaseMapper<ItemVo, Item> {
  Item convert(ItemVo source, @MappingTarget Item target);
}
