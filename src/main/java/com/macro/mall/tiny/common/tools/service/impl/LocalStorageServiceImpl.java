package com.macro.mall.tiny.common.tools.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.extension.exceptions.ApiException;
import com.macro.mall.tiny.common.api.FileUtil;
import com.macro.mall.tiny.common.tools.service.LocalStorageService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import com.macro.mall.tiny.common.config.FileProperties;

import javax.annotation.Resource;
import java.io.File;
import java.util.HashMap;
import java.util.Map;


@Service
public class LocalStorageServiceImpl implements LocalStorageService {

    @Resource
    private FileProperties properties;

    @Transactional(rollbackFor = Exception.class)
    public Map<String,Object> upload(MultipartFile multipartFile) {
//        FileUtil.checkSize(properties.getMaxSize(), multipartFile.getSize());
        String suffix = FileUtil.getExtensionName(multipartFile.getOriginalFilename());
        String type = FileUtil.getFileType(suffix);
        if (type.equals("图片")) {
            float size = Float.parseFloat(String.valueOf((multipartFile.getSize())));
            if (size > 1024 * 1024) {
                throw new ApiException("图片大小不能超过2MB");
            }
        }
        File file = FileUtil.upload(multipartFile, properties.getPath().getPath() + type + File.separator);
        if (ObjectUtil.isNull(file)) {
            throw new ApiException("上传失败");
        }

        String path = type + "/" + file.getName();
        String name = multipartFile.getOriginalFilename();
        Map<String,Object> map = new HashMap<>();
        map.put("name", name);
        map.put("path", path);
        return map;
    }
}
