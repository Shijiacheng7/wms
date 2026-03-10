package com.ruoyi.wms.domain.bo;

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
public interface ItemBoToItemMapper extends BaseMapper<ItemBo, Item> {
  Item convert(ItemBo source, @MappingTarget Item target);
}
