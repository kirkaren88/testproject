package com.egs.testproject.model.dto;

import com.egs.testproject.model.persistence.Answer;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Builder
public class QuestionDto {
    private Integer id;
    private String question;
    private Integer point;
    private List<Answer> answers;
}
