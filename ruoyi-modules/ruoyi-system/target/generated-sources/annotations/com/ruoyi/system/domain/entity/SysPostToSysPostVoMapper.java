package com.ruoyi.system.domain.entity;

import com.ruoyi.system.domain.vo.SysPostVo;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysPostToSysPostVoMapper extends BaseMapper<SysPost, SysPostVo> {
  SysPostVo convert(SysPost source, @MappingTarget SysPostVo target);
}
