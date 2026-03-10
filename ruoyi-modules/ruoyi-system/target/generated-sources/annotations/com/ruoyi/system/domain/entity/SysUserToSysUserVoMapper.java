package com.ruoyi.system.domain.entity;

import com.ruoyi.system.domain.vo.SysUserVo;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysUserToSysUserVoMapper extends BaseMapper<SysUser, SysUserVo> {
  SysUserVo convert(SysUser source, @MappingTarget SysUserVo target);
}
