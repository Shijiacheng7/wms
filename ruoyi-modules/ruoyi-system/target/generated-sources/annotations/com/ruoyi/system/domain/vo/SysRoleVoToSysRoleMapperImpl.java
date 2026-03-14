package com.ruoyi.system.domain.vo;

import com.ruoyi.system.domain.entity.SysRole;
import java.time.LocalDateTime;
import java.time.ZoneId;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-13T16:37:58+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.9 (Oracle Corporation)"
)
@Component
public class SysRoleVoToSysRoleMapperImpl implements SysRoleVoToSysRoleMapper {

    @Override
    public SysRole convert(SysRoleVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysRole sysRole = new SysRole();

        if ( arg0.getCreateTime() != null ) {
            sysRole.setCreateTime( LocalDateTime.ofInstant( arg0.getCreateTime().toInstant(), ZoneId.of( "UTC" ) ) );
        }
        sysRole.setRoleId( arg0.getRoleId() );
        sysRole.setRoleName( arg0.getRoleName() );
        sysRole.setRoleKey( arg0.getRoleKey() );
        sysRole.setRoleSort( arg0.getRoleSort() );
        sysRole.setDataScope( arg0.getDataScope() );
        sysRole.setMenuCheckStrictly( arg0.getMenuCheckStrictly() );
        sysRole.setDeptCheckStrictly( arg0.getDeptCheckStrictly() );
        sysRole.setStatus( arg0.getStatus() );
        sysRole.setRemark( arg0.getRemark() );
        sysRole.setFlag( arg0.isFlag() );

        return sysRole;
    }

    @Override
    public SysRole convert(SysRoleVo source, SysRole target) {
        if ( source == null ) {
            return target;
        }

        if ( source.getCreateTime() != null ) {
            target.setCreateTime( LocalDateTime.ofInstant( source.getCreateTime().toInstant(), ZoneId.of( "UTC" ) ) );
        }
        else {
            target.setCreateTime( null );
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
        target.setFlag( source.isFlag() );

        return target;
    }
}
