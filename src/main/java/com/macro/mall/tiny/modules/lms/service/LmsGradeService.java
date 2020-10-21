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

    Boolean create(LmsGrade grade);
    Boolean update(LmsGrade grade);
    Boolean delete(Long id);
    List<LmsGrade> queryList();
}
