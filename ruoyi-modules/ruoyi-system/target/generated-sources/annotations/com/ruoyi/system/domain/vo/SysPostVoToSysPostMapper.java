package com.ruoyi.system.domain.vo;

import com.ruoyi.system.domain.entity.SysPost;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysPostVoToSysPostMapper extends BaseMapper<SysPostVo, SysPost> {
  SysPost convert(SysPostVo source, @MappingTarget SysPost target);
}
