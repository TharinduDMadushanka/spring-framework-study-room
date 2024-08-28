package lk.tdm.aware_interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Load the Spring context from the XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("aware.xml");

        // Retrieve the CustomBean from the context
        CustomBean customBean = context.getBean("customBean", CustomBean.class);

        // Display the bean details
        customBean.displayBeanDetails();

        // Close the context
//        ((ClassPathXmlApplicationContext) context).close();

    }
}

/**

 * Spring Context Loaded: The Spring context is loaded, and the CustomBean is instantiated.

 * setBeanName Method Called: The setBeanName method is called by the Spring container,
   passing the bean's name (customBean) as defined in the XML configuration.

 * setApplicationContext Method Called: The setApplicationContext method is called by the Spring container,
   passing the ApplicationContext instance.

 * Bean Used: The displayBeanDetails method is called, printing the bean name and the ApplicationContext ID.

 */
