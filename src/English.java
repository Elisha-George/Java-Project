public class English extends Books
{
    private String engBookName;

    public English()
    {

    }
    public English(String bookName, String shelfNumber, String bookID, int noOfBooks)
    {
        super(bookName,shelfNumber,bookID,noOfBooks);
        engBookName = bookName;

    }

    public String getEngBookName() {
        return engBookName;
    }

    public void setEngBookName(String engBookName) {
        this.engBookName = engBookName;
    }

    @Override
    public String toString() {
        return "English{" +
                "engBookName='" + engBookName + '\'' +
                ", bookName='" + bookName + '\'' +
                ", shelfNumber='" + shelfNumber + '\'' +
                ", bookID='" + bookID + '\'' +
                ", noOfBooks=" + noOfBooks +
                '}';
    }
}

