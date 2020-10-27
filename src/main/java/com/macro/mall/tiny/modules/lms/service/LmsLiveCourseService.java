package com.macro.mall.tiny.modules.lms.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.macro.mall.tiny.modules.lms.entity.LmsLiveCourse;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author piao
 * @since 2020-10-15
 */
public interface LmsLiveCourseService extends IService<LmsLiveCourse> {

    /**
     * 条件分页查询课程
     * @param gradeId
     * @param subjectId
     * @param lecturerId
     * @param headTeacherId
     * @param pageNum
     * @param pageSize
     * @return
     */
    Page<Map<String,Object>> queryList(Long gradeId, Long subjectId, Long lecturerId, Long headTeacherId, Integer pageNum, Integer pageSize);

    /**
     * 批量删除直播课及其详情
     * @param ids
     * @return
     */
    Boolean deleteMulti(List<Long> ids);

    /**
     * 删除直播课及其详情
     * @param id
     * @return
     */
    Boolean delete(Long id);

    /**
     * 修改/编辑直播课
     * @param lmsLiveCourse
     * @return
     */
    Boolean update(LmsLiveCourse lmsLiveCourse);

    /**
     * 创建直播课
     * @param lmsLiveCourse
     * @return
     */
    Boolean create(LmsLiveCourse lmsLiveCourse);

    /**
     * 获取直播课列表用于商品上架
     * @param
     * @return
     */
    List<Map<String,Object>> queryCourseList();
}
