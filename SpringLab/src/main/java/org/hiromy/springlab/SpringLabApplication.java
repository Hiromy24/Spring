package org.hiromy.springlab;

import org.hiromy.springlab.controller.EmployeeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringLabApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringLabApplication.class, args);

		var employeeController = context.getBean(EmployeeController.class);

		System.out.println(employeeController.hello());
		System.out.println(employeeController.helloFromCustomerService());
	}

}
