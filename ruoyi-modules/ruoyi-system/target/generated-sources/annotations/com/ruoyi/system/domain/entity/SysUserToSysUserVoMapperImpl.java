package com.ruoyi.system.domain.entity;

import com.ruoyi.system.domain.vo.SysRoleVo;
import com.ruoyi.system.domain.vo.SysUserVo;
import io.github.linpeilie.ConvertMapperAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-06T21:50:18+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class SysUserToSysUserVoMapperImpl implements SysUserToSysUserVoMapper {

    @Autowired
    private ConvertMapperAdapter convertMapperAdapter;

    @Override
    public SysUserVo convert(SysUser arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysUserVo sysUserVo = new SysUserVo();

        sysUserVo.setUserId( arg0.getUserId() );
        sysUserVo.setDeptId( arg0.getDeptId() );
        sysUserVo.setUserName( arg0.getUserName() );
        sysUserVo.setNickName( arg0.getNickName() );
        sysUserVo.setUserType( arg0.getUserType() );
        sysUserVo.setEmail( arg0.getEmail() );
        sysUserVo.setPhonenumber( arg0.getPhonenumber() );
        sysUserVo.setSex( arg0.getSex() );
        sysUserVo.setAvatar( arg0.getAvatar() );
        sysUserVo.setPassword( arg0.getPassword() );
        sysUserVo.setStatus( arg0.getStatus() );
        sysUserVo.setDelFlag( arg0.getDelFlag() );
        sysUserVo.setLoginIp( arg0.getLoginIp() );
        sysUserVo.setLoginDate( arg0.getLoginDate() );
        sysUserVo.setRemark( arg0.getRemark() );
        sysUserVo.setRoles( sysRoleListToSysRoleVoList( arg0.getRoles() ) );
        Long[] roleIds = arg0.getRoleIds();
        if ( roleIds != null ) {
            sysUserVo.setRoleIds( Arrays.copyOf( roleIds, roleIds.length ) );
        }
        Long[] postIds = arg0.getPostIds();
        if ( postIds != null ) {
            sysUserVo.setPostIds( Arrays.copyOf( postIds, postIds.length ) );
        }
        sysUserVo.setRoleId( arg0.getRoleId() );
        sysUserVo.setCreateTime( arg0.getCreateTime() );

        return sysUserVo;
    }

    @Override
    public SysUserVo convert(SysUser source, SysUserVo target) {
        if ( source == null ) {
            return target;
        }

        target.setUserId( source.getUserId() );
        target.setDeptId( source.getDeptId() );
        target.setUserName( source.getUserName() );
        target.setNickName( source.getNickName() );
        target.setUserType( source.getUserType() );
        target.setEmail( source.getEmail() );
        target.setPhonenumber( source.getPhonenumber() );
        target.setSex( source.getSex() );
        target.setAvatar( source.getAvatar() );
        target.setPassword( source.getPassword() );
        target.setStatus( source.getStatus() );
        target.setDelFlag( source.getDelFlag() );
        target.setLoginIp( source.getLoginIp() );
        target.setLoginDate( source.getLoginDate() );
        target.setRemark( source.getRemark() );
        if ( target.getRoles() != null ) {
            List<SysRoleVo> list = sysRoleListToSysRoleVoList( source.getRoles() );
            if ( list != null ) {
                target.getRoles().clear();
                target.getRoles().addAll( list );
            }
            else {
                target.setRoles( null );
            }
        }
        else {
            List<SysRoleVo> list = sysRoleListToSysRoleVoList( source.getRoles() );
            if ( list != null ) {
                target.setRoles( list );
            }
        }
        Long[] roleIds = source.getRoleIds();
        if ( roleIds != null ) {
            target.setRoleIds( Arrays.copyOf( roleIds, roleIds.length ) );
        }
        else {
            target.setRoleIds( null );
        }
        Long[] postIds = source.getPostIds();
        if ( postIds != null ) {
            target.setPostIds( Arrays.copyOf( postIds, postIds.length ) );
        }
        else {
            target.setPostIds( null );
        }
        target.setRoleId( source.getRoleId() );
        target.setCreateTime( source.getCreateTime() );

        return target;
    }

    protected List<SysRoleVo> sysRoleListToSysRoleVoList(List<SysRole> list) {
        if ( list == null ) {
            return null;
        }

        List<SysRoleVo> list1 = new ArrayList<SysRoleVo>( list.size() );
        for ( SysRole sysRole : list ) {
            list1.add( convertMapperAdapter.com_ruoyi_system_domain_entity_SysRoleToSysRoleVo( sysRole ) );
        }

        return list1;
    }
}
