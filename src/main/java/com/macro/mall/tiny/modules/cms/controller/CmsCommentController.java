package com.macro.mall.tiny.modules.cms.controller;


import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.modules.cms.entity.CmsComment;
import com.macro.mall.tiny.modules.cms.service.CmsCommentService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author piao
 * @since 2020-10-27
 */
@RestController
@RequestMapping("/cms/cmsComment")
public class CmsCommentController {

    @Resource
    private CmsCommentService commentService;

    @ApiOperation("新增评论")
    @PostMapping("/create")
    public CommonResult<CmsComment> create(@RequestBody CmsComment comment){
        Boolean aBoolean = commentService.create(comment);
        if (aBoolean){
            return CommonResult.success(comment,"新增成功");
        }else {
            return CommonResult.failed("新增失败");
        }
    }

}

