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

    }
}
