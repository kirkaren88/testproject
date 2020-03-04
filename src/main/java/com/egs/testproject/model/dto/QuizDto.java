package com.egs.testproject.model.dto;

import com.egs.testproject.model.persistence.Question;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class QuizDto {
    private Integer id;
    private  String name;
    private List<QuestionDto> questions;
}
