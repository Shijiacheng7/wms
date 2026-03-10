package com.ruoyi.system.domain.bo;

import com.ruoyi.system.domain.entity.SysNotice;
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
public class SysNoticeBoToSysNoticeMapperImpl implements SysNoticeBoToSysNoticeMapper {

    @Override
    public SysNotice convert(SysNoticeBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysNotice sysNotice = new SysNotice();

        sysNotice.setSearchValue( arg0.getSearchValue() );
        sysNotice.setCreateBy( arg0.getCreateBy() );
        sysNotice.setCreateTime( arg0.getCreateTime() );
        sysNotice.setUpdateBy( arg0.getUpdateBy() );
        sysNotice.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            sysNotice.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        sysNotice.setNoticeId( arg0.getNoticeId() );
        sysNotice.setNoticeTitle( arg0.getNoticeTitle() );
        sysNotice.setNoticeType( arg0.getNoticeType() );
        sysNotice.setNoticeContent( arg0.getNoticeContent() );
        sysNotice.setStatus( arg0.getStatus() );
        sysNotice.setRemark( arg0.getRemark() );

        return sysNotice;
    }

    @Override
    public SysNotice convert(SysNoticeBo source, SysNotice target) {
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
        target.setNoticeId( source.getNoticeId() );
        target.setNoticeTitle( source.getNoticeTitle() );
        target.setNoticeType( source.getNoticeType() );
        target.setNoticeContent( source.getNoticeContent() );
        target.setStatus( source.getStatus() );
        target.setRemark( source.getRemark() );

        return target;
    }
}
