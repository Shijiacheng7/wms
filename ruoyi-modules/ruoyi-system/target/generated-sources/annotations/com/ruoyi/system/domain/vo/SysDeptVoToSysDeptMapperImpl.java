package com.ruoyi.system.domain.vo;

import com.ruoyi.system.domain.entity.SysDept;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-06T21:50:19+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class SysDeptVoToSysDeptMapperImpl implements SysDeptVoToSysDeptMapper {

    @Override
    public SysDept convert(SysDeptVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysDept sysDept = new SysDept();

        sysDept.setCreateTime( arg0.getCreateTime() );
        sysDept.setDeptId( arg0.getDeptId() );
        sysDept.setDeptName( arg0.getDeptName() );
        sysDept.setOrderNum( arg0.getOrderNum() );
        sysDept.setLeader( arg0.getLeader() );
        sysDept.setPhone( arg0.getPhone() );
        sysDept.setEmail( arg0.getEmail() );
        sysDept.setStatus( arg0.getStatus() );
        sysDept.setAncestors( arg0.getAncestors() );
        sysDept.setParentName( arg0.getParentName() );
        sysDept.setParentId( arg0.getParentId() );

        return sysDept;
    }

    @Override
    public SysDept convert(SysDeptVo source, SysDept target) {
        if ( source == null ) {
            return target;
        }

        target.setCreateTime( source.getCreateTime() );
        target.setDeptId( source.getDeptId() );
        target.setDeptName( source.getDeptName() );
        target.setOrderNum( source.getOrderNum() );
        target.setLeader( source.getLeader() );
        target.setPhone( source.getPhone() );
        target.setEmail( source.getEmail() );
        target.setStatus( source.getStatus() );
        target.setAncestors( source.getAncestors() );
        target.setParentName( source.getParentName() );
        target.setParentId( source.getParentId() );

        return target;
    }
}
