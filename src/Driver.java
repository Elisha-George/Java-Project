
import java.util.ArrayList;
import java.util.Scanner;
public class Driver {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        English engBook1 = new English("HARRY POTTER AND THE SECRETE OF CHAMBERS", "1", "111", 10);
        English engBook2 = new English("HARRY POTTER PART 1", "2", "112", 5);
        Maths mathBook1 = new Maths("KENETH ROSEN", "33", "211", 1);
        Maths mathBook2 = new Maths("PROBABILITY ", "44", "212", 2);
         LogIn Log=new LogIn();
         //instentiating objects


        ArrayList<Student> studentList = new ArrayList<Student>();




        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>LIBRARY MANAGEMENT SYSTEM<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("____________________________________________________________");
        System.out.println("| ________________________________________________________ |");
        System.out.println("| |                                                      | |");
        System.out.println("| |         'ELISHA'S                                    | |");
        System.out.println("| |                 LIBRARY                              | |");
        System.out.println("| |                         MANAGEMENT                   | |");
        System.out.println("| |                                     SYSTEM  '        | |");
        System.out.println("| |                                                      | |");
        System.out.println("| |                                                      | |");
        System.out.println("| |                                                      | |");
        System.out.println("| |                 SPONSERED BY:                        | |");
        System.out.println("| |                       MUHAMMAD ALI JINNAH UNIVERSITY | |");
        System.out.println("| |______________________________________________________| |");
        int option;
        do {
            System.out.println("|----------------------------------------------------------|");
            System.out.println("| ________________________________________________________ |");
            System.out.println("| |                                                      | |");
            System.out.println("| |                                                      | |");
            System.out.println("| |        FOR ADMIN ACCESS PRESS (1)                    | |");
            System.out.println("| |                   1-- ADMIN                          | |");
            System.out.println("| |                                                      | |");
            System.out.println("| |        FOR STUDENT ACCESS   (2)                      | |");
            System.out.println("| |                   2-- STUDENT                        | |");
            System.out.println("| |                                                      | |");
            System.out.println("| |                                                      | |");
            System.out.println("| |                                                      | |");
            System.out.println("| |______________________________________________________| |");
            System.out.println("|__________________________________________________________|");

            option = 1;
            int user = input.nextInt();
            if(user ==1)
            {
                Log.Login();
                System.out.println("AVAILABLE BOOKS\n 1-- ENGLISH \n 2--MATHS");
                System.out.println("1- Book Detail");
                System.out.println("2- Student Detail");
                System.out.println("3- Edit Book Details/ OR ADD NEW BOOKS");
                System.out.println("Select Option : ");
                int detail = input.nextInt();

                //Print Detail
                if(detail ==1)
                {
                    System.out.println("Which type of book");
                    System.out.println("1- English \n2- Maths");
                    int bookSelect = input.nextInt();
                    input.nextLine();

                    if (bookSelect == 1) {
                        System.out.println("English Books");
                        System.out.println("Book Name    : " + engBook1.getEngBookName());
                        System.out.println("Book  ID     : " + engBook1.bookID);
                        System.out.println("Shelf Number : " + engBook1.shelfNumber);
                        System.out.println("Total Books  : " + engBook1.noOfBooks);
                        System.out.println("**********************************");
                        System.out.println("Book Name    : " + engBook2.getEngBookName());
                        System.out.println("Book  ID     : " + engBook2.bookID);
                        System.out.println("Shelf Number : " + engBook2.shelfNumber);
                        System.out.println("Total Books  : " + engBook2.noOfBooks);

                    } else if (bookSelect == 2) {
                        System.out.println("Maths Books");
                        System.out.println("Book Name    : " + mathBook1.getMathBookName());
                        System.out.println("Book  ID     : " + mathBook1.bookID);
                        System.out.println("Shelf Number : " + mathBook1.shelfNumber);
                        System.out.println("Total Books  : " + mathBook1.noOfBooks);
                        System.out.println("**********************************");
                        System.out.println("Book Name    : " + mathBook2.getMathBookName());
                        System.out.println("Book  ID     : " + mathBook2.bookID);
                        System.out.println("Shelf Number : " + mathBook1.shelfNumber);
                        System.out.println("Total Books  : " + mathBook1.noOfBooks);



                    }
                }

                //Print Student Detail

                else if(detail == 2)
                {
                    for(int index = 0; index < studentList.size(); index++)
                    {

                        Student std = studentList.get(index);
                        System.out.println("\n**************************");
                        std.DataInformation();


                    }

                }

                //edit detail

                else if(detail == 3)
                {
                    System.out.println("Which type of book");
                    System.out.println("1- English \n2- Maths");
                    int bookSelect = input.nextInt();
                    input.nextLine();

                    if (bookSelect == 1) {
                        System.out.println("English Books");
                        System.out.println("1-" + engBook1.getEngBookName());
                        System.out.println("2-" + engBook2.getEngBookName());
                        System.out.println("Which English Book");
                        int engType = input.nextInt();
                        System.out.println("1-Book ID");
                        System.out.println("2-Book Name");
                        System.out.println("3- Shelf Number");
                        System.out.println("4- Number of Books");
                        System.out.println("What u want to edit :");
                        int edit = input.nextInt();input.nextLine();
                        if (engType == 1) {
                            if(edit == 1) {
                                System.out.println("Enter New Book ID :");
                                String newID = input.nextLine();
                                engBook1.setBookID(newID);
                            }
                            if(edit == 2) {
                                System.out.println("Enter New Book Name :");
                                String newBookName = input.nextLine();
                                engBook1.setEngBookName(newBookName);
                            }
                            if(edit == 3) {
                                System.out.println("Enter Shelf Number :");
                                String newShelfNo = input.nextLine();
                                engBook1.setShelfNumber(newShelfNo);
                            }
                            if(edit == 4) {
                                System.out.println("Enter Numbers of Books :");
                                int newNoOfBooks = input.nextInt();
                                engBook1.setNoOfBooks(newNoOfBooks);
                            }
                        }

                        else if (engType == 2) {
                            if(edit == 1) {
                                System.out.println("Enter New Book ID :");
                                String newID = input.nextLine();
                                engBook2.setBookID(newID);
                            }
                            if(edit == 2) {
                                System.out.println("Enter New Book Name :");
                                String newBookName = input.nextLine();
                                engBook2.setEngBookName(newBookName);
                            }
                            if(edit == 3) {
                                System.out.println("Enter Shelf Number :");
                                String newShelfNo = input.nextLine();
                                engBook2.setShelfNumber(newShelfNo);
                            }
                            if(edit == 4) {
                                System.out.println("Enter Numbers of Books :");
                                int newNoOfBooks = input.nextInt();
                                engBook2.setNoOfBooks(newNoOfBooks);
                            }
                        }
                    } else if (bookSelect == 2) {
                        System.out.println("Maths Books");
                        System.out.println("1-" + mathBook1.getMathBookName());
                        System.out.println("2-" + mathBook2.getMathBookName());
                        System.out.println("Which Maths Book");
                        int mathType = input.nextInt();
                        System.out.println("1-Book ID");
                        System.out.println("2-Book Name");
                        System.out.println("3- Shelf Number");
                        System.out.println("4- Number of Books");
                        System.out.println("What u want to edit :");
                        int edit = input.nextInt();input.nextLine();
                        if (mathType == 1) {
                            if(edit == 1) {
                                System.out.println("Enter New Book ID :");
                                String newID = input.nextLine();
                                mathBook1.setBookID(newID);
                            }
                            if(edit == 2) {
                                System.out.println("Enter New Book Name :");
                                String newBookName = input.nextLine();
                                mathBook1.setMathBookName(newBookName);
                            }
                            if(edit == 3) {
                                System.out.println("Enter Shelf Number :");
                                String newShelfNo = input.nextLine();
                                mathBook1.setShelfNumber(newShelfNo);
                            }
                            if(edit == 4) {
                                System.out.println("Enter Numbers of Books :");
                                int newNoOfBooks = input.nextInt();
                                mathBook1.setNoOfBooks(newNoOfBooks);
                            }
                        }

                        else if (mathType == 2) {
                            if(edit == 1) {
                                System.out.println("Enter New Book ID :");
                                String newID = input.nextLine();
                                mathBook2.setBookID(newID);
                            }
                            if(edit == 2) {
                                System.out.println("Enter New Book Name :");
                                String newBookName = input.nextLine();
                                mathBook2.setMathBookName(newBookName);
                            }
                            if(edit == 3) {
                                System.out.println("Enter Shelf Number :");
                                String newShelfNo = input.nextLine();
                                mathBook2.setShelfNumber(newShelfNo);
                            }
                            if(edit == 4) {
                                System.out.println("Enter Numbers of Books :");
                                int newNoOfBooks = input.nextInt();
                                mathBook2.setNoOfBooks(newNoOfBooks);
                            }
                        }

                    }
                }
                else{
                    System.out.println("INVALID INPUT");
                }




            }
            else {




                System.out.println("1- For Finding Books");
                System.out.println("2- For Issuing Books");
                int select = input.nextInt();

                if (select == 1) {


                    System.out.println("Which type of book you want");
                    System.out.println("1- English \n2- Maths");
                    int bookSelect = input.nextInt();
                    input.nextLine();

                    if (bookSelect == 1) {
                        System.out.println("English Books");
                        System.out.println("1-" + engBook1.getEngBookName());
                        System.out.println("2-" + engBook2.getEngBookName());
                        System.out.println("Which English Book");
                        int engType = input.nextInt();
                        if (engType == 1) {
                            engBook1.displayData();
                        } else if (engType == 2) {
                            engBook2.displayData();
                        }
                    } else if (bookSelect == 2) {
                        System.out.println("Maths Books");
                        System.out.println("1-" + mathBook1.getMathBookName());
                        System.out.println("2-" + mathBook2.getMathBookName());
                        System.out.println("Which Maths Book");
                        int mathType = input.nextInt();
                        if (mathType == 1) {
                            mathBook1.displayData();
                        } else if (mathType == 2) {
                            mathBook2.displayData();
                        }

                    }

                } else if (select == 2) {

                    String stdBook = null;
                    System.out.println("Which type of book you want");
                    System.out.println("1- English \n2- Maths");
                    int bookSelect = input.nextInt();
                    input.nextLine();

                    if (bookSelect == 1) {
                        System.out.println("English Books");
                        System.out.println("1-" + engBook1.getEngBookName());
                        System.out.println("2-" + engBook2.getEngBookName());
                        System.out.println("Which English Book");
                        int engType = input.nextInt();
                        if (engType == 1) {
                            engBook1.bookAvailable();
                            stdBook=engBook1.getEngBookName();
                        } else if (engType == 2) {
                            engBook2.bookAvailable();
                            stdBook=engBook2.getEngBookName();
                        }
                    } else if (bookSelect == 2) {
                        System.out.println("Maths Books");
                        System.out.println("1-" + mathBook1.getMathBookName());
                        System.out.println("2-" + mathBook2.getMathBookName());
                        System.out.println("Which Maths Book");
                        int mathType = input.nextInt();

                        if (mathType == 1) {
                            mathBook1.bookAvailable();
                            stdBook=mathBook1.getMathBookName();
                        } else if (mathType == 2) {
                            mathBook2.bookAvailable();
                            stdBook=mathBook2.getMathBookName();
                        }

                    }
                    input.nextLine();
                    System.out.println("Enter Your Name : ");
                    String stdName;

                    stdName = input.nextLine();
                    System.out.println("Enter Your ID : ");
                    String stdID = input.nextLine();
                    studentList.add(new Student(stdName,stdID,stdBook));

                    System.out.println("Book Has Been Issued");

                }


            }
            System.out.println("4- BACK");
            option = input.nextInt();
            input.nextLine();
        }while (option == 4);

    }
}


