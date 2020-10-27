package com.macro.mall.tiny.modules.cms.controller;


import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.modules.cms.entity.CmsCommonProblems;
import com.macro.mall.tiny.modules.cms.service.CmsCommonProblemsService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author piao
 * @since 2020-10-26
 */
@RestController
@RequestMapping("/cms/cmsCommonProblems")
public class CmsCommonProblemsController {

    @Resource
    public CmsCommonProblemsService commonProblemsService;

    @ApiOperation("获取常见问题列表")
    @GetMapping("/list")
    public CommonResult<List<CmsCommonProblems>> queryList(){
        return CommonResult.success(commonProblemsService.queryList());
    }

    @ApiOperation("获取常见问题详情")
    @GetMapping("/findById")
    public CommonResult<CmsCommonProblems> findById(@RequestParam Long id){
        return CommonResult.success(commonProblemsService.findById(id));
    }

    @ApiOperation("创建常见问题")
    @PostMapping("/create")
    public CommonResult<CmsCommonProblems> create(@RequestBody CmsCommonProblems commonProblems){
        Boolean aBoolean = commonProblemsService.create(commonProblems);
        if (aBoolean){
            return CommonResult.success(commonProblems,"新增成功");
        }else {
            return CommonResult.failed("新增失败");
        }
    }

    @ApiOperation("修改常见问题")
    @PostMapping("/update")
    public CommonResult<CmsCommonProblems> update(@RequestBody CmsCommonProblems commonProblems){
        Boolean aBoolean = commonProblemsService.update(commonProblems);
        if (aBoolean){
            return CommonResult.success(commonProblems,"修改成功");
        }else {
            return CommonResult.failed("修改失败");
        }
    }

    @ApiOperation("删除常见问题")
    @PostMapping("/delete/{id}")
    public CommonResult<CmsCommonProblems> delete(@PathVariable Long id){
        Boolean aBoolean = commonProblemsService.delete(id);
        if (aBoolean){
            return CommonResult.success(null,"删除成功");
        }else {
            return CommonResult.failed("删除失败");
        }
    }

}

