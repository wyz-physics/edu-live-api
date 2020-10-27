package com.macro.mall.tiny.modules.cms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.exceptions.ApiException;
import com.macro.mall.tiny.modules.cms.entity.CmsCategory;
import com.macro.mall.tiny.modules.cms.mapper.CmsCategoryMapper;
import com.macro.mall.tiny.modules.cms.service.CmsCategoryService;
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
 * @since 2020-10-22
 */
@Service
public class CmsCategoryServiceImpl extends ServiceImpl<CmsCategoryMapper, CmsCategory> implements CmsCategoryService {

    @Resource
    private CmsCategoryService categoryService;

    @Override
    public Boolean create(CmsCategory category){
        updateLevel(category);
        category.setCreateTime(new Date(System.currentTimeMillis()));
        category.setUpdateTime(new Date(System.currentTimeMillis()));
        return save(category);
    }

    public void updateLevel(CmsCategory category){
        Long pid = category.getPid();
        int level = 1;
        while (pid != 0){
            level++;
            pid = categoryService.getById(pid).getPid();
        }
        category.setLevel(level);
    }

    @Override
    public Boolean update(CmsCategory category){
        category.setUpdateTime(new Date(System.currentTimeMillis()));
        if (category.getId() == null){
            throw new ApiException("请传入主键id");
        }
        updateLevel(category);
        return updateById(category);
    }

    @Override
    public Boolean delete(Long id){
        QueryWrapper<CmsCategory> wrapper = new QueryWrapper<>();
        wrapper.lambda().eq(CmsCategory::getId,id).or().eq(CmsCategory::getId,id);
        return categoryService.remove(wrapper);
    }

    @Override
    public List<CmsCategory> queryList(){
        return categoryService.list();
    }

    @Override
    public CmsCategory findById(Long id){
        return categoryService.getById(id);
    }


}
