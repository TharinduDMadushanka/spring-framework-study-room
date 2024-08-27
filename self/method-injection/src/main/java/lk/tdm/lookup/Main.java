package lk.tdm.lookup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("lookup.xml");

        CommandManager commandManager = context.getBean("commandManager",CommandManager.class);

        // Process command multiple times to see different instances
        commandManager.process();
        commandManager.process();

//        Each Command instance has a different memory address, showing that a new Command object is created each time.

    }
}

/**
 * Lookup Method Injection
 * This type of method injection is used when you want to inject a prototype-scoped bean into a singleton-scoped bean.
 * Since prototype beans are created each time they are requested, you can't just inject them into a singleton bean through
   the constructor or setter, as this would create only one instance.
 */

/**
 * Imagine a scenario where you have a CommandManager singleton bean that needs a new instance of a Command prototype bean
   every time a certain method is called.
 */