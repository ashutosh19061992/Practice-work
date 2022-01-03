package com.xoriant.app.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemo {

	public LifeCycleDemo() {
		System.out.println(">>> in bean lifecycle constructor <<<" + "\n");
	}

	@Bean
	public void f1() {
		System.out.println(">>> In lifecycle bean f1 method <<< " + "\n");
	}

//	@Bean
	public void f2() {
		System.out.println(">>> In lifecycle bean f2 method <<< " + "\n");
	}

//	@Bean
	public void f3() {
		System.out.println(">>> In lifecycle bean f3 method <<< " + "\n");
	}

	@PostConstruct
	public void f4() {
		System.out.println(">>> In Post Construct >> f4 method <<< " + "\n");
	}
	
	@PreDestroy
	public void f5() {
		System.out.println(">>> In Pre Destroy Construct >> f4 method <<< " + "\n");
	}
}
