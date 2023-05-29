package playground.healthCheck.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import playground.healthCheck.domain.Users;

import javax.sql.DataSource;
import java.util.Optional;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Test
    void test() {
        Optional<Users> user = userRepository.findById(1L);

    }


}