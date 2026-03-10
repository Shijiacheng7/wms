package com.ruoyi.wms.domain.bo;

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
public interface MerchantBoToMerchantMapper extends BaseMapper<MerchantBo, Merchant> {
  Merchant convert(MerchantBo source, @MappingTarget Merchant target);
}
