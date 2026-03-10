package com.ruoyi.system.domain.vo;

import com.ruoyi.system.domain.entity.SysOperLog;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysOperLogVoToSysOperLogMapper extends BaseMapper<SysOperLogVo, SysOperLog> {
  SysOperLog convert(SysOperLogVo source, @MappingTarget SysOperLog target);
}
