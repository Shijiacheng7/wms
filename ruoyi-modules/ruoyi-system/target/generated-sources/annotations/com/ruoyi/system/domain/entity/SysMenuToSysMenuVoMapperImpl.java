package com.ruoyi.system.domain.entity;

import com.ruoyi.system.domain.vo.SysMenuVo;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-13T16:37:58+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.9 (Oracle Corporation)"
)
@Component
public class SysMenuToSysMenuVoMapperImpl implements SysMenuToSysMenuVoMapper {

    @Override
    public SysMenuVo convert(SysMenu arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysMenuVo sysMenuVo = new SysMenuVo();

        sysMenuVo.setMenuId( arg0.getMenuId() );
        sysMenuVo.setMenuName( arg0.getMenuName() );
        sysMenuVo.setParentId( arg0.getParentId() );
        sysMenuVo.setOrderNum( arg0.getOrderNum() );
        sysMenuVo.setPath( arg0.getPath() );
        sysMenuVo.setComponent( arg0.getComponent() );
        sysMenuVo.setQueryParam( arg0.getQueryParam() );
        sysMenuVo.setIsFrame( arg0.getIsFrame() );
        sysMenuVo.setIsCache( arg0.getIsCache() );
        sysMenuVo.setMenuType( arg0.getMenuType() );
        sysMenuVo.setVisible( arg0.getVisible() );
        sysMenuVo.setStatus( arg0.getStatus() );
        sysMenuVo.setPerms( arg0.getPerms() );
        sysMenuVo.setIcon( arg0.getIcon() );
        sysMenuVo.setRemark( arg0.getRemark() );
        sysMenuVo.setCreateTime( arg0.getCreateTime() );
        sysMenuVo.setChildren( convert( arg0.getChildren() ) );

        return sysMenuVo;
    }

    @Override
    public SysMenuVo convert(SysMenu source, SysMenuVo target) {
        if ( source == null ) {
            return target;
        }

        target.setMenuId( source.getMenuId() );
        target.setMenuName( source.getMenuName() );
        target.setParentId( source.getParentId() );
        target.setOrderNum( source.getOrderNum() );
        target.setPath( source.getPath() );
        target.setComponent( source.getComponent() );
        target.setQueryParam( source.getQueryParam() );
        target.setIsFrame( source.getIsFrame() );
        target.setIsCache( source.getIsCache() );
        target.setMenuType( source.getMenuType() );
        target.setVisible( source.getVisible() );
        target.setStatus( source.getStatus() );
        target.setPerms( source.getPerms() );
        target.setIcon( source.getIcon() );
        target.setRemark( source.getRemark() );
        target.setCreateTime( source.getCreateTime() );
        if ( target.getChildren() != null ) {
            List<SysMenuVo> list = convert( source.getChildren() );
            if ( list != null ) {
                target.getChildren().clear();
                target.getChildren().addAll( list );
            }
            else {
                target.setChildren( null );
            }
        }
        else {
            List<SysMenuVo> list = convert( source.getChildren() );
            if ( list != null ) {
                target.setChildren( list );
            }
        }

        return target;
    }
}
