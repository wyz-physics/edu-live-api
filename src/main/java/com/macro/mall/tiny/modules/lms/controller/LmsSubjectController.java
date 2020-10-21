package com.macro.mall.tiny.modules.lms.controller;


import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.modules.lms.entity.LmsSubject;
import com.macro.mall.tiny.modules.lms.service.LmsSubjectService;
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
 * @since 2020-10-15
 */
@RestController
@RequestMapping("/lms/lmsSubject")
public class LmsSubjectController {
    @Resource
    private LmsSubjectService subjectService;

    @ApiOperation("新建科目")
    @PostMapping("/create")
    public CommonResult<LmsSubject> create(@RequestBody LmsSubject subject){
        Boolean aBoolean = subjectService.create(subject);
        if (aBoolean){
            return CommonResult.success(subject,"新增成功");
        }else return CommonResult.failed("新增失败");
    }

    @ApiOperation("修改科目")
    @PostMapping("/update")
    public CommonResult<LmsSubject> update(@RequestBody LmsSubject subject){
        Boolean aBoolean = subjectService.update(subject);
        if (aBoolean){
            return CommonResult.success(subject,"修改成功");
        }else return CommonResult.failed("修改失败");
    }

    @ApiOperation("删除科目")
    @PostMapping("/delete/{id}")
    public CommonResult<LmsSubject> delete(@PathVariable Long id){
        Boolean aBoolean = subjectService.delete(id);
        if (aBoolean){
            return CommonResult.success(null,"删除成功");
        }else return CommonResult.failed("删除失败");
    }

    @ApiOperation("获取科目列表")
    @PostMapping("/list")
    public CommonResult<List<LmsSubject>> queryList(){
        List<LmsSubject> lmsSubjects = subjectService.queryList();
        return CommonResult.success(lmsSubjects,"新增成功");

    }
}

