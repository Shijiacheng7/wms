package com.ruoyi.system.domain.vo;

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
public interface SysUserVoToSysUserMapper extends BaseMapper<SysUserVo, SysUser> {
  SysUser convert(SysUserVo source, @MappingTarget SysUser target);
}
