package com.macro.mall.tiny.modules.lms.service.impl;

import com.macro.mall.tiny.modules.lms.entity.LmsLive;
import com.macro.mall.tiny.modules.lms.mapper.LmsLiveMapper;
import com.macro.mall.tiny.modules.lms.service.LmsLiveService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author macro
 * @since 2020-10-14
 */
@Service
public class LmsLiveServiceImpl extends ServiceImpl<LmsLiveMapper, LmsLive> implements LmsLiveService {

    @Resource
    private LmsLiveMapper lmsLiveMapper;

    public Object create(LmsLive lmsLive) {
        return lmsLiveMapper.insert(lmsLive);
    }
}
