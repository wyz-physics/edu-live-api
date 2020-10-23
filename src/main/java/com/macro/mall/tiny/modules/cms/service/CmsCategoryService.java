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

    Boolean create(CmsCategory category);
    Boolean update(CmsCategory category);
    Boolean delete(Long id);
    List<CmsCategory> queryList();

}
