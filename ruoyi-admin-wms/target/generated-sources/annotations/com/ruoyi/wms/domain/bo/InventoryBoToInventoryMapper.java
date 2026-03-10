package com.ruoyi.wms.domain.bo;

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
public interface InventoryBoToInventoryMapper extends BaseMapper<InventoryBo, Inventory> {
  Inventory convert(InventoryBo source, @MappingTarget Inventory target);
}
