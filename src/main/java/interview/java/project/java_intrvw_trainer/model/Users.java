package interview.java.project.java_intrvw_trainer.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique = true, nullable = false)
    private String mail;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private Role role;
    @Column(nullable = false, columnDefinition = "BIGINT DEFAULT 0")
    private long record;
    @Column(nullable = false)
    private String avatarUrl;
}
