package com.macro.mall.tiny.modules.lms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.exceptions.ApiException;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.macro.mall.tiny.modules.lms.entity.LmsLiveCourse;
import com.macro.mall.tiny.modules.lms.entity.LmsLiveCourseDetail;
import com.macro.mall.tiny.modules.lms.mapper.LmsLiveCourseMapper;
import com.macro.mall.tiny.modules.lms.service.LmsGradeService;
import com.macro.mall.tiny.modules.lms.service.LmsLiveCourseDetailService;
import com.macro.mall.tiny.modules.lms.service.LmsLiveCourseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.macro.mall.tiny.modules.lms.service.LmsSubjectService;
import com.macro.mall.tiny.modules.ums.service.UmsTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author piao
 * @since 2020-10-15
 */
@Service
public class LmsLiveCourseServiceImpl extends ServiceImpl<LmsLiveCourseMapper, LmsLiveCourse> implements LmsLiveCourseService {

    @Resource
    private LmsLiveCourseService liveCourseService;
    @Resource
    private LmsLiveCourseMapper liveCourseMapper;
    @Resource
    private LmsLiveCourseDetailService liveCourseDetailService;

    @Override
    public Boolean create(LmsLiveCourse lmsLiveCourse) {
        lmsLiveCourse.setCreateTime(new Date(System.currentTimeMillis()));
        lmsLiveCourse.setUpdateTime(new Date(System.currentTimeMillis()));

        return liveCourseService.save(lmsLiveCourse);

    }

   @Override
    public Boolean update(LmsLiveCourse lmsLiveCourse) {
        Long id = lmsLiveCourse.getId();
        if (id == null) {
            throw new ApiException("请传入直播课主键");
        }
        lmsLiveCourse.setUpdateTime(new Date(System.currentTimeMillis()));
        return liveCourseService.updateById(lmsLiveCourse);
    }

    @Override
    public Boolean delete(Long id) {
        boolean a = liveCourseService.removeById(id);
        QueryWrapper<LmsLiveCourseDetail> wrapper = new QueryWrapper<>();
        wrapper.lambda().eq(LmsLiveCourseDetail::getLiveCourseId,id);
        boolean b = liveCourseDetailService.remove(wrapper);
        return (a && b);
    }

    @Override
    public Boolean deleteMulti(List<Long> ids) {
        boolean b = liveCourseService.removeByIds(ids);
        QueryWrapper<LmsLiveCourseDetail> wrapper = new QueryWrapper<>();
        for (Long id : ids) {
            wrapper.lambda().eq(LmsLiveCourseDetail::getLiveCourseId,id);
            boolean a = liveCourseDetailService.remove(wrapper);
            b = a &&b ;
            wrapper.clear();
        }
        return b;
    }

    @Override
    public Page<Map<String,Object>> queryList(Long gradeId, Long subjectId, Long lecturerId, Long headTeacherId, Integer pageNum, Integer pageSize) {
        Page page = new Page(pageNum, pageSize);
        QueryWrapper<LmsLiveCourse> wrapper = new QueryWrapper<>();
        if (gradeId != null) {
            wrapper.lambda().eq(LmsLiveCourse::getGradeId, gradeId);
        }
        if (subjectId != null) {
            wrapper.lambda().eq(LmsLiveCourse::getSubjectId, subjectId);
        }
        if (lecturerId != null) {
            wrapper.lambda().eq(LmsLiveCourse::getLecturerId, lecturerId);
        }
        if (headTeacherId != null) {
            wrapper.lambda().eq(LmsLiveCourse::getHeadTeacherId, headTeacherId);
        }
        Page<Map<String,Object>> maps = liveCourseMapper.queryLiveCourseList(page, wrapper);
        return maps;
    }
    @Override
    public List<Map<String,Object>> queryCourseList(){
        return liveCourseMapper.queryCourseList();
    }



}
