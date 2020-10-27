package com.macro.mall.tiny.modules.cms.service;

import com.macro.mall.tiny.modules.cms.entity.CmsCommonProblems;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author piao
 * @since 2020-10-26
 */
public interface CmsCommonProblemsService extends IService<CmsCommonProblems> {

    /**
     * 创建常见问题
     * @param commonProblems
     * @return
     */
    Boolean create(CmsCommonProblems commonProblems);

    /**
     * 编辑常见问题
     * @param commonProblems
     * @return
     */
    Boolean update(CmsCommonProblems commonProblems);

    /**
     * 删除常见问题
     * @param id
     * @return
     */
    Boolean delete(Long id);

    /**
     *获取常见问题列表
     * @return
     */
    List<CmsCommonProblems> queryList();

    /**
     * 获取常见问题详情
     * @param id
     * @return
     */
    CmsCommonProblems findById(Long id);
}
