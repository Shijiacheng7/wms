package com.ruoyi.wms.domain.vo;

import com.ruoyi.wms.domain.entity.ItemCategory;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface ItemCategoryVoToItemCategoryMapper extends BaseMapper<ItemCategoryVo, ItemCategory> {
  ItemCategory convert(ItemCategoryVo source, @MappingTarget ItemCategory target);
}
