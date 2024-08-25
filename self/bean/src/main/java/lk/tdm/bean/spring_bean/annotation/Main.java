package lk.tdm.bean.spring_bean.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Load the Spring context from the annotated configuration class
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve the Customer bean by its type
        Customer customer = context.getBean(Customer.class);

        // Use the Customer bean
        customer.setName("TDM Shankar");
        customer.setAge(22);

        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Customer Age: " + customer.getAge());

        System.out.println("==========================================================");

        // Retrieve the Product bean by its type
        Product product = context.getBean(Product.class);

        // Use the Product bean
        product.setProdName("Biscuit");
        product.setPrice(100);
        product.setQoh(10);

        System.out.println("Product name: "+product.getProdName());
        System.out.println("Product price: "+product.getPrice());
        System.out.println("Product Qoh: "+product.getQoh());
    }
}

/**

 * AnnotationConfigApplicationContext:
     * This class is used to load the Spring context from a configuration class annotated with @Configuration.
     * It is similar to ClassPathXmlApplicationContext but works with Java-based configuration.

 * getBean(Customer.class):
     * Instead of using the bean’s id, we retrieve the Customer bean by its type.
     * This is possible because the Customer class is annotated with @Component.

 */