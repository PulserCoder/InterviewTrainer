package interview.java.project.java_intrvw_trainer.repository;

import interview.java.project.java_intrvw_trainer.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
}
