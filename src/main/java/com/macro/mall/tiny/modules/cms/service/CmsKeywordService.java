package com.macro.mall.tiny.modules.cms.service;

import com.macro.mall.tiny.modules.cms.entity.CmsKeyword;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author piao
 * @since 2020-10-27
 */
public interface CmsKeywordService extends IService<CmsKeyword> {

    /**
     * 创建关键字
     * @param keyword
     * @return
     */
    Boolean create(CmsKeyword keyword);

    /**
     * 编辑关键字
     * @param keyword
     * @return
     */
    Boolean update(CmsKeyword keyword);

    /**
     * 删除关键字
     * @param id
     * @return
     */
    Boolean delete(Long id);

    /**
     * 获取关键字列表
     * @return
     */
    List<CmsKeyword> queryList();

    /**
     * 关键字详情
     * @param id
     * @return
     */
    CmsKeyword findById(Long id);

}
