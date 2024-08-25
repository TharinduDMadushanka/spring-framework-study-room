package lk.tdm.xml;

import lk.tdm.xml.controller.CustomerController;
import lk.tdm.xml.controller.ProductController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Load the Spring context from the XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");

        // Retrieve the CustomerController bean
        CustomerController customerController = context.getBean("customerController",CustomerController.class);

        // Use the controller
        customerController.processRequest();

        System.out.println("===============================================================");

        ProductController productController = context.getBean("productController",ProductController.class);
        productController.processSaving();

    }
}
