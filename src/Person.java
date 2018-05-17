import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Person {
     String name;
    private int age;
    private String jTitle;

    public Person(String name, int age, String jTitle) {
        this.name = name;
        this.age = age;
        this.jTitle = jTitle;
    }

    public String getName() {
        return name;

    }

    public int getAge() {
        return age;
    }

    public String getjTitle() {
        return jTitle;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setjTitle(String jTitle) {
        this.jTitle = jTitle;
    }

    public String toString(){
        return name + "-" +age+"-" + jTitle;
    }

}

