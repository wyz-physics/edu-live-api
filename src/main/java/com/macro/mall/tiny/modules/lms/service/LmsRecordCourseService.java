package com.macro.mall.tiny.modules.lms.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.macro.mall.tiny.modules.lms.entity.LmsRecordCourse;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author piao
 * @since 2020-10-20
 */
public interface LmsRecordCourseService extends IService<LmsRecordCourse> {

    Boolean create(LmsRecordCourse recordCourse);
    Boolean update(LmsRecordCourse recordCourse);
    Boolean delete(Long id);
    Boolean deleteMulti(List<Long> ids);
    Page queryList(Long gradeId, Long subjectId, Long lecturerId, Integer pageNum, Integer pageSize);
    List<Map<String,Object>> queryCourseList();
}
