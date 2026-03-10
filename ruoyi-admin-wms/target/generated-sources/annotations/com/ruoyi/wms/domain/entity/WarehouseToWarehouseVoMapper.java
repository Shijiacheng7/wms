package com.ruoyi.wms.domain.entity;

import com.ruoyi.wms.domain.vo.WarehouseVo;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface WarehouseToWarehouseVoMapper extends BaseMapper<Warehouse, WarehouseVo> {
  WarehouseVo convert(Warehouse source, @MappingTarget WarehouseVo target);
}
