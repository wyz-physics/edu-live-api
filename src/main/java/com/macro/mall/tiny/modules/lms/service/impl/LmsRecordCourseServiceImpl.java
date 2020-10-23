package com.macro.mall.tiny.modules.lms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.exceptions.ApiException;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.macro.mall.tiny.modules.lms.entity.LmsLiveCourseDetail;
import com.macro.mall.tiny.modules.lms.entity.LmsRecordCourse;
import com.macro.mall.tiny.modules.lms.entity.LmsRecordCourseDetail;
import com.macro.mall.tiny.modules.lms.mapper.LmsRecordCourseMapper;
import com.macro.mall.tiny.modules.lms.service.LmsRecordCourseDetailService;
import com.macro.mall.tiny.modules.lms.service.LmsRecordCourseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;


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
    @Resource
    private LmsRecordCourseMapper recordCourseMapper;
    @Resource
    private LmsRecordCourseDetailService recordCourseDetailService;

    /**
     * 新增录播课
     * @param recordCourse
     * @return
     */
    public Boolean create(LmsRecordCourse recordCourse){
        recordCourse.setCreateTime(new Date(System.currentTimeMillis()));
        recordCourse.setUpdateTime(new Date(System.currentTimeMillis()));
        return recordCourseService.save(recordCourse);
    }

    /**
     * 编辑录播课
     * @param recordCourse
     * @return
     */
    public Boolean update(LmsRecordCourse recordCourse){
        if (recordCourse.getId() == null){
            throw new ApiException("请传入主键id");
        }
        recordCourse.setUpdateTime(new Date(System.currentTimeMillis()));
        return recordCourseService.updateById(recordCourse);
    }

    /**
     * 删除录播课
     * @param id
     * @return
     */
    public Boolean delete(Long id){
        boolean b = recordCourseService.removeById(id);
        QueryWrapper<LmsRecordCourseDetail> wrapper = new QueryWrapper<>();
        wrapper.lambda().eq(LmsRecordCourseDetail::getRecordCourseId,id);
        boolean a =recordCourseDetailService.remove(wrapper);
        return (a && b);
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    public Boolean deleteMulti(List<Long> ids){
        boolean b = recordCourseService.removeByIds(ids);
        QueryWrapper<LmsRecordCourseDetail> wrapper = new QueryWrapper<>();
        for (Long id : ids) {
            wrapper.lambda().eq(LmsRecordCourseDetail::getRecordCourseId,id);
            boolean a = recordCourseDetailService.remove(wrapper);
            b = a &&b ;
            wrapper.clear();
        }
        return b;
    }

    /**
     * 条件分页查询录播课
     * @param gradeId
     * @param subjectId
     * @param lecturerId
     * @param pageNum
     * @param pageSize
     * @return
     */
    public Page queryList(Long gradeId,Long subjectId,Long lecturerId,Integer pageNum,Integer pageSize){
        Page<Map<String,Object>> page = new Page<>(pageNum,pageSize);
        QueryWrapper<LmsRecordCourse> wrapper = new QueryWrapper<>();
        if (gradeId != null) {
            wrapper.lambda().eq(LmsRecordCourse ::getGradeId,gradeId);
        }
        if (subjectId != null){
            wrapper.lambda().eq(LmsRecordCourse::getSubjectId,subjectId);
        }
        if (lecturerId != null){
            wrapper.lambda().eq(LmsRecordCourse::getSubjectId,subjectId);
        }
        return recordCourseMapper.queryRecordCourseList(page,wrapper);
    }

    /**
     * 用于商品上架
     * @return
     */
    public List<Map<String,Object>> queryCourseList(){
        return recordCourseMapper.queryCourseList();
    }
}
