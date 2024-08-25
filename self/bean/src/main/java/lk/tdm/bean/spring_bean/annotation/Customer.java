package lk.tdm.bean.spring_bean.annotation;

import org.springframework.stereotype.Component;

@Component
public class Customer {

    private String name;
    private int age;

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

/**
 * @Component:
     * This annotation indicates that the Customer class is a Spring component,
     * meaning it will be managed by the Spring IoC container.
     * When Spring's component scanning is enabled, Spring will automatically detect and register this class as a bean.
 */