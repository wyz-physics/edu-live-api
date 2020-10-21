package com.macro.mall.tiny.common.tools.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

public interface LocalStorageService {

    Map<String,Object> upload(MultipartFile multipartFile);
}
