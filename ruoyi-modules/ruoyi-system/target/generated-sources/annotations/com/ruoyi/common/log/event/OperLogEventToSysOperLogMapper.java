package com.ruoyi.common.log.event;

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
public interface OperLogEventToSysOperLogMapper extends BaseMapper<OperLogEvent, SysOperLog> {
  SysOperLog convert(OperLogEvent source, @MappingTarget SysOperLog target);
}
