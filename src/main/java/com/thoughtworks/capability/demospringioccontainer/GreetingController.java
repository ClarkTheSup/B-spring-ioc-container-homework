package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @Autowired
    GreetingService greetingService;

    @GetMapping("/greet")
    public String greet() {
        return greetingService.sayHi();
    }

}
