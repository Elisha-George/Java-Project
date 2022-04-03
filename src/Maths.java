public class Maths extends Books {

    private  String mathBookName;

    public void setMathBookName(String mathBookName) {
        this.mathBookName = mathBookName;
    }

    public Maths()
    {

    }

    public Maths(String bookName, String shelfNumber, String bookID, int noOfBooks)
    {
        super(bookName,shelfNumber,bookID,noOfBooks);
        mathBookName = bookName;

    }

    public String getMathBookName() {
        return mathBookName;
    }

    @Override
    public String toString() {
        return "Maths{" +
                "mathBookName='" + mathBookName + '\'' +
                ", bookName='" + bookName + '\'' +
                ", shelfNumber='" + shelfNumber + '\'' +
                ", bookID='" + bookID + '\'' +
                ", noOfBooks=" + noOfBooks +
                '}';
    }
}

