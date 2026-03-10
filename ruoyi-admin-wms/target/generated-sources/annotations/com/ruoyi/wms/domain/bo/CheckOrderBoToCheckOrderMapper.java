package com.ruoyi.wms.domain.bo;

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
public interface CheckOrderBoToCheckOrderMapper extends BaseMapper<CheckOrderBo, CheckOrder> {
  CheckOrder convert(CheckOrderBo source, @MappingTarget CheckOrder target);
}
