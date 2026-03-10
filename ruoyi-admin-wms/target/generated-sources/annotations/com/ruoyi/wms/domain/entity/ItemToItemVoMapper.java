package com.ruoyi.wms.domain.entity;

import com.ruoyi.wms.domain.vo.ItemVo;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface ItemToItemVoMapper extends BaseMapper<Item, ItemVo> {
  ItemVo convert(Item source, @MappingTarget ItemVo target);
}
