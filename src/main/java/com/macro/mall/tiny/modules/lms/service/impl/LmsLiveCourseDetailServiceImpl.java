package com.macro.mall.tiny.modules.lms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.exceptions.ApiException;
import com.macro.mall.tiny.modules.lms.entity.LmsLiveCourseDetail;
import com.macro.mall.tiny.modules.lms.mapper.LmsLiveCourseDetailMapper;
import com.macro.mall.tiny.modules.lms.service.LmsLiveCourseDetailService;
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
public class LmsLiveCourseDetailServiceImpl extends ServiceImpl<LmsLiveCourseDetailMapper, LmsLiveCourseDetail> implements LmsLiveCourseDetailService {

    @Resource
    private LmsLiveCourseDetailService liveCourseDetailService;

    /**
     *新增直播课程详情
     * @param liveCourseDetail
     * @return
     */
    public Boolean create(LmsLiveCourseDetail liveCourseDetail){
        liveCourseDetail.setCreateTime(new Date(System.currentTimeMillis()));
        liveCourseDetail.setUpdateTime(new Date(System.currentTimeMillis()));
        if (liveCourseDetail.getLiveCourseId() == null){
            throw new ApiException("请传入直播课id");
        }
        return liveCourseDetailService.save(liveCourseDetail);
    }

    /**
     * 修改直播课详情
     * @param liveCourseDetail
     * @return
     */
    public Boolean update(LmsLiveCourseDetail liveCourseDetail){
        if (liveCourseDetail.getId() == null){
            throw new ApiException("未找到该条数据");
        }
        return liveCourseDetailService.updateById(liveCourseDetail);
    }

    /**
     * 删除直播课详情
     * @param id
     * @return
     */
    public Boolean delete(Long id){
        return liveCourseDetailService.removeById(id);
    }

    /**
     * 根据直播课id查询直播课详情
     * @param liveCourseId
     * @return
     */
    public List<LmsLiveCourseDetail> queryByLiveCourseId(Long liveCourseId){
        QueryWrapper<LmsLiveCourseDetail> wrapper = new QueryWrapper<>();
        wrapper.lambda().eq(LmsLiveCourseDetail::getLiveCourseId,liveCourseId);
        return list(wrapper);
    }
}
