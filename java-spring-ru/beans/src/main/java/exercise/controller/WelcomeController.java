package exercise.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

// BEGIN
@RestController
@RequestMapping("/welcome")

public class WelcomeController {
    @Autowired
    private final Daytime daytime;

    @GetMapping(path = "")
    public String welcome() {
        System.out.println("It is " + daytime + " now! Welcome to Spring!");
    }
}
// END
