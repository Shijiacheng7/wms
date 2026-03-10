package com.ruoyi.wms.domain.vo;

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
public interface ReceiptOrderVoToReceiptOrderMapper extends BaseMapper<ReceiptOrderVo, ReceiptOrder> {
  ReceiptOrder convert(ReceiptOrderVo source, @MappingTarget ReceiptOrder target);
}
