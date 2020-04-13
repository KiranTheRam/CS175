import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your income: $");
        double income = scan.nextDouble();

        if (income<=50000) {
            System.out.println("Income tax is " + income*0.01);
        }
        else if (income>50000 && income<=75000) {
            System.out.println("Income tax is " + income*0.02);
        }
        else if (income>75000 && income<=100000) {
            System.out.println("Income tax is " + income*0.03);
        }
        else if (income>100000 && income<=250000) {
            System.out.println("Income tax is " + income*0.04);
        }
        else if (income>250000 && income<=500000) {
            System.out.println("Income tax is " + income*0.05);
        }
        else if (income>500000) {
            System.out.println("Income tax is " + income*0.06);
        }
        else {
            System.out.println("Entered an invalid value (maybe negative?)");
        }
    }
}
