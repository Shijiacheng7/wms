package com.ruoyi.wms.domain.vo;

import com.ruoyi.wms.domain.entity.CheckOrder;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface CheckOrderVoToCheckOrderMapper extends BaseMapper<CheckOrderVo, CheckOrder> {
  CheckOrder convert(CheckOrderVo source, @MappingTarget CheckOrder target);
}
