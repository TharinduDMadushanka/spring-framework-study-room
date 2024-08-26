package lk.tdm.annotation;

import lk.tdm.annotation.config.AppConfig;
import lk.tdm.annotation.controller.CustomerController;
import lk.tdm.annotation.controller.ProductController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        CustomerController customerController = context.getBean(CustomerController.class);
        customerController.processRequest();

        System.out.println("===========================================");

        ProductController productController = context.getBean(ProductController.class);
        productController.processSave();

    }
}
