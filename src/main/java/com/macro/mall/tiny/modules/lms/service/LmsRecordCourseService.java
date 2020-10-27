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

    /**
     * 新增录播课
     * @param recordCourse
     * @return
     */
    Boolean create(LmsRecordCourse recordCourse);

    /**
     * 编辑录播课
     * @param recordCourse
     * @return
     */
    Boolean update(LmsRecordCourse recordCourse);

    /**
     * 删除录播课
     * @param id
     * @return
     */
    Boolean delete(Long id);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    Boolean deleteMulti(List<Long> ids);

    /**
     * 条件分页查询录播课
     * @param gradeId
     * @param subjectId
     * @param lecturerId
     * @param pageNum
     * @param pageSize
     * @return
     */
    Page queryList(Long gradeId, Long subjectId, Long lecturerId, Integer pageNum, Integer pageSize);

    /**
     * 用于商品上架
     * @return
     */
    List<Map<String,Object>> queryCourseList();
}
