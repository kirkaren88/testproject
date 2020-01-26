package com.egs.testproject.dto;

import com.egs.testproject.model.User;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class JWTResponseDto {
    private String token;
    private User user;
}
