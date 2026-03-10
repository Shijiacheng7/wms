package com.ruoyi.wms.domain.entity;

import com.ruoyi.wms.domain.vo.CheckOrderVo;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface CheckOrderToCheckOrderVoMapper extends BaseMapper<CheckOrder, CheckOrderVo> {
  CheckOrderVo convert(CheckOrder source, @MappingTarget CheckOrderVo target);
}
