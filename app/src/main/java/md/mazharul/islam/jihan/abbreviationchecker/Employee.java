package md.mazharul.islam.jihan.abbreviationchecker;

/**
 * Created by Jihan on 05-Jun-17.
 */

public class Employee {

    private String name;
    private String age;

    public  Employee(String name,String age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public String getAge(){
        return age;
    }
}