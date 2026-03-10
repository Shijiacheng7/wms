package com.ruoyi.system.domain.entity;

import com.ruoyi.system.domain.vo.SysOssVo;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysOssToSysOssVoMapper extends BaseMapper<SysOss, SysOssVo> {
  SysOssVo convert(SysOss source, @MappingTarget SysOssVo target);
}
