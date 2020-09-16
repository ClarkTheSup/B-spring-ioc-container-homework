package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
public class DemoSpringIocContainerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringIocContainerApplication.class, args);
	}

}
