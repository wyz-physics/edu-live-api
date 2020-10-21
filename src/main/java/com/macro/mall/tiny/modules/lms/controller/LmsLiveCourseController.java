package com.macro.mall.tiny.modules.lms.controller;

import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.modules.lms.entity.LmsLiveCourse;
import com.macro.mall.tiny.modules.lms.service.LmsLiveCourseService;
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
 * @since 2020-10-15
 */
@RestController
@RequestMapping("/lms/lmsLiveCourse")
public class LmsLiveCourseController {
    @Resource
    private LmsLiveCourseService liveCourseService;

    @ApiOperation(value = "条件分页查询课程列表")
    @GetMapping(value = "/queryList")
    public CommonResult queryList(@RequestParam(required = false) Long gradeId,
                                  @RequestParam(required = false) Long subjectId,
                                  @RequestParam(required = false) Long lecturerId,
                                  @RequestParam(required = false) Long headTeacherId,
                                  @RequestParam(defaultValue = "1") Integer pageNum,
                                  @RequestParam(defaultValue = "5") Integer pageSize) {
        return CommonResult.success(liveCourseService.queryList(gradeId, subjectId, lecturerId, headTeacherId, pageNum, pageSize));
    }

    @ApiOperation(value = "新增直播课")
    @PostMapping(value = "/create")
    public CommonResult create(@RequestBody LmsLiveCourse lmsLiveCourse) {
        Boolean aBoolean = liveCourseService.create(lmsLiveCourse);
        if (aBoolean) {
            return CommonResult.success(lmsLiveCourse, "新增成功");
        } else return CommonResult.failed("新增失败");
    }

    @ApiOperation(value = "编辑直播课")
    @PostMapping(value = "/update")
    public CommonResult update(@RequestBody LmsLiveCourse lmsLiveCourse) {
        Boolean aBoolean = liveCourseService.update(lmsLiveCourse);
        if (aBoolean) {
            return CommonResult.success(lmsLiveCourse, "修改成功");
        } else return CommonResult.failed("修改失败");
    }

    @ApiOperation(value = "删除直播课")
    @PostMapping(value = "/delete/{id}")
    public CommonResult delete(@PathVariable Long id) {
        Boolean aBoolean = liveCourseService.delete(id);
        if (aBoolean) {
            return CommonResult.success(null, "删除成功");
        } else return CommonResult.failed("删除失败");

    }

    @ApiOperation(value = "批量删除")
    @PostMapping(value = "/deleteMulti")
    public CommonResult deleteMulti(@RequestBody List<Long> ids) {
        Boolean aBoolean = liveCourseService.deleteMulti(ids);
        if (aBoolean) {
            return CommonResult.success(null, "删除成功");
        } else return CommonResult.failed("删除失败");
    }
}

