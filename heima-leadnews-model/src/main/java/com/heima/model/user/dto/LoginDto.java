package com.heima.model.user.dto;

import lombok.Data;

@Data
public class LoginDto {
    // 手机号
    private String phone;

    // 密码
    private String password;
}
