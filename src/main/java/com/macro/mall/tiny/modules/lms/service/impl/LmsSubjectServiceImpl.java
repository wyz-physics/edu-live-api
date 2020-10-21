package com.macro.mall.tiny.modules.lms.service.impl;

import com.macro.mall.tiny.modules.lms.entity.LmsSubject;
import com.macro.mall.tiny.modules.lms.mapper.LmsSubjectMapper;
import com.macro.mall.tiny.modules.lms.service.LmsSubjectService;
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
 * @since 2020-10-15
 */
@Service
public class LmsSubjectServiceImpl extends ServiceImpl<LmsSubjectMapper, LmsSubject> implements LmsSubjectService {

    @Resource
    private LmsSubjectService subjectService;

    /**
     *新建科目
     * @param subject
     * @return
     */
    public Boolean create(LmsSubject subject){
        subject.setCreateTime(new Date(System.currentTimeMillis()));
        subject.setUpdateTime(new Date(System.currentTimeMillis()));
        return subjectService.save(subject);
    }

    /**
     * 编辑科目
     * @param subject
     * @return
     */
    public Boolean update(LmsSubject subject) {
        subject.setUpdateTime(new Date(System.currentTimeMillis()));
        return subjectService.updateById(subject);
    }

    /**
     * 删除科目
     * @param id
     * @return
     */
    public Boolean delete(Long id){
        return subjectService.removeById(id);
    }

    /**
     * 查询科目列表
     * @return
     */
    public List<LmsSubject> queryList(){
        return subjectService.list();
    }
}
