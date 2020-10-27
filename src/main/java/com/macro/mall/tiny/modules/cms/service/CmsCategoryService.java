package com.macro.mall.tiny.modules.cms.service;

import com.macro.mall.tiny.modules.cms.entity.CmsCategory;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author piao
 * @since 2020-10-22
 */
public interface CmsCategoryService extends IService<CmsCategory> {

    /**
     * 新建类目
     * @param category
     * @return
     */
    Boolean create(CmsCategory category);
    /**
     * 类目级别
     * @param category
     * @return
     */
    Boolean update(CmsCategory category);
    /**
     * 删除类目及其子类目
     * @param id
     * @return
     */
    Boolean delete(Long id);
    /**
     * 查询类目列表
     * @return
     */
    List<CmsCategory> queryList();

    /**
     * 获取分类详情
     * @param id
     * @return
     */
    CmsCategory findById(Long id);
}
