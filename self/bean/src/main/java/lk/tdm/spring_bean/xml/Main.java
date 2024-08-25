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

        System.out.println("==========================================================");

        // Retrieve the Product bean by its ID
        Product product = (Product) context.getBean("product");

        // Use the Customer bean
        System.out.println("Product Name: " + product.getProdName());
        System.out.println("Product price: " + product.getPrice());
        System.out.println("Product QOH: " + product.getQoh());

    }
}

/**

 - ClassPathXmlApplicationContext:
    * This class loads the Spring context from an XML configuration file located in the classpath. Here, it loads the spring.xml file.

 - getBean("customer"):
    * This method retrieves the bean from the Spring context by its id ("customer & product" in this case).

 - Output:
    * The application prints the name and age of the Customer bean that was configured in the XML file.

 */