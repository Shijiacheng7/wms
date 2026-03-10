package com.ruoyi.system.domain.bo;

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
public interface SysDeptBoToSysDeptMapper extends BaseMapper<SysDeptBo, SysDept> {
  SysDept convert(SysDeptBo source, @MappingTarget SysDept target);
}
