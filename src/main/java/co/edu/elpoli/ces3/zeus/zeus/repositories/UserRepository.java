package co.edu.elpoli.ces3.zeus.zeus.repositories;

import co.edu.elpoli.ces3.zeus.zeus.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
