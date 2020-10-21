package com.macro.mall.tiny.modules.lms.service.impl;

import com.baomidou.mybatisplus.extension.exceptions.ApiException;
import com.macro.mall.tiny.modules.lms.entity.LmsRecordCourse;
import com.macro.mall.tiny.modules.lms.mapper.LmsRecordCourseMapper;
import com.macro.mall.tiny.modules.lms.service.LmsRecordCourseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author piao
 * @since 2020-10-20
 */
@Service
public class LmsRecordCourseServiceImpl extends ServiceImpl<LmsRecordCourseMapper, LmsRecordCourse> implements LmsRecordCourseService {

    @Resource
    private LmsRecordCourseService recordCourseService;

    public Boolean create(LmsRecordCourse recordCourse){
        recordCourse.setCreateTime(new Date(System.currentTimeMillis()));
        recordCourse.setUpdateTime(new Date(System.currentTimeMillis()));
        return recordCourseService.save(recordCourse);
    }

    public Boolean update(LmsRecordCourse recordCourse){
        if (recordCourse.getId() == null){
            throw new ApiException("请传入主键id");
        }
        recordCourse.setUpdateTime(new Date(System.currentTimeMillis()));
        return recordCourseService.updateById(recordCourse);
    }

    public Boolean delete(Long id){
        return recordCourseService.removeById(id);
    }

//    public


}
