package lk.tdm.aware_interfaces;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class CustomBean implements ApplicationContextAware, BeanNameAware {

    private String name;
    private ApplicationContext applicationContext;

    @Override
    public void setBeanName(String beanName) {
        this.name = beanName;
        System.out.println("Bean name set to: " + beanName);
        // configuration (xml or annotation) bean name
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        System.out.println("ApplicationContext has been set.");
    }

    public void displayBeanDetails() {
        System.out.println("Bean name: " + name);
        System.out.println("ApplicationContext ID: " + applicationContext.getId());
    }
}

/**
 * setBeanName(String beanName):
   This method is called by the Spring container, passing the name of the bean as defined in the Spring configuration
   (XML or annotation). The bean stores this name and can use it for logging, debugging or any other purpose.

 * setApplicationContext(ApplicationContext applicationContext):
   This method is called by the Spring container, passing the ApplicationContext instance in which the bean is defined.
   The bean can now interact with the Spring container, such as retrieving other beans or accessing resources.

 * displayBeanDetails():
   A custom method to display the bean name and the ApplicationContext ID,
   demonstrating the use of the information provided by the Aware interfaces.
 */