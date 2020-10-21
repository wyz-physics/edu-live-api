package com.macro.mall.tiny.modules.lms.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.macro.mall.tiny.modules.lms.entity.LmsRecordCourse;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author piao
 * @since 2020-10-20
 */
public interface LmsRecordCourseMapper extends BaseMapper<LmsRecordCourse> {
    Page queryRecordCourseList(Page page, @Param(Constants.WRAPPER) QueryWrapper<LmsRecordCourse> Wrapper);
}
