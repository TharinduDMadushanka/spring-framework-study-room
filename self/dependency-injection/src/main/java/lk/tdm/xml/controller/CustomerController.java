package lk.tdm.xml.controller;

import lk.tdm.xml.service.CustomerService;

public class CustomerController {

    private CustomerService customerService;

    // Setter method for DI via XML
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    public void processRequest() {
        customerService.serve();
        System.out.println("CustomerController has processed the request.");
    }
}
