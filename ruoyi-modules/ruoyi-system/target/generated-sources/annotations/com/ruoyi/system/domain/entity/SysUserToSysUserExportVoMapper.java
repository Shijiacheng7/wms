package com.ruoyi.system.domain.entity;

import com.ruoyi.system.domain.vo.SysUserExportVo;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysUserToSysUserExportVoMapper extends BaseMapper<SysUser, SysUserExportVo> {
  SysUserExportVo convert(SysUser source, @MappingTarget SysUserExportVo target);
}
