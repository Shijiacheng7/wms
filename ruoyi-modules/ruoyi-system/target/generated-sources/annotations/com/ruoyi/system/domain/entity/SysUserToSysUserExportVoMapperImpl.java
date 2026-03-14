package com.ruoyi.system.domain.entity;

import com.ruoyi.system.domain.vo.SysUserExportVo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-13T16:37:58+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.9 (Oracle Corporation)"
)
@Component
public class SysUserToSysUserExportVoMapperImpl implements SysUserToSysUserExportVoMapper {

    @Override
    public SysUserExportVo convert(SysUser arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysUserExportVo sysUserExportVo = new SysUserExportVo();

        sysUserExportVo.setUserId( arg0.getUserId() );
        sysUserExportVo.setUserName( arg0.getUserName() );
        sysUserExportVo.setNickName( arg0.getNickName() );
        sysUserExportVo.setEmail( arg0.getEmail() );
        sysUserExportVo.setPhonenumber( arg0.getPhonenumber() );
        sysUserExportVo.setSex( arg0.getSex() );
        sysUserExportVo.setStatus( arg0.getStatus() );
        sysUserExportVo.setLoginIp( arg0.getLoginIp() );
        sysUserExportVo.setLoginDate( arg0.getLoginDate() );

        return sysUserExportVo;
    }

    @Override
    public SysUserExportVo convert(SysUser source, SysUserExportVo target) {
        if ( source == null ) {
            return target;
        }

        target.setUserId( source.getUserId() );
        target.setUserName( source.getUserName() );
        target.setNickName( source.getNickName() );
        target.setEmail( source.getEmail() );
        target.setPhonenumber( source.getPhonenumber() );
        target.setSex( source.getSex() );
        target.setStatus( source.getStatus() );
        target.setLoginIp( source.getLoginIp() );
        target.setLoginDate( source.getLoginDate() );

        return target;
    }
}
