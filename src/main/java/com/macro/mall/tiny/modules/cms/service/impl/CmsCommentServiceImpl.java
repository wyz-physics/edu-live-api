package com.macro.mall.tiny.modules.cms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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

    @Override
    public Boolean update(CmsComment comment){
        comment.setUpdateTime(new Date(System.currentTimeMillis()));
        return commentService.updateById(comment);
    }

    @Override
    public Boolean delete(Long id){
        return commentService.removeById(id);
    }

//    @Override
//    public Page<CmsComment> queryList(){
//        QueryWrapper<CmsComment> wrapper = new QueryWrapper<>();
//        wrapper.lambda().eq()
//    }
}
