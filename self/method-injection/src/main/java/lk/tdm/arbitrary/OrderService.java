package lk.tdm.arbitrary;

public class OrderService {

    private CustomerService customerService;

    // This method will be used to inject the dependency
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    public void processOrder(CustomerService customerService) {
        customerService.serve();
        System.out.println("Order processed.");
    }

}
