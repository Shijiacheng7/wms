package com.ruoyi.system.domain.entity;

import com.ruoyi.common.log.event.OperLogEvent;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysOperLogToOperLogEventMapper extends BaseMapper<SysOperLog, OperLogEvent> {
  OperLogEvent convert(SysOperLog source, @MappingTarget OperLogEvent target);
}
