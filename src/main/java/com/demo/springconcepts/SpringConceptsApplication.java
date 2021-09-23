package com.demo.springconcepts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.springconcepts.component.DemoBean;
import com.demo.springconcepts.controller.HelloRestController;

@SpringBootApplication
public class SpringConceptsApplication {
	public static final Logger logger = LoggerFactory.getLogger(SpringBootApplication.class);
	public static void main(String[] args) {
		logger.debug("Welcome to Spring Concepts Demo");
		ApplicationContext context = SpringApplication.run(SpringConceptsApplication.class, args);
		DemoBean demoBean = context.getBean(DemoBean.class);
		logger.debug("Demo Bean"+demoBean.toString());
		//System.out.println(context.getBean(HelloRestController.class));
	}

}
