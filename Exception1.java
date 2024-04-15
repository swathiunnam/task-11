package exception;

import java.util.Scanner;

public class Exception1 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1=scanner.nextInt();
        try {
            System.out.println(100/num1);
            
        } catch(ArithmeticException e) {
            System.out.println("Invalid data.."+e);
            
            
        }
        

        
    }
    
}
