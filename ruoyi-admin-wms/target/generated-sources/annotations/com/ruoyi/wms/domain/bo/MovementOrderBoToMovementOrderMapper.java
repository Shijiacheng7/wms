package com.ruoyi.wms.domain.bo;

import com.ruoyi.wms.domain.entity.MovementOrder;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface MovementOrderBoToMovementOrderMapper extends BaseMapper<MovementOrderBo, MovementOrder> {
  MovementOrder convert(MovementOrderBo source, @MappingTarget MovementOrder target);
}
