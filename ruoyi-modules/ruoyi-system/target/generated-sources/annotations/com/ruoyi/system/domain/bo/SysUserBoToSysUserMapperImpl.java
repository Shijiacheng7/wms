package com.ruoyi.system.domain.bo;

import com.ruoyi.system.domain.entity.SysRole;
import com.ruoyi.system.domain.entity.SysUser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-06T21:50:19+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class SysUserBoToSysUserMapperImpl implements SysUserBoToSysUserMapper {

    @Override
    public SysUser convert(SysUserBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysUser sysUser = new SysUser();

        sysUser.setSearchValue( arg0.getSearchValue() );
        sysUser.setCreateBy( arg0.getCreateBy() );
        sysUser.setCreateTime( arg0.getCreateTime() );
        sysUser.setUpdateBy( arg0.getUpdateBy() );
        sysUser.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            sysUser.setParams( new LinkedHashMap<String, Object>( map ) );
        }
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
        sysUser.setDept( arg0.getDept() );
        List<SysRole> list = arg0.getRoles();
        if ( list != null ) {
            sysUser.setRoles( new ArrayList<SysRole>( list ) );
        }
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
    public SysUser convert(SysUserBo source, SysUser target) {
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
        target.setDept( source.getDept() );
        if ( target.getRoles() != null ) {
            List<SysRole> list = source.getRoles();
            if ( list != null ) {
                target.getRoles().clear();
                target.getRoles().addAll( list );
            }
            else {
                target.setRoles( null );
            }
        }
        else {
            List<SysRole> list = source.getRoles();
            if ( list != null ) {
                target.setRoles( new ArrayList<SysRole>( list ) );
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
}
