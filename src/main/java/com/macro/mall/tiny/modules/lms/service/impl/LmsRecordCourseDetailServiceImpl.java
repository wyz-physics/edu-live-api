package com.macro.mall.tiny.modules.lms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.exceptions.ApiException;
import com.macro.mall.tiny.modules.lms.entity.LmsRecordCourseDetail;
import com.macro.mall.tiny.modules.lms.entity.LmsRecordCourseDetail;
import com.macro.mall.tiny.modules.lms.mapper.LmsRecordCourseDetailMapper;
import com.macro.mall.tiny.modules.lms.service.LmsRecordCourseDetailService;
import com.macro.mall.tiny.modules.lms.service.LmsRecordCourseDetailService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author piao
 * @since 2020-10-20
 */
@Service
public class LmsRecordCourseDetailServiceImpl extends ServiceImpl<LmsRecordCourseDetailMapper, LmsRecordCourseDetail> implements LmsRecordCourseDetailService {

    @Resource
    private LmsRecordCourseDetailService recordCourseDetailService;

    @Override
    public Boolean create(LmsRecordCourseDetail recordCourseDetail){
        recordCourseDetail.setCreateTime(new Date(System.currentTimeMillis()));
        recordCourseDetail.setUpdateTime(new Date(System.currentTimeMillis()));
        if (recordCourseDetail.getRecordCourseId() == null){
            throw new ApiException("请传入录播课id");
        }
        return recordCourseDetailService.save(recordCourseDetail);
    }

    @Override
    public Boolean update(LmsRecordCourseDetail recordCourseDetail){
        if (recordCourseDetail.getId() == null){
            throw new ApiException("未找到该条数据");
        }
        return recordCourseDetailService.updateById(recordCourseDetail);
    }

    @Override
    public Boolean delete(Long id){
        return recordCourseDetailService.removeById(id);
    }

    @Override
    public List<LmsRecordCourseDetail> queryByRecordCourseId(Long recordCourseId){
        QueryWrapper<LmsRecordCourseDetail> wrapper = new QueryWrapper<>();
        wrapper.lambda().eq(LmsRecordCourseDetail::getRecordCourseId,recordCourseId);
        return list(wrapper);
    }
}
