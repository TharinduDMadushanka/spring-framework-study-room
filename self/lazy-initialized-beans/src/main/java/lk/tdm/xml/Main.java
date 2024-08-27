package lk.tdm.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Load the Spring context from the XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("lazy.xml");

        System.out.println("Application context loaded.");

        // LazyService bean will be initialized only when requested
        LazyService lazyService = (LazyService) context.getBean("lazyService");
        lazyService.doSomething();

    }
}

/**

 * ClassPathXmlApplicationContext: This class loads the Spring context from the applicationContext.xml file located in the classpath.

 * getBean("lazyService", LazyService.class): This method retrieves the LazyService bean from the Spring IoC container.
                                              The bean is initialized at this point since it is lazily loaded.
 */