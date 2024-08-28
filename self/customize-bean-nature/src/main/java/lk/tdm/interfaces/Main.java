package lk.tdm.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Load the Spring context from the XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("interface.xml");

        // Retrieve the DatabaseConnection bean from the context
        DatabaseConnection dbConnection = context.getBean("databaseConnection", DatabaseConnection.class);

        // Use the bean (for demonstration purposes)
        System.out.println("Using the database connection...");

        // Close the context to trigger the destroy method
        ((ClassPathXmlApplicationContext) context).close();

    }
}
