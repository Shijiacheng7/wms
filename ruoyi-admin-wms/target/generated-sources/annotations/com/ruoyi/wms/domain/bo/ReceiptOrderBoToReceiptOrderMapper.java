package com.ruoyi.wms.domain.bo;

import com.ruoyi.wms.domain.entity.ReceiptOrder;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface ReceiptOrderBoToReceiptOrderMapper extends BaseMapper<ReceiptOrderBo, ReceiptOrder> {
  ReceiptOrder convert(ReceiptOrderBo source, @MappingTarget ReceiptOrder target);
}
