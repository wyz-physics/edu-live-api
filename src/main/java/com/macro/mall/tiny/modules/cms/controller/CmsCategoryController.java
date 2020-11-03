package com.macro.mall.tiny.modules.cms.controller;


import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.modules.cms.entity.CmsCategory;
import com.macro.mall.tiny.modules.cms.service.CmsCategoryService;
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
 * @since 2020-10-22
 */
@RestController
@RequestMapping("/cms/cmsCategory")
public class CmsCategoryController {

    @Resource
    private CmsCategoryService categoryService;

    @ApiOperation("查询类目列表")
    @GetMapping("/list")
    public CommonResult<List<CmsCategory>> queryList() {
        return CommonResult.success(categoryService.queryList());
    }

    @ApiOperation("获取类目详情")
    @GetMapping("/findById")
    public CommonResult<CmsCategory> findById(@RequestParam Long id) {
        return CommonResult.success(categoryService.findById(id));
    }

    @ApiOperation("新建类目")
    @PostMapping("/create")
    public CommonResult<CmsCategory> create(@RequestBody CmsCategory category) {
        Boolean aBoolean = categoryService.create(category);
        if (aBoolean) {
            return CommonResult.success(category, "新增成功");
        } else {
            return CommonResult.failed("新增失败");
        }
    }

    @ApiOperation("编辑类目")
    @PostMapping("/update")
    public CommonResult<CmsCategory> update(@RequestBody CmsCategory category) {
        Boolean aBoolean = categoryService.update(category);
        if (aBoolean) {
            return CommonResult.success(category, "修改成功");
        } else {
            return CommonResult.failed("修改失败");
        }
    }

    @ApiOperation("删除类目")
    @PostMapping("/delete/{id}")
    public CommonResult<CmsCategory> delete(@PathVariable Long id) {
        Boolean aBoolean = categoryService.delete(id);
        if (aBoolean) {
            return CommonResult.success(null, "删除成功");
        } else {
            return CommonResult.failed("删除失败");
        }
    }


}

