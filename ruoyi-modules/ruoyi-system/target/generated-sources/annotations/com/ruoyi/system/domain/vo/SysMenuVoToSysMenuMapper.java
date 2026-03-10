package com.ruoyi.system.domain.vo;

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
public interface SysMenuVoToSysMenuMapper extends BaseMapper<SysMenuVo, SysMenu> {
  SysMenu convert(SysMenuVo source, @MappingTarget SysMenu target);
}
