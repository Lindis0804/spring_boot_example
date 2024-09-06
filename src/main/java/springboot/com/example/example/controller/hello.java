package springboot.com.example.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class hello {
    @GetMapping("v1/api/hello")
    public String Status() {
        return "Great!";
    }
}
