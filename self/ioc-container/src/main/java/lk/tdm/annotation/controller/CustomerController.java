package lk.tdm.annotation.controller;

import lk.tdm.annotation.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CustomerController {

    private final CustomerService customerService;

    // Constructor injection
    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    public void processRequest(){
        customerService.serve();
        System.out.println("CustomerController has processed the request.");
    }
}

/**

 * @Controller: Indicates that this class is a Spring MVC controller.

 * @Autowired: Injects the CustomerService bean into CustomerController.
               This is an example of dependency injection, where the IoC Container handles injecting the necessary service.
 */