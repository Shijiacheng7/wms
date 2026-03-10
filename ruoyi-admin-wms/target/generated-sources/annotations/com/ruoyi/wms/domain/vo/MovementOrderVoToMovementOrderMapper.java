package com.ruoyi.wms.domain.vo;

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
public interface MovementOrderVoToMovementOrderMapper extends BaseMapper<MovementOrderVo, MovementOrder> {
  MovementOrder convert(MovementOrderVo source, @MappingTarget MovementOrder target);
}
