package com.thoughtworks.capability.demospringioccontainer;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GreetingControllerAspect {
    private GreetingService greetingService;

    @Before("execution(public * com.thoughtworks.capability.demospringioccontainer.GreetingController.greet(..))")
    public void before() {
        this.greetingService = new GreetingService();
    }

    public GreetingService getGreetingService() {
        return greetingService;
    }
}
