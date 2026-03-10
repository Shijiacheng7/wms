package com.ruoyi.system.domain.bo;

import com.ruoyi.system.domain.entity.SysDictData;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysDictDataBoToSysDictDataMapper extends BaseMapper<SysDictDataBo, SysDictData> {
  SysDictData convert(SysDictDataBo source, @MappingTarget SysDictData target);
}
