package com.example.MySecondSpringBootApp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j

public class MyFirstRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		log.info("MyFirstRunner is running...");

		configWithAnnotationConfing();

	}

	public static void configWithAnnotationConfing() {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				MySecondSpringBootAppApplication.class);

		log.info("MENU");
		log.info("Pizzas");
		log.info(ctx.getBean("MargheritaPizza").toString());

		ctx.close();

	}

}
