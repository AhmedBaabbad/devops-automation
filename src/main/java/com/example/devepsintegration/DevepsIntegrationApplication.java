package com.example.devepsintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevepsIntegrationApplication {

    @GetMapping("/message")
    public String message ()
    {
        return "welcome to deveps integration";
    }

    public static void main(String[] args) {
        SpringApplication.run(DevepsIntegrationApplication.class, args);
    }

}
