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

    Boolean create(LmsSubject subject);
    Boolean update(LmsSubject subject);
    Boolean delete(Long id);
    List<LmsSubject> queryList();
}
