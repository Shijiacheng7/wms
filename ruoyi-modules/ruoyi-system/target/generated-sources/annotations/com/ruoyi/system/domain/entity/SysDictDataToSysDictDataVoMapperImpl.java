package com.ruoyi.system.domain.entity;

import com.ruoyi.system.domain.vo.SysDictDataVo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-06T21:50:19+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class SysDictDataToSysDictDataVoMapperImpl implements SysDictDataToSysDictDataVoMapper {

    @Override
    public SysDictDataVo convert(SysDictData arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysDictDataVo sysDictDataVo = new SysDictDataVo();

        sysDictDataVo.setDictCode( arg0.getDictCode() );
        sysDictDataVo.setDictSort( arg0.getDictSort() );
        sysDictDataVo.setDictLabel( arg0.getDictLabel() );
        sysDictDataVo.setDictValue( arg0.getDictValue() );
        sysDictDataVo.setDictType( arg0.getDictType() );
        sysDictDataVo.setCssClass( arg0.getCssClass() );
        sysDictDataVo.setListClass( arg0.getListClass() );
        sysDictDataVo.setIsDefault( arg0.getIsDefault() );
        sysDictDataVo.setStatus( arg0.getStatus() );
        sysDictDataVo.setRemark( arg0.getRemark() );
        sysDictDataVo.setCreateTime( arg0.getCreateTime() );

        return sysDictDataVo;
    }

    @Override
    public SysDictDataVo convert(SysDictData source, SysDictDataVo target) {
        if ( source == null ) {
            return target;
        }

        target.setDictCode( source.getDictCode() );
        target.setDictSort( source.getDictSort() );
        target.setDictLabel( source.getDictLabel() );
        target.setDictValue( source.getDictValue() );
        target.setDictType( source.getDictType() );
        target.setCssClass( source.getCssClass() );
        target.setListClass( source.getListClass() );
        target.setIsDefault( source.getIsDefault() );
        target.setStatus( source.getStatus() );
        target.setRemark( source.getRemark() );
        target.setCreateTime( source.getCreateTime() );

        return target;
    }
}
