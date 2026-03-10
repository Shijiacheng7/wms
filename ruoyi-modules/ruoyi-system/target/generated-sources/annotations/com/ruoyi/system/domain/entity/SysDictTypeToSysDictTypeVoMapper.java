package com.ruoyi.system.domain.entity;

import com.ruoyi.system.domain.vo.SysDictTypeVo;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysDictTypeToSysDictTypeVoMapper extends BaseMapper<SysDictType, SysDictTypeVo> {
  SysDictTypeVo convert(SysDictType source, @MappingTarget SysDictTypeVo target);
}
