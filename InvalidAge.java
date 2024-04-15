package exception;

import java.util.Scanner;

public class InvalidAge {
    public static void main(String[] args) throws InvalidAgeException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter age of a person");
        int age=scanner.nextInt();
       if(age<18){
        throw new InvalidAgeException("you are enter the invalid age");
       }
       else{
        System.out.println("age is:"+age);
       }
       
    }
    
}

class InvalidAgeException extends Throwable{
    InvalidAgeException(String str){
       super(str);
    }
}
