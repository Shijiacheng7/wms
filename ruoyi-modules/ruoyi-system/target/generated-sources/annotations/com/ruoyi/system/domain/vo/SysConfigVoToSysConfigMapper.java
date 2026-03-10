package com.ruoyi.system.domain.vo;

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
public interface SysConfigVoToSysConfigMapper extends BaseMapper<SysConfigVo, SysConfig> {
  SysConfig convert(SysConfigVo source, @MappingTarget SysConfig target);
}
