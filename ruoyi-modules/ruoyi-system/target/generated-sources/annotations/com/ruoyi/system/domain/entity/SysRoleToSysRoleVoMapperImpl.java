package com.ruoyi.system.domain.entity;

import com.ruoyi.system.domain.vo.SysRoleVo;
import java.time.ZoneOffset;
import java.util.Date;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-13T16:37:58+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.9 (Oracle Corporation)"
)
@Component
public class SysRoleToSysRoleVoMapperImpl implements SysRoleToSysRoleVoMapper {

    @Override
    public SysRoleVo convert(SysRole arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysRoleVo sysRoleVo = new SysRoleVo();

        sysRoleVo.setRoleId( arg0.getRoleId() );
        sysRoleVo.setRoleName( arg0.getRoleName() );
        sysRoleVo.setRoleKey( arg0.getRoleKey() );
        sysRoleVo.setRoleSort( arg0.getRoleSort() );
        sysRoleVo.setDataScope( arg0.getDataScope() );
        sysRoleVo.setMenuCheckStrictly( arg0.getMenuCheckStrictly() );
        sysRoleVo.setDeptCheckStrictly( arg0.getDeptCheckStrictly() );
        sysRoleVo.setStatus( arg0.getStatus() );
        sysRoleVo.setRemark( arg0.getRemark() );
        if ( arg0.getCreateTime() != null ) {
            sysRoleVo.setCreateTime( Date.from( arg0.getCreateTime().toInstant( ZoneOffset.UTC ) ) );
        }
        sysRoleVo.setFlag( arg0.isFlag() );

        return sysRoleVo;
    }

    @Override
    public SysRoleVo convert(SysRole source, SysRoleVo target) {
        if ( source == null ) {
            return target;
        }

        target.setRoleId( source.getRoleId() );
        target.setRoleName( source.getRoleName() );
        target.setRoleKey( source.getRoleKey() );
        target.setRoleSort( source.getRoleSort() );
        target.setDataScope( source.getDataScope() );
        target.setMenuCheckStrictly( source.getMenuCheckStrictly() );
        target.setDeptCheckStrictly( source.getDeptCheckStrictly() );
        target.setStatus( source.getStatus() );
        target.setRemark( source.getRemark() );
        if ( source.getCreateTime() != null ) {
            target.setCreateTime( Date.from( source.getCreateTime().toInstant( ZoneOffset.UTC ) ) );
        }
        else {
            target.setCreateTime( null );
        }
        target.setFlag( source.isFlag() );

        return target;
    }
}
