package com.ruoyi.system.domain.bo;

import com.ruoyi.system.domain.entity.SysLogininfor;
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
public class SysLogininforBoToSysLogininforMapperImpl implements SysLogininforBoToSysLogininforMapper {

    @Override
    public SysLogininfor convert(SysLogininforBo arg0) {
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
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            sysLogininfor.setParams( new LinkedHashMap<String, Object>( map ) );
        }

        return sysLogininfor;
    }

    @Override
    public SysLogininfor convert(SysLogininforBo source, SysLogininfor target) {
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

        return target;
    }
}
