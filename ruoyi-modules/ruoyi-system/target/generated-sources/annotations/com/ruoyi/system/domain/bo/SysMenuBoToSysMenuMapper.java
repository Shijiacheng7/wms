package com.ruoyi.system.domain.bo;

import com.ruoyi.system.domain.entity.SysMenu;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysMenuBoToSysMenuMapper extends BaseMapper<SysMenuBo, SysMenu> {
  SysMenu convert(SysMenuBo source, @MappingTarget SysMenu target);
}
