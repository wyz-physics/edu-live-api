package com.macro.mall.tiny.modules.lms.service.impl;

import com.baomidou.mybatisplus.extension.exceptions.ApiException;
import com.macro.mall.tiny.modules.lms.entity.LmsGrade;
import com.macro.mall.tiny.modules.lms.mapper.LmsGradeMapper;
import com.macro.mall.tiny.modules.lms.service.LmsGradeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Date;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author piao
 * @since 2020-10-15
 */
@Service
public class LmsGradeServiceImpl extends ServiceImpl<LmsGradeMapper, LmsGrade> implements LmsGradeService {

    @Resource
    private LmsGradeService gradeService;

    @Override
    public Boolean create(LmsGrade grade){
        grade.setCreateTime(new Date(System.currentTimeMillis()));
        grade.setUpdateTime(new Date(System.currentTimeMillis()));
        return gradeService.save(grade);
    }

    @Override
    public Boolean update(LmsGrade grade){
        if (grade.getId() == null){
            throw new ApiException("主键id不能为空");
        }
        grade.setUpdateTime(new Date(System.currentTimeMillis()));
        return gradeService.updateById(grade);
    }

    @Override
    public Boolean delete(Long id){
        return gradeService.removeById(id);
    }

    @Override
    public List<LmsGrade> queryList(){
        return gradeService.list();
    }
}
