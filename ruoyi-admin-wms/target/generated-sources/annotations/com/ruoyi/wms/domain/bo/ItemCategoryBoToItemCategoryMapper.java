package com.ruoyi.wms.domain.bo;

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
public interface ItemCategoryBoToItemCategoryMapper extends BaseMapper<ItemCategoryBo, ItemCategory> {
  ItemCategory convert(ItemCategoryBo source, @MappingTarget ItemCategory target);
}
