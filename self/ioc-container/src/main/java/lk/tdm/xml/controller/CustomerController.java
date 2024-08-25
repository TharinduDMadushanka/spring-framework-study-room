package lk.tdm.xml.controller;

import lk.tdm.xml.service.CustomerService;

public class CustomerController {

    private  CustomerService customerService;

    // Setter injection (used by XML configuration)
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    public void processRequest() {
        customerService.serve();
        System.out.println("CustomerController has processed the request.");
    }
}

/**
 * we won't use the @Autowired annotation. Instead, we'll rely on XML configuration for dependency injection.
 */