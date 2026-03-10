package com.ruoyi.wms.domain.vo;

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
public interface InventoryHistoryVoToInventoryHistoryMapper extends BaseMapper<InventoryHistoryVo, InventoryHistory> {
  InventoryHistory convert(InventoryHistoryVo source, @MappingTarget InventoryHistory target);
}
