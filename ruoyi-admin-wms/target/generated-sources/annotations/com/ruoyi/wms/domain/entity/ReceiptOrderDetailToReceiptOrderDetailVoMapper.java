package com.ruoyi.wms.domain.entity;

import com.ruoyi.wms.domain.vo.ReceiptOrderDetailVo;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface ReceiptOrderDetailToReceiptOrderDetailVoMapper extends BaseMapper<ReceiptOrderDetail, ReceiptOrderDetailVo> {
  ReceiptOrderDetailVo convert(ReceiptOrderDetail source,
      @MappingTarget ReceiptOrderDetailVo target);
}
