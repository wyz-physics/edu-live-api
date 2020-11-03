package com.macro.mall.tiny.security.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class IDHelper {


    @Autowired
    private Environment environment;

    public static String encrypt(Long id) {
        // AESUtil.encrypt(id.toString(), environment.getProperty("secret.id")) //todo 暂时放弃加密，朋友圈限制字符数
        return id.toString();
    }

    public static Long decrypt(String source) {
        // AESUtil.decrypt(source, environment.getProperty("secret.id"))//todo 暂时放弃加密，朋友圈限制字符数
        if (source == null) {
            return null;
        }
        try {
            return Long.valueOf(source);
        } catch (Exception e) {
            return null;
        }
    }
}

