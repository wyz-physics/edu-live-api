package com.macro.mall.tiny.modules.lms.service;

import com.macro.mall.tiny.modules.lms.entity.LmsSubject;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author piao
 * @since 2020-10-15
 */
public interface LmsSubjectService extends IService<LmsSubject> {

    /**
     *新建科目
     * @param subject
     * @return
     */
    Boolean create(LmsSubject subject);

    /**
     * 编辑科目
     * @param subject
     * @return
     */
    Boolean update(LmsSubject subject);

    /**
     * 删除科目
     * @param id
     * @return
     */
    Boolean delete(Long id);

    /**
     * 查询科目列表
     * @return
     */
    List<LmsSubject> queryList();
}
