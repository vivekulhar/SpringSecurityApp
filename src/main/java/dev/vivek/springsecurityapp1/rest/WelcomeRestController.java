package dev.vivek.springsecurityapp1.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Spring Security";
    }
}
