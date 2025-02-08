package interview.java.project.java_intrvw_trainer.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class AnswerVariants {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String answer;

    @ManyToOne
    @JoinColumn(name="question_id")
    private Question question;


}
