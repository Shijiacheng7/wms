package com.ruoyi.system.domain.vo;

import com.ruoyi.system.domain.entity.SysOss;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysOssVoToSysOssMapper extends BaseMapper<SysOssVo, SysOss> {
  SysOss convert(SysOssVo source, @MappingTarget SysOss target);
}
