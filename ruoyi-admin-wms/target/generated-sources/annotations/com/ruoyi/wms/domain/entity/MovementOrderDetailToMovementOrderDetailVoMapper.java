package com.ruoyi.wms.domain.entity;

import com.ruoyi.wms.domain.vo.MovementOrderDetailVo;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface MovementOrderDetailToMovementOrderDetailVoMapper extends BaseMapper<MovementOrderDetail, MovementOrderDetailVo> {
  MovementOrderDetailVo convert(MovementOrderDetail source,
      @MappingTarget MovementOrderDetailVo target);
}
