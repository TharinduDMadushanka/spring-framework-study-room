package lk.tdm.spring_bean.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Load the Spring context from the XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // Retrieve the Customer bean by its ID
        Customer customer = (Customer) context.getBean("customer");

        // Use the Customer bean
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Customer Age: " + customer.getAge());
    }
}
