package com.ruoyi.system.domain.bo;

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
public interface SysDictTypeBoToSysDictTypeMapper extends BaseMapper<SysDictTypeBo, SysDictType> {
  SysDictType convert(SysDictTypeBo source, @MappingTarget SysDictType target);
}
