package lk.tdm.types.field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    public void processRequest() {
        customerService.serve();
        System.out.println("CustomerController has processed the request.");
    }

}

/**
 * Why Field Injection is Not Recommended:
     * Breaks Encapsulation: Directly accesses the fields of the class, breaking encapsulation.
     * Difficult to Test: Makes unit testing harder, as dependencies are not easily mockable.
     * Reduced Clarity: It's not clear from the constructor or methods what the dependencies are.
 */