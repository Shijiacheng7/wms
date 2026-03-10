package com.ruoyi.system.domain.bo;

import com.ruoyi.system.domain.entity.SysOssConfig;
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
public class SysOssConfigBoToSysOssConfigMapperImpl implements SysOssConfigBoToSysOssConfigMapper {

    @Override
    public SysOssConfig convert(SysOssConfigBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysOssConfig sysOssConfig = new SysOssConfig();

        sysOssConfig.setSearchValue( arg0.getSearchValue() );
        sysOssConfig.setCreateBy( arg0.getCreateBy() );
        sysOssConfig.setCreateTime( arg0.getCreateTime() );
        sysOssConfig.setUpdateBy( arg0.getUpdateBy() );
        sysOssConfig.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            sysOssConfig.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        sysOssConfig.setOssConfigId( arg0.getOssConfigId() );
        sysOssConfig.setConfigKey( arg0.getConfigKey() );
        sysOssConfig.setAccessKey( arg0.getAccessKey() );
        sysOssConfig.setSecretKey( arg0.getSecretKey() );
        sysOssConfig.setBucketName( arg0.getBucketName() );
        sysOssConfig.setPrefix( arg0.getPrefix() );
        sysOssConfig.setEndpoint( arg0.getEndpoint() );
        sysOssConfig.setDomain( arg0.getDomain() );
        sysOssConfig.setIsHttps( arg0.getIsHttps() );
        sysOssConfig.setRegion( arg0.getRegion() );
        sysOssConfig.setStatus( arg0.getStatus() );
        sysOssConfig.setExt1( arg0.getExt1() );
        sysOssConfig.setRemark( arg0.getRemark() );
        sysOssConfig.setAccessPolicy( arg0.getAccessPolicy() );

        return sysOssConfig;
    }

    @Override
    public SysOssConfig convert(SysOssConfigBo source, SysOssConfig target) {
        if ( source == null ) {
            return target;
        }

        target.setSearchValue( source.getSearchValue() );
        target.setCreateBy( source.getCreateBy() );
        target.setCreateTime( source.getCreateTime() );
        target.setUpdateBy( source.getUpdateBy() );
        target.setUpdateTime( source.getUpdateTime() );
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
        target.setOssConfigId( source.getOssConfigId() );
        target.setConfigKey( source.getConfigKey() );
        target.setAccessKey( source.getAccessKey() );
        target.setSecretKey( source.getSecretKey() );
        target.setBucketName( source.getBucketName() );
        target.setPrefix( source.getPrefix() );
        target.setEndpoint( source.getEndpoint() );
        target.setDomain( source.getDomain() );
        target.setIsHttps( source.getIsHttps() );
        target.setRegion( source.getRegion() );
        target.setStatus( source.getStatus() );
        target.setExt1( source.getExt1() );
        target.setRemark( source.getRemark() );
        target.setAccessPolicy( source.getAccessPolicy() );

        return target;
    }
}
