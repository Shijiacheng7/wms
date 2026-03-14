package com.ruoyi.wms.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ruoyi.common.core.constant.HttpStatus;
import com.ruoyi.common.core.exception.ServiceException;
import com.ruoyi.common.core.utils.MapstructUtils;
import com.ruoyi.common.core.utils.StringUtils;
import com.ruoyi.common.mybatis.core.page.PageQuery;
import com.ruoyi.common.mybatis.core.page.TableDataInfo;
import com.ruoyi.wms.domain.bo.MerchantBo;
import com.ruoyi.wms.domain.entity.Merchant;
import com.ruoyi.wms.domain.entity.ReceiptOrder;
import com.ruoyi.wms.domain.vo.MerchantVo;
import com.ruoyi.wms.mapper.MerchantMapper;
import com.ruoyi.wms.mapper.ReceiptOrderMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 往来单位Service业务层处理
 */
@RequiredArgsConstructor
@Service
public class MerchantService {

    private final MerchantMapper merchantMapper;
    private final ReceiptOrderMapper receiptOrderMapper;

    /**
     * 查询往来单位
     */
    public MerchantVo queryById(Long id){
        return merchantMapper.selectVoById(id);
    }

    /**
     * 查询往来单位列表
     */
    public TableDataInfo<MerchantVo> queryPageList(MerchantBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<Merchant> lqw = buildQueryWrapper(bo);
        Page<MerchantVo> result = merchantMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询往来单位列表
     */
    public List<MerchantVo> queryList(MerchantBo bo) {
        LambdaQueryWrapper<Merchant> lqw = buildQueryWrapper(bo);
        return merchantMapper.selectVoList(lqw);
    }

    /**
     * 构建往来单位查询条件包装器
     * 根据传入的业务对象动态构建查询条件，支持按编码、名称、类型进行筛选
     *
     * @param bo 往来单位业务对象，包含查询条件参数
     *           - merchantCode: 企业编码（精确匹配）
     *           - merchantName: 企业名称（模糊匹配）
     *           - merchantType: 企业类型（精确匹配）
     * @return LambdaQueryWrapper<Merchant> 查询条件包装器，用于数据库查询
     */
    private LambdaQueryWrapper<Merchant> buildQueryWrapper(MerchantBo bo) {
        // 获取业务对象中的通用参数字段
        Map<String, Object> params = bo.getParams();
        // 初始化 Lambda 查询包装器
        LambdaQueryWrapper<Merchant> lqw = Wrappers.lambdaQuery();
        // 根据企业编码构建精确相等查询条件
        lqw.eq(StringUtils.isNotBlank(bo.getMerchantCode()), Merchant::getMerchantCode, bo.getMerchantCode());
        // 根据企业名称构建模糊查询条件
        lqw.like(StringUtils.isNotBlank(bo.getMerchantName()), Merchant::getMerchantName, bo.getMerchantName());
        // 根据企业类型构建精确相等查询条件
        lqw.eq(bo.getMerchantType() != null, Merchant::getMerchantType, bo.getMerchantType());
        return lqw;
    }

    /**
     * 新增往来单位
     */
    public void insertByBo(MerchantBo bo) {
        Merchant add = MapstructUtils.convert(bo, Merchant.class);
        merchantMapper.insert(add);
    }

    /**
     * 修改往来单位
     */
    public void updateByBo(MerchantBo bo) {
        Merchant update = MapstructUtils.convert(bo, Merchant.class);
        merchantMapper.updateById(update);
    }

    /**
     * 删除往来单位
     */
    public void deleteById(Long id) {
        validateIdBeforeDelete(id);
        merchantMapper.deleteById(id);
    }

    private void validateIdBeforeDelete(Long id) {
        LambdaQueryWrapper<ReceiptOrder> receiptOrderLqw = Wrappers.lambdaQuery();
        receiptOrderLqw.eq(ReceiptOrder::getMerchantId, id);
        Long receiptOrderCount = receiptOrderMapper.selectCount(receiptOrderLqw);
        if (receiptOrderCount != null && receiptOrderCount > 0) {
            throw new ServiceException("删除失败", HttpStatus.CONFLICT,"该企业已有业务关联，无法删除！");
        }
    }

    /**
     * 批量删除往来单位
     */
    public void deleteByIds(Collection<Long> ids) {
        merchantMapper.deleteBatchIds(ids);
    }
}
