package lk.tdm.types.setter;

public class CustomerController {

    private CustomerService customerService;

    // Setter injection
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    public void processRequest() {
        customerService.serve();
        System.out.println("CustomerController has processed the request.");
    }
}

/**
 * CustomerService is injected into the CustomerController via the setter method setCustomerService().
 */