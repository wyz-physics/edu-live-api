package com.macro.mall.tiny.modules.cms.service.impl;

import com.macro.mall.tiny.modules.cms.entity.CmsComment;
import com.macro.mall.tiny.modules.cms.mapper.CmsCommentMapper;
import com.macro.mall.tiny.modules.cms.service.CmsCommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.macro.mall.tiny.security.util.SecurityUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author piao
 * @since 2020-10-27
 */
@Service
public class CmsCommentServiceImpl extends ServiceImpl<CmsCommentMapper, CmsComment> implements CmsCommentService {
    @Resource
    private CmsCommentService commentService;

    @Override
    public Boolean create(CmsComment comment){
        comment.setCreateTime(new Date(System.currentTimeMillis()));
        comment.setUpdateTime(new Date(System.currentTimeMillis()));
        Long userId = SecurityUtils.getCurrentUserId();
        comment.setUserId(userId);
        return commentService.save(comment);
    }
}
