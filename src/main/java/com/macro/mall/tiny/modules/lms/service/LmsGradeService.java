package com.macro.mall.tiny.modules.lms.service;

import com.macro.mall.tiny.modules.lms.entity.LmsGrade;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author piao
 * @since 2020-10-15
 */
public interface LmsGradeService extends IService<LmsGrade> {

    /**
     * 新增年级
     * @param grade
     * @return
     */
    Boolean create(LmsGrade grade);

    /**
     * 编辑年级
     * @param grade
     * @return
     */
    Boolean update(LmsGrade grade);

    /**
     * 删除年级
     * @param id
     * @return
     */
    Boolean delete(Long id);

    /**
     * 查询年级列表
     * @return
     */
    List<LmsGrade> queryList();
}
