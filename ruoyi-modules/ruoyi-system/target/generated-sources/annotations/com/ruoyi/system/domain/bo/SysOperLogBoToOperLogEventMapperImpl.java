package com.ruoyi.system.domain.bo;

import com.ruoyi.common.log.event.OperLogEvent;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.Date;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-13T16:37:58+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.9 (Oracle Corporation)"
)
@Component
public class SysOperLogBoToOperLogEventMapperImpl implements SysOperLogBoToOperLogEventMapper {

    @Override
    public OperLogEvent convert(SysOperLogBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        OperLogEvent operLogEvent = new OperLogEvent();

        operLogEvent.setOperId( arg0.getOperId() );
        operLogEvent.setTitle( arg0.getTitle() );
        operLogEvent.setBusinessType( arg0.getBusinessType() );
        Integer[] businessTypes = arg0.getBusinessTypes();
        if ( businessTypes != null ) {
            operLogEvent.setBusinessTypes( Arrays.copyOf( businessTypes, businessTypes.length ) );
        }
        operLogEvent.setMethod( arg0.getMethod() );
        operLogEvent.setRequestMethod( arg0.getRequestMethod() );
        operLogEvent.setOperatorType( arg0.getOperatorType() );
        operLogEvent.setOperName( arg0.getOperName() );
        operLogEvent.setDeptName( arg0.getDeptName() );
        operLogEvent.setOperUrl( arg0.getOperUrl() );
        operLogEvent.setOperIp( arg0.getOperIp() );
        operLogEvent.setOperLocation( arg0.getOperLocation() );
        operLogEvent.setOperParam( arg0.getOperParam() );
        operLogEvent.setJsonResult( arg0.getJsonResult() );
        operLogEvent.setStatus( arg0.getStatus() );
        operLogEvent.setErrorMsg( arg0.getErrorMsg() );
        if ( arg0.getOperTime() != null ) {
            operLogEvent.setOperTime( Date.from( arg0.getOperTime().toInstant( ZoneOffset.UTC ) ) );
        }
        operLogEvent.setCostTime( arg0.getCostTime() );

        return operLogEvent;
    }

    @Override
    public OperLogEvent convert(SysOperLogBo source, OperLogEvent target) {
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
        if ( source.getOperTime() != null ) {
            target.setOperTime( Date.from( source.getOperTime().toInstant( ZoneOffset.UTC ) ) );
        }
        else {
            target.setOperTime( null );
        }
        target.setCostTime( source.getCostTime() );

        return target;
    }
}
