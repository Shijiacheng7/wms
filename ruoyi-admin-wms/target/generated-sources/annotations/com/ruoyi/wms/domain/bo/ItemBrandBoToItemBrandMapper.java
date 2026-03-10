package com.ruoyi.wms.domain.bo;

import com.ruoyi.wms.domain.entity.ItemBrand;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface ItemBrandBoToItemBrandMapper extends BaseMapper<ItemBrandBo, ItemBrand> {
  ItemBrand convert(ItemBrandBo source, @MappingTarget ItemBrand target);
}
