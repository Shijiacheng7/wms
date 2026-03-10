package com.ruoyi.system.domain.entity;

import com.ruoyi.system.domain.vo.SysOperLogVo;
import java.util.Arrays;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-06T21:50:20+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class SysOperLogToSysOperLogVoMapperImpl implements SysOperLogToSysOperLogVoMapper {

    @Override
    public SysOperLogVo convert(SysOperLog arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysOperLogVo sysOperLogVo = new SysOperLogVo();

        sysOperLogVo.setOperId( arg0.getOperId() );
        sysOperLogVo.setTitle( arg0.getTitle() );
        sysOperLogVo.setBusinessType( arg0.getBusinessType() );
        Integer[] businessTypes = arg0.getBusinessTypes();
        if ( businessTypes != null ) {
            sysOperLogVo.setBusinessTypes( Arrays.copyOf( businessTypes, businessTypes.length ) );
        }
        sysOperLogVo.setMethod( arg0.getMethod() );
        sysOperLogVo.setRequestMethod( arg0.getRequestMethod() );
        sysOperLogVo.setOperatorType( arg0.getOperatorType() );
        sysOperLogVo.setOperName( arg0.getOperName() );
        sysOperLogVo.setDeptName( arg0.getDeptName() );
        sysOperLogVo.setOperUrl( arg0.getOperUrl() );
        sysOperLogVo.setOperIp( arg0.getOperIp() );
        sysOperLogVo.setOperLocation( arg0.getOperLocation() );
        sysOperLogVo.setOperParam( arg0.getOperParam() );
        sysOperLogVo.setJsonResult( arg0.getJsonResult() );
        sysOperLogVo.setStatus( arg0.getStatus() );
        sysOperLogVo.setErrorMsg( arg0.getErrorMsg() );
        sysOperLogVo.setOperTime( arg0.getOperTime() );

        return sysOperLogVo;
    }

    @Override
    public SysOperLogVo convert(SysOperLog source, SysOperLogVo target) {
        if ( source == null ) {
            return target;
        }

        target.setOperId( source.getOperId() );
        target.setTitle( source.getTitle() );
        target.setBusinessType( source.getBusinessType() );
        Integer[] businessTypes = source.getBusinessTypes();
        if ( businessTypes != null ) {
            target.setBusinessTypes( Arrays.copyOf( businessTypes, businessTypes.length ) );
        }
        else {
            target.setBusinessTypes( null );
        }
        target.setMethod( source.getMethod() );
        target.setRequestMethod( source.getRequestMethod() );
        target.setOperatorType( source.getOperatorType() );
        target.setOperName( source.getOperName() );
        target.setDeptName( source.getDeptName() );
        target.setOperUrl( source.getOperUrl() );
        target.setOperIp( source.getOperIp() );
        target.setOperLocation( source.getOperLocation() );
        target.setOperParam( source.getOperParam() );
        target.setJsonResult( source.getJsonResult() );
        target.setStatus( source.getStatus() );
        target.setErrorMsg( source.getErrorMsg() );
        target.setOperTime( source.getOperTime() );

        return target;
    }
}
