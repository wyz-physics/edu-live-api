package com.macro.mall.tiny.modules.lms.controller;


import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.modules.lms.entity.LmsGrade;
import com.macro.mall.tiny.modules.lms.service.LmsGradeService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.lang.management.GarbageCollectorMXBean;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author piao
 * @since 2020-10-15
 */
@RestController
@RequestMapping("/lms/lmsGrade")
public class LmsGradeController {
    @Resource
    private LmsGradeService gradeService;

    @ApiOperation("获取年级列表")
    @PostMapping("/list")
    public CommonResult<List<LmsGrade>> queryList(){
        return CommonResult.success(gradeService.queryList(),"修改成功");
    }

    @ApiOperation("创建年级")
    @PostMapping("/create")
    public CommonResult<LmsGrade> create(@RequestBody LmsGrade grade) {
        Boolean aBoolean = gradeService.create(grade);
        if (aBoolean) {
            return CommonResult.success(grade, "创建成功");
        } else return CommonResult.failed("创建失败");
    }

    @ApiOperation("编辑年级")
    @PostMapping("/update")
    public CommonResult<LmsGrade> update(@RequestBody LmsGrade grade) {
        Boolean aBoolean = gradeService.update(grade);
        if (aBoolean) {
            return CommonResult.success(grade, "修改成功");
        } else return CommonResult.failed("修改失败");
    }

    @ApiOperation("删除年级")
    @PostMapping("/delete/{id}")
    public CommonResult<LmsGrade> delete(@PathVariable Long id) {
        Boolean aBoolean = gradeService.delete(id);
        if (aBoolean) {
            return CommonResult.success(null, "删除成功");
        } else return CommonResult.failed("删除失败");
    }



}

