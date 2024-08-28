package lk.tdm.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Load the Spring context from the XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");

        // Retrieve the DatabaseConnection bean from the context
        DatabaseConnection dbConnection = context.getBean("databaseConnection", DatabaseConnection.class);

        // Use the bean (for demonstration purposes)
        System.out.println("Using the database connection...");

        // Close the context to trigger the destroy method
        ((ClassPathXmlApplicationContext) context).close();

    }
}

/**
 * Explanation of Execution:

 * Spring Context Loaded: The ApplicationContext is loaded, triggering the creation of the DatabaseConnection bean.

 * Custom Init Method Called: The customInit() method is called due to the @PostConstruct annotation or init-method attribute in the XML.
   This method establishes the database connection.

 * Bean Used: The bean is used in the application, though in this example it's just a simple print statement.

 * Context Closed: When the Spring context is closed, the customDestroy() method is called due to the @PreDestroy annotation or
   destroy-method attribute in the XML. This method closes the database connection.
 */