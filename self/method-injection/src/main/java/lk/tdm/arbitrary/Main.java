package lk.tdm.arbitrary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Load the Spring context from the XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("arbitrary.xml");

        // Get the OrderService bean from the Spring context
        /**
         * Retrieve OrderService Bean: The orderService bean is retrieved from the Spring context. At this point,
         * the CustomerService bean has already been injected into it via XML configuration.
         */
        OrderService orderService = context.getBean("orderService",OrderService.class);

        // Call the method to see the injection in action
        /**
         * Call processOrder Method: The processOrder method is called on orderService,
         * which uses the customerService bean to perform its operation.
         */
        orderService.processOrder(context.getBean("customerService",CustomerService.class));

    }
}

/**
 * Arbitrary Method Injection
 * Arbitrary method injection allows Spring to inject dependencies into any method, not just constructors or setters.
 * This is less common and is often used for more complex dependency injection scenarios.
 */

/**
 * In the example, we want to inject a dependency (CustomerService) into a specific method (processOrder) of the OrderService bean.
 */

/**
 * arbitrary.xml

 * CustomerService Bean: Defined as a regular bean. This service provides the functionality needed by OrderService.
 * OrderService Bean: Contains a method (processOrder) that requires an instance of CustomerService.
                      The XML configuration sets up a CustomerService bean and injects it into the OrderService bean.
 */

/**
 *
 */