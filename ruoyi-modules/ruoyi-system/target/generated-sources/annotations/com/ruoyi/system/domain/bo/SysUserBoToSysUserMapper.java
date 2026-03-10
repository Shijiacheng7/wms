package com.ruoyi.system.domain.bo;

import com.ruoyi.system.domain.entity.SysUser;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysUserBoToSysUserMapper extends BaseMapper<SysUserBo, SysUser> {
  SysUser convert(SysUserBo source, @MappingTarget SysUser target);
}
