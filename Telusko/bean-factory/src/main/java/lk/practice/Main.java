package lk.practice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        BeanFactory factory = new ClassPathXmlApplicationContext("spring.xml");

        Alien obj = (Alien) factory.getBean("alien");
        obj.code();
    }
}