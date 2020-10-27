package com.macro.mall.tiny.modules.cms.service.impl;

import com.macro.mall.tiny.modules.cms.entity.CmsKeyword;
import com.macro.mall.tiny.modules.cms.mapper.CmsKeywordMapper;
import com.macro.mall.tiny.modules.cms.service.CmsKeywordService;
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
 * @since 2020-10-27
 */
@Service
public class CmsKeywordServiceImpl extends ServiceImpl<CmsKeywordMapper, CmsKeyword> implements CmsKeywordService {

    @Resource
    private CmsKeywordService keywordService;

    @Override
    public Boolean create(CmsKeyword keyword){
        keyword.setCreateTime(new Date(System.currentTimeMillis()));
        keyword.setUpdateTime(new Date(System.currentTimeMillis()));
        return keywordService.save(keyword);
    }

    @Override
    public Boolean update(CmsKeyword keyword){
        keyword.setUpdateTime(new Date(System.currentTimeMillis()));
        return keywordService.updateById(keyword);
    }

    @Override
    public Boolean delete(Long id){
        return keywordService.removeById(id);
    }

    @Override
    public List<CmsKeyword> queryList(){
        return list();
    }

    @Override
    public CmsKeyword findById(Long id){
        return keywordService.getById(id);
    }





}
