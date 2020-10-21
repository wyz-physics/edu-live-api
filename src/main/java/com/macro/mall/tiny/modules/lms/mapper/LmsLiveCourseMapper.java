package com.macro.mall.tiny.modules.lms.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.macro.mall.tiny.modules.lms.entity.LmsLiveCourse;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.Map;


/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author piao
 * @since 2020-10-15
 */
public interface LmsLiveCourseMapper extends BaseMapper<LmsLiveCourse> {

    Page<Map<String,Object>> queryLiveCourseList(Page<Map<String,Object>> page, @Param(Constants.WRAPPER)QueryWrapper<LmsLiveCourse> Wrapper);
}
