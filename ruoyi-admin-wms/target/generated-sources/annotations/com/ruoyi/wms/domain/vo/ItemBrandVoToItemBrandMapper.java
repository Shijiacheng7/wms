package com.ruoyi.wms.domain.vo;

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
public interface ItemBrandVoToItemBrandMapper extends BaseMapper<ItemBrandVo, ItemBrand> {
  ItemBrand convert(ItemBrandVo source, @MappingTarget ItemBrand target);
}
