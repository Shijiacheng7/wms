package com.ruoyi.system.domain.vo;

import com.ruoyi.system.domain.entity.SysDept;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysDeptVoToSysDeptMapper extends BaseMapper<SysDeptVo, SysDept> {
  SysDept convert(SysDeptVo source, @MappingTarget SysDept target);
}
