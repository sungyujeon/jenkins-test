package playground.healthCheck;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import playground.healthCheck.domain.Users;
import playground.healthCheck.repository.UserRepository;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/user")
    void save() {
        Users user = new Users();
        user.setUsername("username");
        user.setPassword("pw");

        userService.save(user);
    }


}

@Service
@RequiredArgsConstructor
@Transactional
class UserService {

    private final UserRepository userRepository;

    // transaction start...????
    public void save(Users user) {
        System.out.println("service start");
        userRepository.save(user);
        System.out.println("service end");
    }
}
