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

    /**
     * 新增年级
     * @param grade
     * @return
     */
    public Boolean create(LmsGrade grade){
        grade.setCreateTime(new Date(System.currentTimeMillis()));
        grade.setUpdateTime(new Date(System.currentTimeMillis()));
        return gradeService.save(grade);
    }

    /**
     * 编辑年级
     * @param grade
     * @return
     */
    public Boolean update(LmsGrade grade){
        if (grade.getId() == null){
            throw new ApiException("主键id不能为空");
        }
        grade.setUpdateTime(new Date(System.currentTimeMillis()));
        return gradeService.updateById(grade);
    }

    /**
     * 删除年级
     * @param id
     * @return
     */
    public Boolean delete(Long id){
        return gradeService.removeById(id);
    }

    /**
     * 查询年级列表
     * @return
     */
    public List<LmsGrade> queryList(){
        return gradeService.list();
    }
}
