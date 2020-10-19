package com.macro.mall.tiny.modules.lms.service;

import com.macro.mall.tiny.modules.lms.entity.LmsLiveCourseDetail;
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
public interface LmsLiveCourseDetailService extends IService<LmsLiveCourseDetail> {

    Boolean create(LmsLiveCourseDetail liveCourseDetail);
    Boolean update(LmsLiveCourseDetail liveCourseDetail);
    Boolean delete(Long id);
    List<LmsLiveCourseDetail> queryByLiveCourseId(Long liveCourseId);
}
