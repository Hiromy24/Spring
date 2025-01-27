package org.hiromy.springlab.controller;

import org.hiromy.springlab.primary.CustomerService;
import org.hiromy.springlab.service.EmployeeService;
import org.hiromy.springlab.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
 public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private CustomerService customerService;

    public String hello(){
        return this.employeeService.hello();
    }

    public String helloFromCustomerService(){
        return this.customerService.hello();
    }
}
