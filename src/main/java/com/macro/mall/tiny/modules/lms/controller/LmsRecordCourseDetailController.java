package com.macro.mall.tiny.modules.lms.controller;


import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.modules.lms.entity.LmsRecordCourseDetail;
import com.macro.mall.tiny.modules.lms.service.LmsRecordCourseDetailService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author piao
 * @since 2020-10-20
 */
@RestController
@RequestMapping("/lms/lmsRecordCourseDetail")
public class LmsRecordCourseDetailController {

    @Resource
    private LmsRecordCourseDetailService recordCourseDetailService;

    @ApiOperation("根据录播课id查询录播课详情")
    @GetMapping("/getCourseDetails")
    public CommonResult getCourseDetails(@RequestParam Long recordCourseId){
        return CommonResult.success(recordCourseDetailService.queryByRecordCourseId(recordCourseId));
    }

    @ApiOperation("新增录播课程详情")
    @PostMapping("/create")
    public CommonResult create(@RequestBody LmsRecordCourseDetail recordCourseDetail){
        Boolean aBoolean = recordCourseDetailService.create(recordCourseDetail);
        if (aBoolean){
            return CommonResult.success(recordCourseDetail,"新增成功");
        }else return CommonResult.failed("新增失败");
    }

    @ApiOperation("修改录播课详情")
    @PostMapping("/update")
    public CommonResult update(@RequestBody LmsRecordCourseDetail recordCourseDetail){
        Boolean aBoolean = recordCourseDetailService.update(recordCourseDetail);
        if (aBoolean){
            return CommonResult.success(recordCourseDetail,"修改成功");
        }else return CommonResult.failed("修改失败");
    }

    @ApiOperation("删除录播课详情")
    @PostMapping("/delete/{id}")
    public CommonResult delete(@PathVariable Long id){
        Boolean aBoolean = recordCourseDetailService.delete(id);
        if (aBoolean){
            return CommonResult.success(null,"删除成功");
        }else return CommonResult.failed("删除失败");
    }
}

