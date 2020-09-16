package com.thoughtworks.capability.demospringioccontainer;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @Autowired
    private GreetingControllerAspect greetingControllerAspect;

    @GetMapping("/greet")
    public String greet() {
//        this.greetingService = new GreetingService();
        GreetingService greetingService = greetingControllerAspect.getGreetingService();
        return greetingService.sayHi();
    }

}
