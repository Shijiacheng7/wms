package com.ruoyi.wms.domain.entity;

import com.ruoyi.wms.domain.vo.MovementOrderVo;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface MovementOrderToMovementOrderVoMapper extends BaseMapper<MovementOrder, MovementOrderVo> {
  MovementOrderVo convert(MovementOrder source, @MappingTarget MovementOrderVo target);
}
