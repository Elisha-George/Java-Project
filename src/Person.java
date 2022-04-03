import java.util.Scanner;
public abstract class Person {

    String name;
    public Person()
    {

    }

    public Person(String name)
    {
        this.name=name;
    }


    public void DataInformation()
    {
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
