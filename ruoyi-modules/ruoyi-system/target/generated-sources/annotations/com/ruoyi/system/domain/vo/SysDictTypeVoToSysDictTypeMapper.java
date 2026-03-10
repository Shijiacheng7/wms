package com.ruoyi.system.domain.vo;

import com.ruoyi.system.domain.entity.SysDictType;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysDictTypeVoToSysDictTypeMapper extends BaseMapper<SysDictTypeVo, SysDictType> {
  SysDictType convert(SysDictTypeVo source, @MappingTarget SysDictType target);
}
