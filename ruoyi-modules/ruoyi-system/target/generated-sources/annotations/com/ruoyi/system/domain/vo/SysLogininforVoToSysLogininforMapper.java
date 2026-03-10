package com.ruoyi.system.domain.vo;

import com.ruoyi.system.domain.entity.SysLogininfor;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysLogininforVoToSysLogininforMapper extends BaseMapper<SysLogininforVo, SysLogininfor> {
  SysLogininfor convert(SysLogininforVo source, @MappingTarget SysLogininfor target);
}
