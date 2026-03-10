package com.ruoyi.wms.domain.bo;

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
public interface MovementOrderDetailBoToMovementOrderDetailMapper extends BaseMapper<MovementOrderDetailBo, MovementOrderDetail> {
  MovementOrderDetail convert(MovementOrderDetailBo source,
      @MappingTarget MovementOrderDetail target);
}
