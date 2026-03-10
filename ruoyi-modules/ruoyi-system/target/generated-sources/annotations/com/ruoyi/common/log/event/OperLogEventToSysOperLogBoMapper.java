package com.ruoyi.common.log.event;

import com.ruoyi.system.domain.bo.SysOperLogBo;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface OperLogEventToSysOperLogBoMapper extends BaseMapper<OperLogEvent, SysOperLogBo> {
  SysOperLogBo convert(OperLogEvent source, @MappingTarget SysOperLogBo target);
}
