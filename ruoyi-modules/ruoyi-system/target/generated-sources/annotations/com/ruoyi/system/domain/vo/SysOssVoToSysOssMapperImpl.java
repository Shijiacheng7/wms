package com.ruoyi.system.domain.vo;

import com.ruoyi.system.domain.entity.SysOss;
import java.time.LocalDateTime;
import java.time.ZoneId;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-06T21:50:19+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class SysOssVoToSysOssMapperImpl implements SysOssVoToSysOssMapper {

    @Override
    public SysOss convert(SysOssVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysOss sysOss = new SysOss();

        sysOss.setCreateBy( arg0.getCreateBy() );
        if ( arg0.getCreateTime() != null ) {
            sysOss.setCreateTime( LocalDateTime.ofInstant( arg0.getCreateTime().toInstant(), ZoneId.of( "UTC" ) ) );
        }
        sysOss.setOssId( arg0.getOssId() );
        sysOss.setFileName( arg0.getFileName() );
        sysOss.setOriginalName( arg0.getOriginalName() );
        sysOss.setFileSuffix( arg0.getFileSuffix() );
        sysOss.setUrl( arg0.getUrl() );
        sysOss.setService( arg0.getService() );

        return sysOss;
    }

    @Override
    public SysOss convert(SysOssVo source, SysOss target) {
        if ( source == null ) {
            return target;
        }

        target.setCreateBy( source.getCreateBy() );
        if ( source.getCreateTime() != null ) {
            target.setCreateTime( LocalDateTime.ofInstant( source.getCreateTime().toInstant(), ZoneId.of( "UTC" ) ) );
        }
        else {
            target.setCreateTime( null );
        }
        target.setOssId( source.getOssId() );
        target.setFileName( source.getFileName() );
        target.setOriginalName( source.getOriginalName() );
        target.setFileSuffix( source.getFileSuffix() );
        target.setUrl( source.getUrl() );
        target.setService( source.getService() );

        return target;
    }
}
