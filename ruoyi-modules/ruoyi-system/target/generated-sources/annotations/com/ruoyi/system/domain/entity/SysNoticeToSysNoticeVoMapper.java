package com.ruoyi.system.domain.entity;

import com.ruoyi.system.domain.vo.SysNoticeVo;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysNoticeToSysNoticeVoMapper extends BaseMapper<SysNotice, SysNoticeVo> {
  SysNoticeVo convert(SysNotice source, @MappingTarget SysNoticeVo target);
}
