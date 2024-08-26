package lk.tdm.constructor;

public class CustomerController {

    private final CustomerService customerService;

    // Constructor injection
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    public void processRequest() {
        customerService.serve();
        System.out.println("CustomerController has processed the request.");
    }

}

/**
 * the CustomerController depends on CustomerService.
 * The CustomerService dependency is injected via the constructor.
 */