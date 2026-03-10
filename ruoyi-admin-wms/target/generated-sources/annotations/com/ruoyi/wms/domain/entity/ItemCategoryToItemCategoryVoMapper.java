package com.ruoyi.wms.domain.entity;

import com.ruoyi.wms.domain.vo.ItemCategoryVo;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface ItemCategoryToItemCategoryVoMapper extends BaseMapper<ItemCategory, ItemCategoryVo> {
  ItemCategoryVo convert(ItemCategory source, @MappingTarget ItemCategoryVo target);
}
