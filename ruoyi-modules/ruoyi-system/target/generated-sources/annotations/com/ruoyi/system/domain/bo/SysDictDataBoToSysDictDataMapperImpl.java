package com.ruoyi.system.domain.bo;

import com.ruoyi.system.domain.entity.SysDictData;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-13T16:37:58+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.9 (Oracle Corporation)"
)
@Component
public class SysDictDataBoToSysDictDataMapperImpl implements SysDictDataBoToSysDictDataMapper {

    @Override
    public SysDictData convert(SysDictDataBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysDictData sysDictData = new SysDictData();

        sysDictData.setSearchValue( arg0.getSearchValue() );
        sysDictData.setCreateBy( arg0.getCreateBy() );
        sysDictData.setCreateTime( arg0.getCreateTime() );
        sysDictData.setUpdateBy( arg0.getUpdateBy() );
        sysDictData.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            sysDictData.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        sysDictData.setDictCode( arg0.getDictCode() );
        sysDictData.setDictSort( arg0.getDictSort() );
        sysDictData.setDictLabel( arg0.getDictLabel() );
        sysDictData.setDictValue( arg0.getDictValue() );
        sysDictData.setDictType( arg0.getDictType() );
        sysDictData.setCssClass( arg0.getCssClass() );
        sysDictData.setListClass( arg0.getListClass() );
        sysDictData.setIsDefault( arg0.getIsDefault() );
        sysDictData.setStatus( arg0.getStatus() );
        sysDictData.setRemark( arg0.getRemark() );

        return sysDictData;
    }

    @Override
    public SysDictData convert(SysDictDataBo source, SysDictData target) {
        if ( source == null ) {
            return target;
        }

        target.setSearchValue( source.getSearchValue() );
        target.setCreateBy( source.getCreateBy() );
        target.setCreateTime( source.getCreateTime() );
        target.setUpdateBy( source.getUpdateBy() );
        target.setUpdateTime( source.getUpdateTime() );
        if ( target.getParams() != null ) {
            Map<String, Object> map = source.getParams();
            if ( map != null ) {
                target.getParams().clear();
                target.getParams().putAll( map );
            }
            else {
                target.setParams( null );
            }
        }
        else {
            Map<String, Object> map = source.getParams();
            if ( map != null ) {
                target.setParams( new LinkedHashMap<String, Object>( map ) );
            }
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

        return target;
    }
}
