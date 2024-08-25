package lk.tdm.annotation;

import lk.tdm.annotation.config.AppConfig;
import lk.tdm.annotation.controller.CustomerController;
import lk.tdm.annotation.controller.ProductController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Load the Spring context from the annotated configuration class
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve the CustomerController bean
        CustomerController controller = context.getBean(CustomerController.class);

        // Use the controller
        controller.processRequest();

        System.out.println("==========================================================");

        ProductController productController = context.getBean(ProductController.class);
        productController.processSaving();
    }
}

/**

 * AnnotationConfigApplicationContext: Loads the Spring context based on the Java configuration class (AppConfig).

 * Dependency Injection (DI): The IoC Container automatically injects the CustomerService bean into CustomerController.

 * Lifecycle Management: The IoC Container manages the entire lifecycle of beans from creation to destruction.

 */