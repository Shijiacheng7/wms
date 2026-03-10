package com.ruoyi.system.domain.vo;

import com.ruoyi.system.domain.entity.SysNotice;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysNoticeVoToSysNoticeMapper extends BaseMapper<SysNoticeVo, SysNotice> {
  SysNotice convert(SysNoticeVo source, @MappingTarget SysNotice target);
}
