package interview.java.project.java_intrvw_trainer.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Lob
    @Column(columnDefinition = "TEXT", nullable = false)
    private String question;

    private String photo_url;

    @Column(nullable = false, columnDefinition = "int default 1")
    private int level;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "answer_id")
    private AnswerVariants answer;

    @OneToMany(mappedBy = "question")
    private List<AnswerVariants> otherAnswers;
}
