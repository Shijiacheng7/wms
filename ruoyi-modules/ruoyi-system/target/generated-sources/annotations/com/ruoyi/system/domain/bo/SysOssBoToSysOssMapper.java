package com.ruoyi.system.domain.bo;

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
public interface SysOssBoToSysOssMapper extends BaseMapper<SysOssBo, SysOss> {
  SysOss convert(SysOssBo source, @MappingTarget SysOss target);
}
