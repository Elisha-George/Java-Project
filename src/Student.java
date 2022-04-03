import java.util.Scanner;

public class Student extends Person {

    private String id;
    private String bookName;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    //getters and setters are also added to add details to the private variables

    public Student(String name , String id, String bookName){

        super(name);
        this.id = id;
        this.bookName = bookName;

    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", bookName='" + bookName + '\'' +
                '}';
    }

    @Override
    public void DataInformation()
    {
        System.out.println("Name      : "+name);
        System.out.println("ID        : "+id);
        System.out.println("Book Name : "+bookName);
    }
}
