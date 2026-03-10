package com.ruoyi.system.domain.vo;

import com.ruoyi.system.domain.entity.SysOssConfig;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysOssConfigVoToSysOssConfigMapper extends BaseMapper<SysOssConfigVo, SysOssConfig> {
  SysOssConfig convert(SysOssConfigVo source, @MappingTarget SysOssConfig target);
}
