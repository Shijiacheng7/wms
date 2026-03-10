package com.ruoyi.wms.domain.bo;

import com.ruoyi.wms.domain.entity.InventoryHistory;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface InventoryHistoryBoToInventoryHistoryMapper extends BaseMapper<InventoryHistoryBo, InventoryHistory> {
  InventoryHistory convert(InventoryHistoryBo source, @MappingTarget InventoryHistory target);
}
