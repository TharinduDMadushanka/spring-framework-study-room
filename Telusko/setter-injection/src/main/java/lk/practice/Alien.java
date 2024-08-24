package lk.practice;

public class Alien {

    private int age;

    public Alien(){
        System.out.println("Alien Object Created..!");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Age assigned..!");
        this.age = age;
    }

    public void code(){
        System.out.println("I'm coding..!");
    }
}
