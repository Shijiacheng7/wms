package com.ruoyi.system.domain.entity;

import com.ruoyi.system.domain.vo.SysLogininforVo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-13T16:37:58+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.9 (Oracle Corporation)"
)
@Component
public class SysLogininforToSysLogininforVoMapperImpl implements SysLogininforToSysLogininforVoMapper {

    @Override
    public SysLogininforVo convert(SysLogininfor arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysLogininforVo sysLogininforVo = new SysLogininforVo();

        sysLogininforVo.setInfoId( arg0.getInfoId() );
        sysLogininforVo.setUserName( arg0.getUserName() );
        sysLogininforVo.setStatus( arg0.getStatus() );
        sysLogininforVo.setIpaddr( arg0.getIpaddr() );
        sysLogininforVo.setLoginLocation( arg0.getLoginLocation() );
        sysLogininforVo.setBrowser( arg0.getBrowser() );
        sysLogininforVo.setOs( arg0.getOs() );
        sysLogininforVo.setMsg( arg0.getMsg() );
        sysLogininforVo.setLoginTime( arg0.getLoginTime() );

        return sysLogininforVo;
    }

    @Override
    public SysLogininforVo convert(SysLogininfor source, SysLogininforVo target) {
        if ( source == null ) {
            return target;
        }

        target.setInfoId( source.getInfoId() );
        target.setUserName( source.getUserName() );
        target.setStatus( source.getStatus() );
        target.setIpaddr( source.getIpaddr() );
        target.setLoginLocation( source.getLoginLocation() );
        target.setBrowser( source.getBrowser() );
        target.setOs( source.getOs() );
        target.setMsg( source.getMsg() );
        target.setLoginTime( source.getLoginTime() );

        return target;
    }
}
