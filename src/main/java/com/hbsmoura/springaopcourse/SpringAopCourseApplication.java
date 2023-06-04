package com.hbsmoura.springaopcourse;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringAopCourseApplication implements CommandLineRunner {

	private final SomeComponent component;

	public SpringAopCourseApplication(SomeComponent component) {
		this.component = component;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAopCourseApplication.class, args);
	}

	@Override
	public void run(String... args) {
//		component.someMethod();
//		component.someOtherMethod();
//		component.aThirdMethod();
//		component.someMethodWithOneParameter("One");
//		component.someMethodWithMultipleParameters("One", 2);
//		List<String> someListOfStrings = component.someListOfStrings();
//		component.someThrowingMethod();
		component.someDelayedMethod();

	}
}
