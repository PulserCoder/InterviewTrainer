package interview.java.project.java_intrvw_trainer.repository;

import interview.java.project.java_intrvw_trainer.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
