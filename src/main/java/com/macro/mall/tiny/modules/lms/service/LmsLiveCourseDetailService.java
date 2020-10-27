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

    /**
     *新增直播课程详情
     * @param liveCourseDetail
     * @return
     */
    Boolean create(LmsLiveCourseDetail liveCourseDetail);

    /**
     * 修改直播课详情
     * @param liveCourseDetail
     * @return
     */
    Boolean update(LmsLiveCourseDetail liveCourseDetail);

    /**
     * 删除直播课详情
     * @param id
     * @return
     */
    Boolean delete(Long id);

    /**
     * 根据直播课id查询直播课详情
     * @param liveCourseId
     * @return
     */
    List<LmsLiveCourseDetail> queryByLiveCourseId(Long liveCourseId);
}
