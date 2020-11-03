package com.macro.mall.tiny.modules.cms.service;

import com.macro.mall.tiny.modules.cms.entity.CmsComment;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author piao
 * @since 2020-10-27
 */
public interface CmsCommentService extends IService<CmsComment> {

    /**
     * 创建评论
     * @param comment
     * @return
     */
    Boolean create(CmsComment comment);
}
