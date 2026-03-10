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
public interface MovementOrderDetailBoToInventoryMapper extends BaseMapper<MovementOrderDetailBo, Inventory> {
  Inventory convert(MovementOrderDetailBo source, @MappingTarget Inventory target);
}
