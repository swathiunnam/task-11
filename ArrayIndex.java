package exception;

import java.util.Scanner;

public class ArrayIndex {
    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the position:");
        int pos=scanner.nextInt();
        System.out.println("Enter the value:");
        int value=scanner.nextInt();
        
        try {
            a[pos]=value;
            System.out.println(a[pos]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
          System.out.println("Array index out of bound"+e);
        }
        
    }
    
}
