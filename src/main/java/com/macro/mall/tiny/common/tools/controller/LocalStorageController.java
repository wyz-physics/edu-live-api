package com.macro.mall.tiny.common.tools.controller;

import com.macro.mall.tiny.common.tools.service.LocalStorageService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("/common/localStorage")
public class LocalStorageController {
    @Resource
    private LocalStorageService localStorageService;

    @ApiOperation("本地上传文件")
    @PostMapping("/upload")
    public Map<String,Object> upload(@RequestBody MultipartFile multipartFile){
        return localStorageService.upload(multipartFile);
    }
}
