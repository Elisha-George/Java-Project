import java.util.Scanner;

public class LogIn extends Person{

    Scanner input = new Scanner(System.in);


    String password;

    public LogIn(String name) {
        super(name);

    }
    LogIn(){

    }


    void Login(){


        System.out.println("Log in:");
        System.out.println("username: ");
        name = input.next();

        System.out.println("password: ");
        password = input.next();

        //users check = new users(username, password);

        if(name.equals(name) && password.equals(password))
            System.out.println("You are logged in");
            else
                throw new LoginException("wrong information");

    }
}
class LoginException extends RuntimeException{
    LoginException (){


    }
    LoginException(String msg){
        super(msg);

    }
}
