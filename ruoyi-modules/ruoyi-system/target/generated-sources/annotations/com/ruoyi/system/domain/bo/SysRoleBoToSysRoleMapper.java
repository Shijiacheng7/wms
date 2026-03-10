package com.ruoyi.system.domain.bo;

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
public interface SysRoleBoToSysRoleMapper extends BaseMapper<SysRoleBo, SysRole> {
  SysRole convert(SysRoleBo source, @MappingTarget SysRole target);
}
