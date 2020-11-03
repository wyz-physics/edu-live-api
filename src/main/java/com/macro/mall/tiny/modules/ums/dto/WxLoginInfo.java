package com.macro.mall.tiny.modules.ums.dto;

import lombok.Data;

@Data
public class WxLoginInfo {
    private String code;

    private String source;

    private UserInfo userInfo;
}
