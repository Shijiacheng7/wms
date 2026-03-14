package com.ruoyi.system.domain.vo;

import com.ruoyi.system.domain.entity.SysDictType;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-13T16:37:58+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.9 (Oracle Corporation)"
)
@Component
public class SysDictTypeVoToSysDictTypeMapperImpl implements SysDictTypeVoToSysDictTypeMapper {

    @Override
    public SysDictType convert(SysDictTypeVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysDictType sysDictType = new SysDictType();

        sysDictType.setCreateTime( arg0.getCreateTime() );
        sysDictType.setDictId( arg0.getDictId() );
        sysDictType.setDictName( arg0.getDictName() );
        sysDictType.setDictType( arg0.getDictType() );
        sysDictType.setStatus( arg0.getStatus() );
        sysDictType.setRemark( arg0.getRemark() );

        return sysDictType;
    }

    @Override
    public SysDictType convert(SysDictTypeVo source, SysDictType target) {
        if ( source == null ) {
            return target;
        }

        target.setCreateTime( source.getCreateTime() );
        target.setDictId( source.getDictId() );
        target.setDictName( source.getDictName() );
        target.setDictType( source.getDictType() );
        target.setStatus( source.getStatus() );
        target.setRemark( source.getRemark() );

        return target;
    }
}
