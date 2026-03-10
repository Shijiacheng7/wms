package com.ruoyi.system.domain.entity;

import com.ruoyi.system.domain.vo.SysMenuVo;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysMenuToSysMenuVoMapper extends BaseMapper<SysMenu, SysMenuVo> {
  SysMenuVo convert(SysMenu source, @MappingTarget SysMenuVo target);
}
