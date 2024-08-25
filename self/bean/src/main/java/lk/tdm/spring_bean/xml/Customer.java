package lk.tdm.spring_bean.xml;

import java.io.Serializable;

public class Customer{

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
