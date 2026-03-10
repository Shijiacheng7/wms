package com.ruoyi.wms.domain.vo;

import com.ruoyi.wms.domain.entity.Inventory;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface InventoryVoToInventoryMapper extends BaseMapper<InventoryVo, Inventory> {
  Inventory convert(InventoryVo source, @MappingTarget Inventory target);
}
