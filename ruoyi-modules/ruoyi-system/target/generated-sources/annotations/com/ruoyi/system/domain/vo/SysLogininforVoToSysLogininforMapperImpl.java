package com.ruoyi.system.domain.vo;

import com.ruoyi.system.domain.entity.SysLogininfor;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-06T21:50:20+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class SysLogininforVoToSysLogininforMapperImpl implements SysLogininforVoToSysLogininforMapper {

    @Override
    public SysLogininfor convert(SysLogininforVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysLogininfor sysLogininfor = new SysLogininfor();

        sysLogininfor.setInfoId( arg0.getInfoId() );
        sysLogininfor.setUserName( arg0.getUserName() );
        sysLogininfor.setStatus( arg0.getStatus() );
        sysLogininfor.setIpaddr( arg0.getIpaddr() );
        sysLogininfor.setLoginLocation( arg0.getLoginLocation() );
        sysLogininfor.setBrowser( arg0.getBrowser() );
        sysLogininfor.setOs( arg0.getOs() );
        sysLogininfor.setMsg( arg0.getMsg() );
        sysLogininfor.setLoginTime( arg0.getLoginTime() );

        return sysLogininfor;
    }

    @Override
    public SysLogininfor convert(SysLogininforVo source, SysLogininfor target) {
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
