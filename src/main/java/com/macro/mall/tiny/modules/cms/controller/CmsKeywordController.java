package com.macro.mall.tiny.modules.cms.controller;


import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.modules.cms.entity.CmsKeyword;
import com.macro.mall.tiny.modules.cms.service.CmsKeywordService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author piao
 * @since 2020-10-27
 */
@RestController
@RequestMapping("/cms/cmsKeyword")
public class CmsKeywordController {

    @Resource
    private CmsKeywordService keywordService;

    @ApiOperation("修改关键字")
    @GetMapping("/list")
    public CommonResult<List<CmsKeyword>> queryList() {
        return CommonResult.success(keywordService.queryList());
    }

    @ApiOperation("查看关键字详情")
    @GetMapping("/findById")
    public CommonResult<CmsKeyword> findById(@RequestParam Long id) {
        return CommonResult.success(keywordService.findById(id));
    }

    @ApiOperation("新增关键字")
    @PostMapping("/create")
    public CommonResult<CmsKeyword> create(@RequestBody CmsKeyword keyword) {
        Boolean aBoolean = keywordService.create(keyword);
        if (aBoolean) {
            return CommonResult.success(keyword, "新增成功");
        } else {
            return CommonResult.failed("新增失败");
        }
    }

    @ApiOperation("修改关键字")
    @PostMapping("/update")
    public CommonResult<CmsKeyword> update(@RequestBody CmsKeyword keyword) {
        Boolean aBoolean = keywordService.update(keyword);
        if (aBoolean) {
            return CommonResult.success(keyword, "修改成功");
        } else {
            return CommonResult.failed("修改失败");
        }
    }

    @ApiOperation("删除关键字")
    @PostMapping("/delete/{id}")
    public CommonResult<CmsKeyword> delete(@PathVariable Long id) {
        Boolean aBoolean = keywordService.delete(id);
        if (aBoolean) {
            return CommonResult.success(null, "删除成功");
        } else {
            return CommonResult.failed("删除失败");
        }
    }

}

