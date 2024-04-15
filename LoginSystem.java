package exception;

import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) throws InvalidPasswordException{
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter password:");
        String pwd=scanner.next();
        if(pwd.equals("swathi")){
           
            System.out.println("allow login");
        }
        else{
           throw new InvalidPasswordException("you are enter the wrong password");
        }
    }
    
}
class InvalidPasswordException extends Throwable{
    InvalidPasswordException(String s){
        super(s);
    }
}
