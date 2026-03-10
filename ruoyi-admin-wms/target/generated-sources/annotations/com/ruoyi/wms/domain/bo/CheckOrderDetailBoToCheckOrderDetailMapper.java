package com.ruoyi.wms.domain.bo;

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
public interface CheckOrderDetailBoToCheckOrderDetailMapper extends BaseMapper<CheckOrderDetailBo, CheckOrderDetail> {
  CheckOrderDetail convert(CheckOrderDetailBo source, @MappingTarget CheckOrderDetail target);
}
