package io.github.linpeilie;

import com.ruoyi.common.log.event.OperLogEvent;
import com.ruoyi.common.log.event.OperLogEventToSysOperLogBoMapper;
import com.ruoyi.common.log.event.OperLogEventToSysOperLogMapper;
import com.ruoyi.system.domain.bo.SysConfigBo;
import com.ruoyi.system.domain.bo.SysConfigBoToSysConfigMapper;
import com.ruoyi.system.domain.bo.SysDeptBo;
import com.ruoyi.system.domain.bo.SysDeptBoToSysDeptMapper;
import com.ruoyi.system.domain.bo.SysDictDataBo;
import com.ruoyi.system.domain.bo.SysDictDataBoToSysDictDataMapper;
import com.ruoyi.system.domain.bo.SysDictTypeBo;
import com.ruoyi.system.domain.bo.SysDictTypeBoToSysDictTypeMapper;
import com.ruoyi.system.domain.bo.SysLogininforBo;
import com.ruoyi.system.domain.bo.SysLogininforBoToSysLogininforMapper;
import com.ruoyi.system.domain.bo.SysMenuBo;
import com.ruoyi.system.domain.bo.SysMenuBoToSysMenuMapper;
import com.ruoyi.system.domain.bo.SysNoticeBo;
import com.ruoyi.system.domain.bo.SysNoticeBoToSysNoticeMapper;
import com.ruoyi.system.domain.bo.SysOperLogBo;
import com.ruoyi.system.domain.bo.SysOperLogBoToOperLogEventMapper;
import com.ruoyi.system.domain.bo.SysOperLogBoToSysOperLogMapper;
import com.ruoyi.system.domain.bo.SysOssBo;
import com.ruoyi.system.domain.bo.SysOssBoToSysOssMapper;
import com.ruoyi.system.domain.bo.SysOssConfigBo;
import com.ruoyi.system.domain.bo.SysOssConfigBoToSysOssConfigMapper;
import com.ruoyi.system.domain.bo.SysPostBo;
import com.ruoyi.system.domain.bo.SysPostBoToSysPostMapper;
import com.ruoyi.system.domain.bo.SysRoleBo;
import com.ruoyi.system.domain.bo.SysRoleBoToSysRoleMapper;
import com.ruoyi.system.domain.bo.SysUserBo;
import com.ruoyi.system.domain.bo.SysUserBoToSysUserMapper;
import com.ruoyi.system.domain.entity.SysConfig;
import com.ruoyi.system.domain.entity.SysConfigToSysConfigVoMapper;
import com.ruoyi.system.domain.entity.SysDept;
import com.ruoyi.system.domain.entity.SysDeptToSysDeptVoMapper;
import com.ruoyi.system.domain.entity.SysDictData;
import com.ruoyi.system.domain.entity.SysDictDataToSysDictDataVoMapper;
import com.ruoyi.system.domain.entity.SysDictType;
import com.ruoyi.system.domain.entity.SysDictTypeToSysDictTypeVoMapper;
import com.ruoyi.system.domain.entity.SysLogininfor;
import com.ruoyi.system.domain.entity.SysLogininforToSysLogininforVoMapper;
import com.ruoyi.system.domain.entity.SysMenu;
import com.ruoyi.system.domain.entity.SysMenuToSysMenuVoMapper;
import com.ruoyi.system.domain.entity.SysNotice;
import com.ruoyi.system.domain.entity.SysNoticeToSysNoticeVoMapper;
import com.ruoyi.system.domain.entity.SysOperLog;
import com.ruoyi.system.domain.entity.SysOperLogToOperLogEventMapper;
import com.ruoyi.system.domain.entity.SysOperLogToSysOperLogVoMapper;
import com.ruoyi.system.domain.entity.SysOss;
import com.ruoyi.system.domain.entity.SysOssConfig;
import com.ruoyi.system.domain.entity.SysOssConfigToSysOssConfigVoMapper;
import com.ruoyi.system.domain.entity.SysOssToSysOssVoMapper;
import com.ruoyi.system.domain.entity.SysPost;
import com.ruoyi.system.domain.entity.SysPostToSysPostVoMapper;
import com.ruoyi.system.domain.entity.SysRole;
import com.ruoyi.system.domain.entity.SysRoleToSysRoleVoMapper;
import com.ruoyi.system.domain.entity.SysUser;
import com.ruoyi.system.domain.entity.SysUserToSysUserExportVoMapper;
import com.ruoyi.system.domain.entity.SysUserToSysUserVoMapper;
import com.ruoyi.system.domain.vo.SysConfigVo;
import com.ruoyi.system.domain.vo.SysConfigVoToSysConfigMapper;
import com.ruoyi.system.domain.vo.SysDeptVo;
import com.ruoyi.system.domain.vo.SysDeptVoToSysDeptMapper;
import com.ruoyi.system.domain.vo.SysDictDataVo;
import com.ruoyi.system.domain.vo.SysDictDataVoToSysDictDataMapper;
import com.ruoyi.system.domain.vo.SysDictTypeVo;
import com.ruoyi.system.domain.vo.SysDictTypeVoToSysDictTypeMapper;
import com.ruoyi.system.domain.vo.SysLogininforVo;
import com.ruoyi.system.domain.vo.SysLogininforVoToSysLogininforMapper;
import com.ruoyi.system.domain.vo.SysMenuVo;
import com.ruoyi.system.domain.vo.SysMenuVoToSysMenuMapper;
import com.ruoyi.system.domain.vo.SysNoticeVo;
import com.ruoyi.system.domain.vo.SysNoticeVoToSysNoticeMapper;
import com.ruoyi.system.domain.vo.SysOperLogVo;
import com.ruoyi.system.domain.vo.SysOperLogVoToSysOperLogMapper;
import com.ruoyi.system.domain.vo.SysOssConfigVo;
import com.ruoyi.system.domain.vo.SysOssConfigVoToSysOssConfigMapper;
import com.ruoyi.system.domain.vo.SysOssVo;
import com.ruoyi.system.domain.vo.SysOssVoToSysOssMapper;
import com.ruoyi.system.domain.vo.SysPostVo;
import com.ruoyi.system.domain.vo.SysPostVoToSysPostMapper;
import com.ruoyi.system.domain.vo.SysRoleVo;
import com.ruoyi.system.domain.vo.SysRoleVoToSysRoleMapper;
import com.ruoyi.system.domain.vo.SysUserExportVo;
import com.ruoyi.system.domain.vo.SysUserVo;
import com.ruoyi.system.domain.vo.SysUserVoToSysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ConvertMapperAdapter {
  @Autowired
  @Lazy
  private SysConfigBoToSysConfigMapper sysConfigBoToSysConfigMapper;

  @Autowired
  @Lazy
  private SysOperLogBoToSysOperLogMapper sysOperLogBoToSysOperLogMapper;

  @Autowired
  @Lazy
  private SysPostToSysPostVoMapper sysPostToSysPostVoMapper;

  @Autowired
  @Lazy
  private SysUserBoToSysUserMapper sysUserBoToSysUserMapper;

  @Autowired
  @Lazy
  private SysOssToSysOssVoMapper sysOssToSysOssVoMapper;

  @Autowired
  @Lazy
  private SysRoleVoToSysRoleMapper sysRoleVoToSysRoleMapper;

  @Autowired
  @Lazy
  private SysLogininforVoToSysLogininforMapper sysLogininforVoToSysLogininforMapper;

  @Autowired
  @Lazy
  private SysOssConfigToSysOssConfigVoMapper sysOssConfigToSysOssConfigVoMapper;

  @Autowired
  @Lazy
  private SysNoticeVoToSysNoticeMapper sysNoticeVoToSysNoticeMapper;

  @Autowired
  @Lazy
  private SysNoticeToSysNoticeVoMapper sysNoticeToSysNoticeVoMapper;

  @Autowired
  @Lazy
  private SysPostVoToSysPostMapper sysPostVoToSysPostMapper;

  @Autowired
  @Lazy
  private SysOperLogBoToOperLogEventMapper sysOperLogBoToOperLogEventMapper;

  @Autowired
  @Lazy
  private SysMenuBoToSysMenuMapper sysMenuBoToSysMenuMapper;

  @Autowired
  @Lazy
  private SysConfigVoToSysConfigMapper sysConfigVoToSysConfigMapper;

  @Autowired
  @Lazy
  private SysDictDataVoToSysDictDataMapper sysDictDataVoToSysDictDataMapper;

  @Autowired
  @Lazy
  private SysNoticeBoToSysNoticeMapper sysNoticeBoToSysNoticeMapper;

  @Autowired
  @Lazy
  private SysUserToSysUserVoMapper sysUserToSysUserVoMapper;

  @Autowired
  @Lazy
  private SysPostBoToSysPostMapper sysPostBoToSysPostMapper;

  @Autowired
  @Lazy
  private SysUserToSysUserExportVoMapper sysUserToSysUserExportVoMapper;

  @Autowired
  @Lazy
  private SysMenuVoToSysMenuMapper sysMenuVoToSysMenuMapper;

  @Autowired
  @Lazy
  private SysDictTypeVoToSysDictTypeMapper sysDictTypeVoToSysDictTypeMapper;

  @Autowired
  @Lazy
  private SysRoleBoToSysRoleMapper sysRoleBoToSysRoleMapper;

  @Autowired
  @Lazy
  private SysOssVoToSysOssMapper sysOssVoToSysOssMapper;

  @Autowired
  @Lazy
  private SysDictDataBoToSysDictDataMapper sysDictDataBoToSysDictDataMapper;

  @Autowired
  @Lazy
  private SysRoleToSysRoleVoMapper sysRoleToSysRoleVoMapper;

  @Autowired
  @Lazy
  private SysConfigToSysConfigVoMapper sysConfigToSysConfigVoMapper;

  @Autowired
  @Lazy
  private SysDictTypeBoToSysDictTypeMapper sysDictTypeBoToSysDictTypeMapper;

  @Autowired
  @Lazy
  private SysOperLogToSysOperLogVoMapper sysOperLogToSysOperLogVoMapper;

  @Autowired
  @Lazy
  private SysLogininforToSysLogininforVoMapper sysLogininforToSysLogininforVoMapper;

  @Autowired
  @Lazy
  private SysDeptToSysDeptVoMapper sysDeptToSysDeptVoMapper;

  @Autowired
  @Lazy
  private SysDictDataToSysDictDataVoMapper sysDictDataToSysDictDataVoMapper;

  @Autowired
  @Lazy
  private SysOperLogVoToSysOperLogMapper sysOperLogVoToSysOperLogMapper;

  @Autowired
  @Lazy
  private SysUserVoToSysUserMapper sysUserVoToSysUserMapper;

  @Autowired
  @Lazy
  private SysOssConfigVoToSysOssConfigMapper sysOssConfigVoToSysOssConfigMapper;

  @Autowired
  @Lazy
  private SysMenuToSysMenuVoMapper sysMenuToSysMenuVoMapper;

  @Autowired
  @Lazy
  private SysOssConfigBoToSysOssConfigMapper sysOssConfigBoToSysOssConfigMapper;

  @Autowired
  @Lazy
  private SysOssBoToSysOssMapper sysOssBoToSysOssMapper;

  @Autowired
  @Lazy
  private OperLogEventToSysOperLogMapper operLogEventToSysOperLogMapper;

  @Autowired
  @Lazy
  private SysDeptVoToSysDeptMapper sysDeptVoToSysDeptMapper;

  @Autowired
  @Lazy
  private SysLogininforBoToSysLogininforMapper sysLogininforBoToSysLogininforMapper;

  @Autowired
  @Lazy
  private SysDictTypeToSysDictTypeVoMapper sysDictTypeToSysDictTypeVoMapper;

  @Autowired
  @Lazy
  private SysDeptBoToSysDeptMapper sysDeptBoToSysDeptMapper;

  @Autowired
  @Lazy
  private OperLogEventToSysOperLogBoMapper operLogEventToSysOperLogBoMapper;

  @Autowired
  @Lazy
  private SysOperLogToOperLogEventMapper sysOperLogToOperLogEventMapper;

  public SysConfig com_ruoyi_system_domain_bo_SysConfigBoToSysConfig(SysConfigBo param) {
    return sysConfigBoToSysConfigMapper.convert(param);}

  public SysOperLog com_ruoyi_system_domain_bo_SysOperLogBoToSysOperLog(SysOperLogBo param) {
    return sysOperLogBoToSysOperLogMapper.convert(param);}

  public SysPostVo com_ruoyi_system_domain_entity_SysPostToSysPostVo(SysPost param) {
    return sysPostToSysPostVoMapper.convert(param);}

  public SysUser com_ruoyi_system_domain_bo_SysUserBoToSysUser(SysUserBo param) {
    return sysUserBoToSysUserMapper.convert(param);}

  public SysOssVo com_ruoyi_system_domain_entity_SysOssToSysOssVo(SysOss param) {
    return sysOssToSysOssVoMapper.convert(param);}

  public SysRole com_ruoyi_system_domain_vo_SysRoleVoToSysRole(SysRoleVo param) {
    return sysRoleVoToSysRoleMapper.convert(param);}

  public SysLogininfor com_ruoyi_system_domain_vo_SysLogininforVoToSysLogininfor(SysLogininforVo param) {
    return sysLogininforVoToSysLogininforMapper.convert(param);}

  public SysOssConfigVo com_ruoyi_system_domain_entity_SysOssConfigToSysOssConfigVo(SysOssConfig param) {
    return sysOssConfigToSysOssConfigVoMapper.convert(param);}

  public SysNotice com_ruoyi_system_domain_vo_SysNoticeVoToSysNotice(SysNoticeVo param) {
    return sysNoticeVoToSysNoticeMapper.convert(param);}

  public SysNoticeVo com_ruoyi_system_domain_entity_SysNoticeToSysNoticeVo(SysNotice param) {
    return sysNoticeToSysNoticeVoMapper.convert(param);}

  public SysPost com_ruoyi_system_domain_vo_SysPostVoToSysPost(SysPostVo param) {
    return sysPostVoToSysPostMapper.convert(param);}

  public OperLogEvent com_ruoyi_system_domain_bo_SysOperLogBoToOperLogEvent(SysOperLogBo param) {
    return sysOperLogBoToOperLogEventMapper.convert(param);}

  public SysMenu com_ruoyi_system_domain_bo_SysMenuBoToSysMenu(SysMenuBo param) {
    return sysMenuBoToSysMenuMapper.convert(param);}

  public SysConfig com_ruoyi_system_domain_vo_SysConfigVoToSysConfig(SysConfigVo param) {
    return sysConfigVoToSysConfigMapper.convert(param);}

  public SysDictData com_ruoyi_system_domain_vo_SysDictDataVoToSysDictData(SysDictDataVo param) {
    return sysDictDataVoToSysDictDataMapper.convert(param);}

  public SysNotice com_ruoyi_system_domain_bo_SysNoticeBoToSysNotice(SysNoticeBo param) {
    return sysNoticeBoToSysNoticeMapper.convert(param);}

  public SysUserVo com_ruoyi_system_domain_entity_SysUserToSysUserVo(SysUser param) {
    return sysUserToSysUserVoMapper.convert(param);}

  public SysPost com_ruoyi_system_domain_bo_SysPostBoToSysPost(SysPostBo param) {
    return sysPostBoToSysPostMapper.convert(param);}

  public SysUserExportVo com_ruoyi_system_domain_entity_SysUserToSysUserExportVo(SysUser param) {
    return sysUserToSysUserExportVoMapper.convert(param);}

  public SysMenu com_ruoyi_system_domain_vo_SysMenuVoToSysMenu(SysMenuVo param) {
    return sysMenuVoToSysMenuMapper.convert(param);}

  public SysDictType com_ruoyi_system_domain_vo_SysDictTypeVoToSysDictType(SysDictTypeVo param) {
    return sysDictTypeVoToSysDictTypeMapper.convert(param);}

  public SysRole com_ruoyi_system_domain_bo_SysRoleBoToSysRole(SysRoleBo param) {
    return sysRoleBoToSysRoleMapper.convert(param);}

  public SysOss com_ruoyi_system_domain_vo_SysOssVoToSysOss(SysOssVo param) {
    return sysOssVoToSysOssMapper.convert(param);}

  public SysDictData com_ruoyi_system_domain_bo_SysDictDataBoToSysDictData(SysDictDataBo param) {
    return sysDictDataBoToSysDictDataMapper.convert(param);}

  public SysRoleVo com_ruoyi_system_domain_entity_SysRoleToSysRoleVo(SysRole param) {
    return sysRoleToSysRoleVoMapper.convert(param);}

  public SysConfigVo com_ruoyi_system_domain_entity_SysConfigToSysConfigVo(SysConfig param) {
    return sysConfigToSysConfigVoMapper.convert(param);}

  public SysDictType com_ruoyi_system_domain_bo_SysDictTypeBoToSysDictType(SysDictTypeBo param) {
    return sysDictTypeBoToSysDictTypeMapper.convert(param);}

  public SysOperLogVo com_ruoyi_system_domain_entity_SysOperLogToSysOperLogVo(SysOperLog param) {
    return sysOperLogToSysOperLogVoMapper.convert(param);}

  public SysLogininforVo com_ruoyi_system_domain_entity_SysLogininforToSysLogininforVo(SysLogininfor param) {
    return sysLogininforToSysLogininforVoMapper.convert(param);}

  public SysDeptVo com_ruoyi_system_domain_entity_SysDeptToSysDeptVo(SysDept param) {
    return sysDeptToSysDeptVoMapper.convert(param);}

  public SysDictDataVo com_ruoyi_system_domain_entity_SysDictDataToSysDictDataVo(SysDictData param) {
    return sysDictDataToSysDictDataVoMapper.convert(param);}

  public SysOperLog com_ruoyi_system_domain_vo_SysOperLogVoToSysOperLog(SysOperLogVo param) {
    return sysOperLogVoToSysOperLogMapper.convert(param);}

  public SysUser com_ruoyi_system_domain_vo_SysUserVoToSysUser(SysUserVo param) {
    return sysUserVoToSysUserMapper.convert(param);}

  public SysOssConfig com_ruoyi_system_domain_vo_SysOssConfigVoToSysOssConfig(SysOssConfigVo param) {
    return sysOssConfigVoToSysOssConfigMapper.convert(param);}

  public SysMenuVo com_ruoyi_system_domain_entity_SysMenuToSysMenuVo(SysMenu param) {
    return sysMenuToSysMenuVoMapper.convert(param);}

  public SysOssConfig com_ruoyi_system_domain_bo_SysOssConfigBoToSysOssConfig(SysOssConfigBo param) {
    return sysOssConfigBoToSysOssConfigMapper.convert(param);}

  public SysOss com_ruoyi_system_domain_bo_SysOssBoToSysOss(SysOssBo param) {
    return sysOssBoToSysOssMapper.convert(param);}

  public SysOperLog com_ruoyi_common_log_event_OperLogEventToSysOperLog(OperLogEvent param) {
    return operLogEventToSysOperLogMapper.convert(param);}

  public SysDept com_ruoyi_system_domain_vo_SysDeptVoToSysDept(SysDeptVo param) {
    return sysDeptVoToSysDeptMapper.convert(param);}

  public SysLogininfor com_ruoyi_system_domain_bo_SysLogininforBoToSysLogininfor(SysLogininforBo param) {
    return sysLogininforBoToSysLogininforMapper.convert(param);}

  public SysDictTypeVo com_ruoyi_system_domain_entity_SysDictTypeToSysDictTypeVo(SysDictType param) {
    return sysDictTypeToSysDictTypeVoMapper.convert(param);}

  public SysDept com_ruoyi_system_domain_bo_SysDeptBoToSysDept(SysDeptBo param) {
    return sysDeptBoToSysDeptMapper.convert(param);}

  public SysOperLogBo com_ruoyi_common_log_event_OperLogEventToSysOperLogBo(OperLogEvent param) {
    return operLogEventToSysOperLogBoMapper.convert(param);}

  public OperLogEvent com_ruoyi_system_domain_entity_SysOperLogToOperLogEvent(SysOperLog param) {
    return sysOperLogToOperLogEventMapper.convert(param);}
}
