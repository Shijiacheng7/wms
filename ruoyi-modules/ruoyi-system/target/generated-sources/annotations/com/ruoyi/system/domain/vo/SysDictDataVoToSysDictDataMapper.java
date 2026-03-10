package com.ruoyi.system.domain.vo;

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
public interface SysDictDataVoToSysDictDataMapper extends BaseMapper<SysDictDataVo, SysDictData> {
  SysDictData convert(SysDictDataVo source, @MappingTarget SysDictData target);
}
