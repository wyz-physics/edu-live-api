package com.macro.mall.tiny.modules.lms.service;

import com.macro.mall.tiny.modules.lms.entity.LmsRecordCourseDetail;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author piao
 * @since 2020-10-20
 */
public interface LmsRecordCourseDetailService extends IService<LmsRecordCourseDetail> {

    Boolean create(LmsRecordCourseDetail recordCourseDetail);
    Boolean update(LmsRecordCourseDetail recordCourseDetail);
    Boolean delete(Long id);
    List<LmsRecordCourseDetail> queryByRecordCourseId(Long recordCourseId);
}
