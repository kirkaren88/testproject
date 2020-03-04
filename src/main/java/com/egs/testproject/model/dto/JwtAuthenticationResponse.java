package com.egs.testproject.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class JwtAuthenticationResponse {
    private String token;
    private UserDto userDto;
}