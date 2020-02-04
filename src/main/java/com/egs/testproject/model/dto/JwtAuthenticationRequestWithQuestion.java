package com.egs.testproject.model.dto;

import com.egs.testproject.model.persistence.Question;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class JwtAuthenticationRequestWithQuestion {
    private JwtAuthenticationRequest jwt;
    private Question question;
}
