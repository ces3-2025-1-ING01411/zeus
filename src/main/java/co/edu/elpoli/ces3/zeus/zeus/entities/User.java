package co.edu.elpoli.ces3.zeus.zeus.entities;


import jakarta.persistence.*;
import lombok.Data;

@Data()
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String names;

    private String last_names;

    public User() {}
}
