package com.macro.mall.tiny.modules.cms.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.macro.mall.tiny.modules.cms.entity.CmsCommodity;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author piao
 * @since 2020-10-23
 */
public interface CmsCommodityService extends IService<CmsCommodity> {

    /**
     * 创建商品
     * @param commodity
     * @return
     */
    Boolean create(CmsCommodity commodity);

    /**
     * 编辑商品
     * @param commodity
     * @return
     */
    Boolean update(CmsCommodity commodity);

    /**
     * 删除商品
     * @param id
     * @return
     */
    Boolean delete(Long id);

    /**
     * 查询商品列表
     * @param pageNum
     * @param pageSize
     * @return
     */
    Page queryList(Integer pageNum, Integer pageSize);

    /**
     * 查看商品详情
     * @param id
     * @return
     */
    CmsCommodity findById(Long id);

}
