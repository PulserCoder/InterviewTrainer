package interview.java.project.java_intrvw_trainer.dto;

import lombok.Data;

import java.util.List;


@Data
public class QuestionDTO {
    private String question;
    private List<String> answers;
    private Integer correct;
}
