package com.macro.mall.tiny.modules.lms.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.macro.mall.tiny.modules.lms.entity.LmsLiveCourse;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author piao
 * @since 2020-10-15
 */
public interface LmsLiveCourseService extends IService<LmsLiveCourse> {

    Page queryList(Long gradeId, Long subjectId, Long lecturerId, Long headTeacherId, Integer pageNum, Integer pageSize);
    Boolean deleteMulti(List<Long> ids);
    Boolean delete(Long id);
    Boolean update(LmsLiveCourse lmsLiveCourse);
    Boolean create(LmsLiveCourse lmsLiveCourse);
}
