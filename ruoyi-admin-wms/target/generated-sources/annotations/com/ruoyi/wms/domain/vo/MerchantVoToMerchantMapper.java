package com.ruoyi.wms.domain.vo;

import com.ruoyi.wms.domain.entity.Merchant;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface MerchantVoToMerchantMapper extends BaseMapper<MerchantVo, Merchant> {
  Merchant convert(MerchantVo source, @MappingTarget Merchant target);
}
