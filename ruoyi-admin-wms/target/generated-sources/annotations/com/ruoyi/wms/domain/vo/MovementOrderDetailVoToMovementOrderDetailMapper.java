package com.ruoyi.wms.domain.vo;

import com.ruoyi.wms.domain.entity.MovementOrderDetail;
import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface MovementOrderDetailVoToMovementOrderDetailMapper extends BaseMapper<MovementOrderDetailVo, MovementOrderDetail> {
  MovementOrderDetail convert(MovementOrderDetailVo source,
      @MappingTarget MovementOrderDetail target);
}
