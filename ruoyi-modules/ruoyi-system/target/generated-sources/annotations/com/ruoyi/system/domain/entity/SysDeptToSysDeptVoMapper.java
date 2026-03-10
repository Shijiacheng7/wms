package com.ruoyi.system.domain.entity;

import com.ruoyi.system.domain.vo.SysDeptVo;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysDeptToSysDeptVoMapper extends BaseMapper<SysDept, SysDeptVo> {
  SysDeptVo convert(SysDept source, @MappingTarget SysDeptVo target);
}
