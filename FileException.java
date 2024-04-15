package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileException{

    public static void main(String[] args) throws FileNotFoundException {
        
       
        FileInputStream file=new FileInputStream("c:\\TEXT.txt");
        System.out.println("End of program");
        
        
        
    }
    
}
