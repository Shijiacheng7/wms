package com.ruoyi.system.domain.vo;

import com.ruoyi.system.domain.entity.SysRole;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysRoleVoToSysRoleMapper extends BaseMapper<SysRoleVo, SysRole> {
  SysRole convert(SysRoleVo source, @MappingTarget SysRole target);
}
