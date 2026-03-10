package com.ruoyi.system.domain.entity;

import com.ruoyi.system.domain.vo.SysConfigVo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-06T21:50:19+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class SysConfigToSysConfigVoMapperImpl implements SysConfigToSysConfigVoMapper {

    @Override
    public SysConfigVo convert(SysConfig arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysConfigVo sysConfigVo = new SysConfigVo();

        sysConfigVo.setConfigId( arg0.getConfigId() );
        sysConfigVo.setConfigName( arg0.getConfigName() );
        sysConfigVo.setConfigKey( arg0.getConfigKey() );
        sysConfigVo.setConfigValue( arg0.getConfigValue() );
        sysConfigVo.setConfigType( arg0.getConfigType() );
        sysConfigVo.setRemark( arg0.getRemark() );
        sysConfigVo.setCreateTime( arg0.getCreateTime() );

        return sysConfigVo;
    }

    @Override
    public SysConfigVo convert(SysConfig source, SysConfigVo target) {
        if ( source == null ) {
            return target;
        }

        target.setConfigId( source.getConfigId() );
        target.setConfigName( source.getConfigName() );
        target.setConfigKey( source.getConfigKey() );
        target.setConfigValue( source.getConfigValue() );
        target.setConfigType( source.getConfigType() );
        target.setRemark( source.getRemark() );
        target.setCreateTime( source.getCreateTime() );

        return target;
    }
}
