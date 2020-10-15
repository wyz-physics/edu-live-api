package com.macro.mall.tiny.modules.lms.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.modules.lms.entity.LmsGrade;
import com.macro.mall.tiny.modules.lms.entity.LmsLiveCourse;
import com.macro.mall.tiny.modules.lms.entity.LmsSubject;
import com.macro.mall.tiny.modules.lms.mapper.LmsLiveCourseMapper;
import com.macro.mall.tiny.modules.lms.service.LmsGradeService;
import com.macro.mall.tiny.modules.lms.service.LmsLiveCourseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.macro.mall.tiny.modules.lms.service.LmsSubjectService;
import com.macro.mall.tiny.modules.ums.entity.UmsRole;
import com.macro.mall.tiny.modules.ums.entity.UmsTeacher;
import com.macro.mall.tiny.modules.ums.service.UmsTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.annotation.Resource;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author piao
 * @since 2020-10-15
 */
@Service
public class LmsLiveCourseServiceImpl extends ServiceImpl<LmsLiveCourseMapper, LmsLiveCourse> implements LmsLiveCourseService {

    @Autowired
    private LmsLiveCourseService liveCourseService;
    @Autowired
    private LmsGradeService gradeService;
    @Autowired
    private LmsSubjectService subjectService;
    @Autowired
    private UmsTeacherService teacherService;
    @Resource
    private LmsLiveCourseMapper liveCourseMapper;

    public CommonResult create(LmsLiveCourse lmsLiveCourse){
        lmsLiveCourse.setCreateTime(new Date(System.currentTimeMillis()));
        lmsLiveCourse.setUpdateTime(new Date(System.currentTimeMillis()));

        if (liveCourseService.save(lmsLiveCourse)){
            return CommonResult.success(lmsLiveCourse);
        }
        return CommonResult.failed();
    }

    public CommonResult update(LmsLiveCourse lmsLiveCourse){
        Long id = lmsLiveCourse.getId();
        if (id == null) {
            return CommonResult.failed("请传入主键");
        }
        lmsLiveCourse.setUpdateTime(new Date(System.currentTimeMillis()));
        if (liveCourseService.updateById(lmsLiveCourse)) {
            return CommonResult.success(lmsLiveCourse);
        }
        return CommonResult.failed();
    }

    public CommonResult delete(Long id){
        if (liveCourseService.removeById(id)) {
            return CommonResult.success(null);
        }
        return CommonResult.failed();
    }

    public CommonResult deleteMulti(List<String> ids){
        if (liveCourseService.removeByIds(ids)) {
            return CommonResult.success(null);
        }
        return CommonResult.failed();
    }

//    public Page<Map<String,Object>> queryList( Long gradeId,Long subjectId,Long lecturerId,Long headTeacherId,Integer pageNum,Integer pageSize){
//        Page<Map<String,Object>> page = new Page<>(pageNum,pageSize);
//        QueryWrapper<LmsLiveCourse> wrapper = new QueryWrapper<>();
////        LambdaQueryWrapper<UmsRole> lambda = wrapper.lambda();
//        if(Objects.nonNull(gradeId)){
//            wrapper.lambda().eq(LmsLiveCourse::getGradeId, gradeId);
//        }
//        return page(page,wrapper);
//    }






}
