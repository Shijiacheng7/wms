package com.ruoyi.system.domain.entity;

import com.ruoyi.system.domain.vo.SysNoticeVo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-06T21:50:20+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class SysNoticeToSysNoticeVoMapperImpl implements SysNoticeToSysNoticeVoMapper {

    @Override
    public SysNoticeVo convert(SysNotice arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysNoticeVo sysNoticeVo = new SysNoticeVo();

        sysNoticeVo.setNoticeId( arg0.getNoticeId() );
        sysNoticeVo.setNoticeTitle( arg0.getNoticeTitle() );
        sysNoticeVo.setNoticeType( arg0.getNoticeType() );
        sysNoticeVo.setNoticeContent( arg0.getNoticeContent() );
        sysNoticeVo.setStatus( arg0.getStatus() );
        sysNoticeVo.setRemark( arg0.getRemark() );
        sysNoticeVo.setCreateBy( arg0.getCreateBy() );
        sysNoticeVo.setCreateTime( arg0.getCreateTime() );

        return sysNoticeVo;
    }

    @Override
    public SysNoticeVo convert(SysNotice source, SysNoticeVo target) {
        if ( source == null ) {
            return target;
        }

        target.setNoticeId( source.getNoticeId() );
        target.setNoticeTitle( source.getNoticeTitle() );
        target.setNoticeType( source.getNoticeType() );
        target.setNoticeContent( source.getNoticeContent() );
        target.setStatus( source.getStatus() );
        target.setRemark( source.getRemark() );
        target.setCreateBy( source.getCreateBy() );
        target.setCreateTime( source.getCreateTime() );

        return target;
    }
}
