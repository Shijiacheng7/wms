package com.ruoyi.system.domain.vo;

import com.ruoyi.system.domain.entity.SysRole;
import com.ruoyi.system.domain.entity.SysUser;
import io.github.linpeilie.ConvertMapperAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-06T21:50:19+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class SysUserVoToSysUserMapperImpl implements SysUserVoToSysUserMapper {

    @Autowired
    private ConvertMapperAdapter convertMapperAdapter;

    @Override
    public SysUser convert(SysUserVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysUser sysUser = new SysUser();

        sysUser.setCreateTime( arg0.getCreateTime() );
        sysUser.setUserId( arg0.getUserId() );
        sysUser.setDeptId( arg0.getDeptId() );
        sysUser.setUserName( arg0.getUserName() );
        sysUser.setNickName( arg0.getNickName() );
        sysUser.setUserType( arg0.getUserType() );
        sysUser.setEmail( arg0.getEmail() );
        sysUser.setPhonenumber( arg0.getPhonenumber() );
        sysUser.setSex( arg0.getSex() );
        sysUser.setAvatar( arg0.getAvatar() );
        sysUser.setPassword( arg0.getPassword() );
        sysUser.setStatus( arg0.getStatus() );
        sysUser.setDelFlag( arg0.getDelFlag() );
        sysUser.setLoginIp( arg0.getLoginIp() );
        sysUser.setLoginDate( arg0.getLoginDate() );
        sysUser.setRemark( arg0.getRemark() );
        sysUser.setRoles( sysRoleVoListToSysRoleList( arg0.getRoles() ) );
        Long[] roleIds = arg0.getRoleIds();
        if ( roleIds != null ) {
            sysUser.setRoleIds( Arrays.copyOf( roleIds, roleIds.length ) );
        }
        Long[] postIds = arg0.getPostIds();
        if ( postIds != null ) {
            sysUser.setPostIds( Arrays.copyOf( postIds, postIds.length ) );
        }
        sysUser.setRoleId( arg0.getRoleId() );

        return sysUser;
    }

    @Override
    public SysUser convert(SysUserVo source, SysUser target) {
        if ( source == null ) {
            return target;
        }

        target.setCreateTime( source.getCreateTime() );
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
            List<SysRole> list = sysRoleVoListToSysRoleList( source.getRoles() );
            if ( list != null ) {
                target.getRoles().clear();
                target.getRoles().addAll( list );
            }
            else {
                target.setRoles( null );
            }
        }
        else {
            List<SysRole> list = sysRoleVoListToSysRoleList( source.getRoles() );
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

        return target;
    }

    protected List<SysRole> sysRoleVoListToSysRoleList(List<SysRoleVo> list) {
        if ( list == null ) {
            return null;
        }

        List<SysRole> list1 = new ArrayList<SysRole>( list.size() );
        for ( SysRoleVo sysRoleVo : list ) {
            list1.add( convertMapperAdapter.com_ruoyi_system_domain_vo_SysRoleVoToSysRole( sysRoleVo ) );
        }

        return list1;
    }
}
