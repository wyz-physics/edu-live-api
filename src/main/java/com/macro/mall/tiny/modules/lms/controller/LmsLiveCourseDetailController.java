package com.macro.mall.tiny.modules.lms.controller;


import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.modules.lms.entity.LmsLiveCourseDetail;
import com.macro.mall.tiny.modules.lms.service.LmsLiveCourseDetailService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author piao
 * @since 2020-10-15
 */
@RestController
@RequestMapping("/lms/lmsLiveCourseDetail")
public class LmsLiveCourseDetailController {
    @Resource
    private LmsLiveCourseDetailService liveCourseDetailService;

    @ApiOperation("根据直播课id查询直播课详情")
    @GetMapping("/getCourseDetails")
    public CommonResult getCourseDetails(@RequestParam Long liveCourseId){
        return CommonResult.success(liveCourseDetailService.queryByLiveCourseId(liveCourseId));
    }

    @ApiOperation("新增直播课程详情")
    @PostMapping("/create")
    public CommonResult create(@RequestBody LmsLiveCourseDetail liveCourseDetail){
        Boolean aBoolean = liveCourseDetailService.create(liveCourseDetail);
        if (aBoolean){
            return CommonResult.success(liveCourseDetail,"新增成功");
        }else return CommonResult.failed("新增失败");
    }

    @ApiOperation("修改直播课详情")
    @PostMapping("/update")
    public CommonResult update(@RequestBody LmsLiveCourseDetail liveCourseDetail){
        Boolean aBoolean = liveCourseDetailService.update(liveCourseDetail);
        if (aBoolean){
            return CommonResult.success(liveCourseDetail,"修改成功");
        }else return CommonResult.failed("修改失败");
    }

    @ApiOperation("删除直播课详情")
    @PostMapping("/delete/{id}")
    public CommonResult delete(@PathVariable Long id){
        Boolean aBoolean = liveCourseDetailService.delete(id);
        if (aBoolean){
            return CommonResult.success(null,"删除成功");
        }else return CommonResult.failed("删除失败");
    }

}

