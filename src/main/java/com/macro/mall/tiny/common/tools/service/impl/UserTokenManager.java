package com.macro.mall.tiny.common.tools.service.impl;

import com.macro.mall.tiny.security.util.JwtHelper;

public class UserTokenManager {

    public static String generateToken(Long id) {
        JwtHelper jwtHelper = new JwtHelper();
        return jwtHelper.createToken(id);
    }
    public static Integer getUserId(String token) {
        JwtHelper jwtHelper = new JwtHelper();
        Integer userId = jwtHelper.verifyTokenAndGetUserId(token);
        if(userId == null || userId == 0){
            return null;
        }
        return userId;
    }
}
