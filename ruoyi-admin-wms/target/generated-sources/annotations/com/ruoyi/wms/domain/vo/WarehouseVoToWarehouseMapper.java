package com.ruoyi.wms.domain.vo;

import com.ruoyi.wms.domain.entity.Warehouse;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface WarehouseVoToWarehouseMapper extends BaseMapper<WarehouseVo, Warehouse> {
  Warehouse convert(WarehouseVo source, @MappingTarget Warehouse target);
}
