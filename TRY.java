import java.util.Scanner;

public class TRY {
    public static void main(String[] args) {
       try {
         Scanner scanner=new Scanner(System.in);
         System.out.println("enter a new numbers");
         int a=scanner.nextInt();
         int b=scanner.nextInt();
         int c=a/b;
       } catch (Exception e) {
        // TODO: handle exception
        System.out.println("ther is an error");
       }
       finally{
        System.out.println("am always executed");
       }
        
    }
}
