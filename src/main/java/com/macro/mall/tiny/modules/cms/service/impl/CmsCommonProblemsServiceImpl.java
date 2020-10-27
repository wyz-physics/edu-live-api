package com.macro.mall.tiny.modules.cms.service.impl;

import com.macro.mall.tiny.modules.cms.entity.CmsCommonProblems;
import com.macro.mall.tiny.modules.cms.mapper.CmsCommonProblemsMapper;
import com.macro.mall.tiny.modules.cms.service.CmsCommonProblemsService;
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
 * @since 2020-10-26
 */
@Service
public class CmsCommonProblemsServiceImpl extends ServiceImpl<CmsCommonProblemsMapper, CmsCommonProblems> implements CmsCommonProblemsService {

    @Resource
    private CmsCommonProblemsService commonProblemsService;

    @Override
    public Boolean create(CmsCommonProblems commonProblems){
        commonProblems.setCreateTime(new Date(System.currentTimeMillis()));
        commonProblems.setUpdateTime(new Date(System.currentTimeMillis()));
        return commonProblemsService.save(commonProblems);
    }

    @Override
    public Boolean update(CmsCommonProblems commonProblems){
        commonProblems.setUpdateTime(new Date(System.currentTimeMillis()));
        return commonProblemsService.updateById(commonProblems);
    }

    @Override
    public Boolean delete(Long id){
        return commonProblemsService.removeById(id);
    }

    @Override
    public List<CmsCommonProblems> queryList(){
        return commonProblemsService.list();
    }

    @Override
    public CmsCommonProblems findById(Long id){
        return commonProblemsService.getById(id);
    }
}
