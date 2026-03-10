package com.ruoyi.wms.domain.vo;

import com.ruoyi.wms.domain.entity.CheckOrderDetail;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface CheckOrderDetailVoToCheckOrderDetailMapper extends BaseMapper<CheckOrderDetailVo, CheckOrderDetail> {
  CheckOrderDetail convert(CheckOrderDetailVo source, @MappingTarget CheckOrderDetail target);
}
