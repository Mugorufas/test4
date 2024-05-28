import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
         System.out.println("Enter you numbers");
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
       Number z=new Number( a,  b);
       z.Compare();
    }
}
