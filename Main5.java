import java.util.Scanner;
public class Main5 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the number of unit purchased");
        int unitpurchased=scanner.nextInt();
        if (unitpurchased<30) {
            System.out.println("does he have customer preferred status write "+1+" for yes and "+0 +" for no");
            int customerPreferredStatus=scanner.nextInt();
            if (customerPreferredStatus==1) {
                double discoutedPrice=0.9*150;
                System.out.println("your discouted price is "+ discoutedPrice);
            }
            else{
                System.out.println("you unit price is "+150);
            }
            
        }
        else if (unitpurchased>= 30&& unitpurchased <=69) {
            
             System.out.println("does he have customer preferred status write "+1+" for yes and "+0 +" for no");
            int customerPreferredStatus=scanner.nextInt();
            if (customerPreferredStatus==1) {
                double discoutedPrice=0.9*140;
                System.out.println("your discouted price is "+ discoutedPrice);
            }
            else{
                System.out.println("you unit price is "+140);
            }
        }
        else{
            if (unitpurchased>69) {
                 System.out.println("does he have customer preferred status write "+1+" for yes and "+0 +" for no");
            int customerPreferredStatus=scanner.nextInt();
            if (customerPreferredStatus==1) {
                double discoutedPrice=0.9*120;
                System.out.println("your discouted price is "+ discoutedPrice);
            }
            else{
                System.out.println("you unit price is "+120);
            }
            }
        }

    }
}
