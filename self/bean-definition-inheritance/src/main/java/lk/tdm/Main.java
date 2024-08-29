package lk.tdm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Load the Spring context from the XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve and use the customer1 bean
        Customer customer1 = context.getBean("customer1", Customer.class);
        System.out.println("Customer 1: " + customer1);

        // Retrieve and use the customer2 bean
        Customer customer2 = context.getBean("customer2", Customer.class);
        System.out.println("Customer 2: " + customer2);

        Customer customer3 = context.getBean("customer3", Customer.class);
        System.out.println("Customer 3: " + customer3);

    }
}

/**
 * Bean Definition Inheritance in Spring allows you to define common properties and configuration for multiple beans in a base bean definition,
   which can then be inherited by other bean definitions. This helps reduce redundancy in XML configurations by allowing child beans to
   inherit and override specific properties from a parent bean.

 * Key Points:
 * Parent Bean:
     * A bean definition that contains common properties that other beans can inherit.
     * It is usually defined as an abstract bean (abstract="true"), meaning it is not instantiated on its own.

 * Child Bean:
     * A bean that inherits configuration from a parent bean and can override or extend these properties.

 */

