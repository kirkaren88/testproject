package com.egs.testproject.dto;

import lombok.Data;

@Data
public class JWTRequestDto {
    private String email;
    private String password;
}
