package com.ruoyi.system.domain.bo;

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
public interface SysOperLogBoToOperLogEventMapper extends BaseMapper<SysOperLogBo, OperLogEvent> {
  OperLogEvent convert(SysOperLogBo source, @MappingTarget OperLogEvent target);
}
