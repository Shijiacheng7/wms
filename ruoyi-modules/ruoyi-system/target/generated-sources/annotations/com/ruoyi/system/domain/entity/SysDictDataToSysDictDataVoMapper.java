package com.ruoyi.system.domain.entity;

import com.ruoyi.system.domain.vo.SysDictDataVo;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysDictDataToSysDictDataVoMapper extends BaseMapper<SysDictData, SysDictDataVo> {
  SysDictDataVo convert(SysDictData source, @MappingTarget SysDictDataVo target);
}
