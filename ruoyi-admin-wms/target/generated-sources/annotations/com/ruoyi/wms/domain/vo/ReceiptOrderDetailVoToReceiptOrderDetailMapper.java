package com.ruoyi.wms.domain.vo;

import com.ruoyi.wms.domain.entity.ReceiptOrderDetail;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface ReceiptOrderDetailVoToReceiptOrderDetailMapper extends BaseMapper<ReceiptOrderDetailVo, ReceiptOrderDetail> {
  ReceiptOrderDetail convert(ReceiptOrderDetailVo source, @MappingTarget ReceiptOrderDetail target);
}
