import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter total number of hours worked for the whole week ");
        int totalhours=scanner.nextInt();
        if (totalhours > 40) {
            int overtime=totalhours-40;
            double payment=10*overtime*12;
            System.out.println("total over time payment is "+ payment +" £");

        }
        else{
            System.out.println("No overtime payment ");
        }
    }
}
