package com.ruoyi.system.domain.bo;

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
public interface SysOperLogBoToSysOperLogMapper extends BaseMapper<SysOperLogBo, SysOperLog> {
  SysOperLog convert(SysOperLogBo source, @MappingTarget SysOperLog target);
}
