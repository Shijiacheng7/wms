package com.ruoyi.system.domain.bo;

import com.ruoyi.system.domain.entity.SysDept;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-06T21:50:19+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class SysDeptBoToSysDeptMapperImpl implements SysDeptBoToSysDeptMapper {

    @Override
    public SysDept convert(SysDeptBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysDept sysDept = new SysDept();

        sysDept.setSearchValue( arg0.getSearchValue() );
        sysDept.setCreateBy( arg0.getCreateBy() );
        sysDept.setCreateTime( arg0.getCreateTime() );
        sysDept.setUpdateBy( arg0.getUpdateBy() );
        sysDept.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            sysDept.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        sysDept.setDeptId( arg0.getDeptId() );
        sysDept.setDeptName( arg0.getDeptName() );
        sysDept.setOrderNum( arg0.getOrderNum() );
        sysDept.setLeader( arg0.getLeader() );
        sysDept.setPhone( arg0.getPhone() );
        sysDept.setEmail( arg0.getEmail() );
        sysDept.setStatus( arg0.getStatus() );
        sysDept.setParentId( arg0.getParentId() );

        return sysDept;
    }

    @Override
    public SysDept convert(SysDeptBo source, SysDept target) {
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
        target.setDeptId( source.getDeptId() );
        target.setDeptName( source.getDeptName() );
        target.setOrderNum( source.getOrderNum() );
        target.setLeader( source.getLeader() );
        target.setPhone( source.getPhone() );
        target.setEmail( source.getEmail() );
        target.setStatus( source.getStatus() );
        target.setParentId( source.getParentId() );

        return target;
    }
}
