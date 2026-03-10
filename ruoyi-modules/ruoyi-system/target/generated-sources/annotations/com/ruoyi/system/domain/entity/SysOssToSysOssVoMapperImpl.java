package com.ruoyi.system.domain.entity;

import com.ruoyi.system.domain.vo.SysOssVo;
import java.time.ZoneOffset;
import java.util.Date;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-06T21:50:19+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class SysOssToSysOssVoMapperImpl implements SysOssToSysOssVoMapper {

    @Override
    public SysOssVo convert(SysOss arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysOssVo sysOssVo = new SysOssVo();

        sysOssVo.setOssId( arg0.getOssId() );
        sysOssVo.setFileName( arg0.getFileName() );
        sysOssVo.setOriginalName( arg0.getOriginalName() );
        sysOssVo.setFileSuffix( arg0.getFileSuffix() );
        sysOssVo.setUrl( arg0.getUrl() );
        if ( arg0.getCreateTime() != null ) {
            sysOssVo.setCreateTime( Date.from( arg0.getCreateTime().toInstant( ZoneOffset.UTC ) ) );
        }
        sysOssVo.setCreateBy( arg0.getCreateBy() );
        sysOssVo.setService( arg0.getService() );

        return sysOssVo;
    }

    @Override
    public SysOssVo convert(SysOss source, SysOssVo target) {
        if ( source == null ) {
            return target;
        }

        target.setOssId( source.getOssId() );
        target.setFileName( source.getFileName() );
        target.setOriginalName( source.getOriginalName() );
        target.setFileSuffix( source.getFileSuffix() );
        target.setUrl( source.getUrl() );
        if ( source.getCreateTime() != null ) {
            target.setCreateTime( Date.from( source.getCreateTime().toInstant( ZoneOffset.UTC ) ) );
        }
        else {
            target.setCreateTime( null );
        }
        target.setCreateBy( source.getCreateBy() );
        target.setService( source.getService() );

        return target;
    }
}
