package com.ruoyi.system.domain.entity;

import com.ruoyi.system.domain.vo.SysRoleVo;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysRoleToSysRoleVoMapper extends BaseMapper<SysRole, SysRoleVo> {
  SysRoleVo convert(SysRole source, @MappingTarget SysRoleVo target);
}
