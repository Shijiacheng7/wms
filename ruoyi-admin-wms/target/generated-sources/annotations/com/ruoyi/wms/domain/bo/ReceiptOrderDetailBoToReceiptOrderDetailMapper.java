package com.ruoyi.wms.domain.bo;

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
public interface ReceiptOrderDetailBoToReceiptOrderDetailMapper extends BaseMapper<ReceiptOrderDetailBo, ReceiptOrderDetail> {
  ReceiptOrderDetail convert(ReceiptOrderDetailBo source, @MappingTarget ReceiptOrderDetail target);
}
