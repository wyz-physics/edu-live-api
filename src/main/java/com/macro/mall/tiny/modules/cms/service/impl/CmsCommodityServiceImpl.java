package com.macro.mall.tiny.modules.cms.service.impl;

import com.macro.mall.tiny.modules.cms.entity.CmsCommodity;
import com.macro.mall.tiny.modules.cms.mapper.CmsCommodityMapper;
import com.macro.mall.tiny.modules.cms.service.CmsCommodityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author piao
 * @since 2020-10-23
 */
@Service
public class CmsCommodityServiceImpl extends ServiceImpl<CmsCommodityMapper, CmsCommodity> implements CmsCommodityService {

    @Resource
    private CmsCommodityService commodityService;

    public Boolean create(CmsCommodity commodity){
        commodity.setCreateTime(new Date(System.currentTimeMillis()));
        commodity.setUpdateTime(new Date(System.currentTimeMillis()));
        return commodityService.save(commodity);
    }

    public Boolean update(CmsCommodity commodity){
        commodity.setUpdateTime(new Date(System.currentTimeMillis()));
        return commodityService.updateById(commodity);
    }
}
