package com.ruoyi.wms.domain.entity;

import com.ruoyi.wms.domain.vo.InventoryVo;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface InventoryToInventoryVoMapper extends BaseMapper<Inventory, InventoryVo> {
  InventoryVo convert(Inventory source, @MappingTarget InventoryVo target);
}
