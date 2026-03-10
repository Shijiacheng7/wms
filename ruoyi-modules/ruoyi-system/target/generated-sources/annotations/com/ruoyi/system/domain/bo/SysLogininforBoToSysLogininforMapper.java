package com.ruoyi.system.domain.bo;

import com.ruoyi.system.domain.entity.SysLogininfor;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysLogininforBoToSysLogininforMapper extends BaseMapper<SysLogininforBo, SysLogininfor> {
  SysLogininfor convert(SysLogininforBo source, @MappingTarget SysLogininfor target);
}
