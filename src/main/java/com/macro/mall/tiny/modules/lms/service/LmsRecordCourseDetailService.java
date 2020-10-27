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

    /**
     *新增录播课程详情
     * @param recordCourseDetail
     * @return
     */
    Boolean create(LmsRecordCourseDetail recordCourseDetail);

    /**
     * 修改录播课详情
     * @param recordCourseDetail
     * @return
     */
    Boolean update(LmsRecordCourseDetail recordCourseDetail);

    /**
     * 删除录播课详情
     * @param id
     * @return
     */
    Boolean delete(Long id);

    /**
     * 根据录播课id查询录播课详情
     * @param recordCourseId
     * @return
     */
    List<LmsRecordCourseDetail> queryByRecordCourseId(Long recordCourseId);
}
