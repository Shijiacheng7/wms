package com.ruoyi.system.domain.entity;

import com.ruoyi.system.domain.vo.SysConfigVo;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysConfigToSysConfigVoMapper extends BaseMapper<SysConfig, SysConfigVo> {
  SysConfigVo convert(SysConfig source, @MappingTarget SysConfigVo target);
}
