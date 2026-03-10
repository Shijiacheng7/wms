package com.ruoyi.wms.domain.entity;

import com.ruoyi.wms.domain.vo.MerchantVo;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface MerchantToMerchantVoMapper extends BaseMapper<Merchant, MerchantVo> {
  MerchantVo convert(Merchant source, @MappingTarget MerchantVo target);
}
