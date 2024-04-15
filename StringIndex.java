package exception;

public class StringIndex {
    public static void main(String[] args) {
        String str="Hello";
        try {
            char ch=str.charAt(5);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Please enter correct range"+e);
        }
        
    }
    
}
