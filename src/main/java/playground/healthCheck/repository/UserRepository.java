package playground.healthCheck.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import playground.healthCheck.domain.Users;

public interface UserRepository extends JpaRepository<Users, Long> {
}
