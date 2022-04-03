import java.util.Scanner;

public abstract class Books implements Library {

    String bookName;
    String shelfNumber;
    String  bookID;
    int noOfBooks;

    public Books ()             // default constructer;
    {

    }

    public Books(String bookName, String shelfNumber, String bookID, int noOfBooks) {
        this.bookName = bookName;
        this.shelfNumber = shelfNumber;
        this.bookID = bookID;
        this.noOfBooks = noOfBooks;
    }


    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setShelfNumber(String shelfNumber) {
        this.shelfNumber = shelfNumber;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public void setNoOfBooks(int noOfBooks) {
        this.noOfBooks = noOfBooks;
    }

    public String getBookName() {
        return bookName;
    }

    public String getShelfNumber() {
        return shelfNumber;
    }//getters and setters are also added to add details to the private variables

    public String getBookID() {
        return bookID;
    }

    public int getNoOfBooks() {
        return noOfBooks;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookName='" + bookName + '\'' +
                ", shelfNumber='" + shelfNumber + '\'' +
                ", bookID='" + bookID + '\'' +
                ", noOfBooks=" + noOfBooks +
                '}';
    }

    public void bookAvailable() {
        if (noOfBooks !=0) {
            System.out.println("Available");
            noOfBooks = noOfBooks-1;

        }
        else {
            System.out.print("Not Available....");
        }
    }

    public void displayData() {
        System.out.println("Book ID      : "+bookID);
        System.out.println("Book Name    : "+bookName);
        System.out.println("Shelf Number : "+shelfNumber);

    }
}
