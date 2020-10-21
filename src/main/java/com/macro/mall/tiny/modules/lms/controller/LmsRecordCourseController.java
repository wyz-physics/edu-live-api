package com.macro.mall.tiny.modules.lms.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.modules.lms.entity.LmsRecordCourse;
import com.macro.mall.tiny.modules.lms.service.LmsRecordCourseService;
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
 * @since 2020-10-20
 */
@RestController
@RequestMapping("/lms/lmsRecordCourse")
public class LmsRecordCourseController {

    @Resource
    private LmsRecordCourseService recordCourseService;

    @ApiOperation("新增录播课")
    @PostMapping("/create")
    public CommonResult<LmsRecordCourse> create(@RequestBody LmsRecordCourse recordCourse){
        Boolean aBoolean = recordCourseService.create(recordCourse);
        if (aBoolean){
            return CommonResult.success(recordCourse,"新增成功");
        }else return CommonResult.failed("新增失败");
    }

    @ApiOperation("修改录播课")
    @PostMapping("/update")
    public CommonResult<LmsRecordCourse> update(@RequestBody LmsRecordCourse recordCourse){
        Boolean aBoolean = recordCourseService.update(recordCourse);
        if (aBoolean){
            return CommonResult.success(recordCourse,"修改成功");
        }else return CommonResult.failed("修改失败");
    }

    @ApiOperation("删除录播课")
    @PostMapping("/delete/{id}")
    public CommonResult<LmsRecordCourse> delete(@PathVariable Long id){
        Boolean aBoolean = recordCourseService.delete(id);
        if (aBoolean){
            return CommonResult.success(null,"删除成功");
        }else return CommonResult.failed("删除失败");
    }

    @ApiOperation("批量删除录播课")
    @PostMapping("/deleteMulti")
    public CommonResult<LmsRecordCourse> deleteMulti(@RequestBody List<Long> ids){
        Boolean aBoolean = recordCourseService.deleteMulti(ids);
        if (aBoolean){
            return CommonResult.success(null,"删除成功");
        }else return CommonResult.failed("删除失败");
    }

    @ApiOperation("查询录播课列表")
    @GetMapping("/list")
    public CommonResult queryList(@RequestParam(required = false) Long gradeId,
                                  @RequestParam(required = false)Long subjectId,
                                  @RequestParam(required = false)Long lecturerId,
                                  @RequestParam(defaultValue = "1")Integer pageNum,
                                  @RequestParam(defaultValue = "5")Integer pageSize){
        Page page = recordCourseService.queryList(gradeId, subjectId, lecturerId, pageNum, pageSize);
        return CommonResult.success(page);
    }





}

