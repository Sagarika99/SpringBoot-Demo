package com.demo.springconcepts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.springconcepts.component.DemoBean;
import com.demo.springconcepts.component.EmployeeBean;
import com.demo.springconcepts.controller.HelloRestController;

@SpringBootApplication
public class SpringConceptsApplication {
	public static final Logger logger = LoggerFactory.getLogger(SpringBootApplication.class);
	public static void main(String[] args) {
		logger.debug("Welcome to Spring Concepts Demo");
		ApplicationContext context = SpringApplication.run(SpringConceptsApplication.class, args);
		logger.debug("Checking Context : {}",context.getBean(DemoBean.class));
		logger.debug("\n*** Example using @Autowire annotation on property ***");
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		employeeBean.setEid(104);
		employeeBean.setEname("Spring Framework Guru");
		employeeBean.showEmployeeDetails();
		//logger.debug("Demo Bean"+demoBean.toString());
		//System.out.println(context.getBean(HelloRestController.class));
	}

}
