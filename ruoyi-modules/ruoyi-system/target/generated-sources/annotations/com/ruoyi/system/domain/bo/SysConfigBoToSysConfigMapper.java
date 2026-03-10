package com.ruoyi.system.domain.bo;

import com.ruoyi.system.domain.entity.SysConfig;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysConfigBoToSysConfigMapper extends BaseMapper<SysConfigBo, SysConfig> {
  SysConfig convert(SysConfigBo source, @MappingTarget SysConfig target);
}
