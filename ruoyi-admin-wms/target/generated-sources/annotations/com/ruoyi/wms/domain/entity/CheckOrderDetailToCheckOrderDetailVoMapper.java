package com.ruoyi.wms.domain.entity;

import com.ruoyi.wms.domain.vo.CheckOrderDetailVo;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface CheckOrderDetailToCheckOrderDetailVoMapper extends BaseMapper<CheckOrderDetail, CheckOrderDetailVo> {
  CheckOrderDetailVo convert(CheckOrderDetail source, @MappingTarget CheckOrderDetailVo target);
}
