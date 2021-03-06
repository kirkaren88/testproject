package com.egs.testproject.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class JwtAuthenticationRequest {
    private String email;
    private String password;
}
