package com.ruoyi.wms.domain.bo;

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
public interface WarehouseBoToWarehouseMapper extends BaseMapper<WarehouseBo, Warehouse> {
  Warehouse convert(WarehouseBo source, @MappingTarget Warehouse target);
}
