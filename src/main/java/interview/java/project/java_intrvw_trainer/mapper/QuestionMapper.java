package interview.java.project.java_intrvw_trainer.mapper;

import interview.java.project.java_intrvw_trainer.dto.QuestionDTO;
import interview.java.project.java_intrvw_trainer.model.Answer;
import interview.java.project.java_intrvw_trainer.model.Question;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class QuestionMapper {

    public static Question toEntity(QuestionDTO questionDTO) {
        Question question = new Question();
        question.setQuestion(questionDTO.getQuestion());
        List<Answer> answers = questionDTO.getAnswers().stream()
                .map(text -> {
                    Answer answer = new Answer();
                    answer.setAnswer(text);
                    answer.setCorrect(questionDTO.getAnswers().indexOf(text) == questionDTO.getCorrect() - 1);
                    answer.setQuestion(question);
                    return answer;
                })
                .toList();
        question.setAnswers(answers);
        return question;
    }

    public static QuestionDTO toDTO(Question question) {
        QuestionDTO dto = new QuestionDTO();
        dto.setQuestion(question.getQuestion());

        List<String> answers = question.getAnswers().stream()
                .map(Answer::getAnswer)
                .collect(Collectors.toList());
        dto.setAnswers(answers);

        int correctIndex = question.getAnswers().indexOf(
                question.getAnswers().stream()
                        .filter(Answer::isCorrect)
                        .findFirst()
                        .orElse(null)
        );
        dto.setCorrect(correctIndex);

        return dto;
    }
}
