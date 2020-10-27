package com.macro.mall.tiny.modules.cms.controller;


import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.modules.cms.entity.CmsCommodity;
import com.macro.mall.tiny.modules.cms.service.CmsCommodityService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author piao
 * @since 2020-10-23
 */
@RestController
@RequestMapping("/cms/cmsCommodity")
public class CmsCommodityController {
    @Resource
    private CmsCommodityService commodityService;

    @ApiOperation("查找商品列表")
    @GetMapping("/list")
    public CommonResult list(Integer pageNum, Integer pageSize){
        return CommonResult.success(commodityService.queryList(pageNum,pageSize));
    }

    @ApiOperation("获取商品详情")
    @GetMapping("/findById")
    public CommonResult<CmsCommodity> findById(@RequestParam Long id){
        return CommonResult.success(commodityService.findById(id));
    }


    @ApiOperation("创建商品")
    @PostMapping("/create")
    public CommonResult<CmsCommodity> create(@RequestBody CmsCommodity commodity){
        Boolean aBoolean = commodityService.create(commodity);
        if (aBoolean){
            return CommonResult.success(commodity,"创建成功");
        }else {
            return CommonResult.failed("创建失败");
        }
    }

    @ApiOperation("编辑商品")
    @PostMapping("/update")
    public CommonResult<CmsCommodity> update(@RequestBody CmsCommodity commodity){
        Boolean aBoolean = commodityService.update(commodity);
        if (aBoolean){
            return CommonResult.success(commodity,"修改成功");
        }else {
            return CommonResult.failed("修改失败");
        }
    }

    @ApiOperation("删除商品")
    @PostMapping("/delete/{id}")
    public CommonResult<CmsCommodity> delete(@PathVariable Long id){
        Boolean aBoolean = commodityService.delete(id);
        if (aBoolean){
            return CommonResult.success(null,"删除成功");
        }else {
            return CommonResult.failed("删除失败");
        }
    }

}

