package lk.tdm.bean.java_bean;

public class Main {
    public static void main(String[] args) {

        Customer c1 = new Customer();
        c1.setName("TDM");
        c1.setAge(22);

        System.out.println(c1.getAge());
        System.out.println(c1.getName());

    }
}

/**
 ~ Java Bean ~

     * A Java Bean is a simple Java class that adheres to certain conventions:
     * It must have a no-argument constructor.
     * It should have private fields (properties).
     * It should provide public getter and setter methods for accessing the properties.
     * It should implement Serializable (optional, but common in JavaBeans).
 */