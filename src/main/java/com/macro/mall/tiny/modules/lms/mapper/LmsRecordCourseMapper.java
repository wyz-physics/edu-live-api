package com.macro.mall.tiny.modules.lms.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.macro.mall.tiny.modules.lms.entity.LmsRecordCourse;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author piao
 * @since 2020-10-20
 */
public interface LmsRecordCourseMapper extends BaseMapper<LmsRecordCourse> {
    Page<Map<String,Object>> queryRecordCourseList(Page<Map<String,Object>> page, @Param(Constants.WRAPPER) QueryWrapper<LmsRecordCourse> Wrapper);
    List<Map<String,Object>> queryCourseList();
}
