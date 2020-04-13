import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input gallons of gas: ");
        double galOfGas = scan.nextDouble();

        System.out.println("Input fuel efficiency : ");
//        Miles per gallon
        double Eff = scan.nextDouble();

        System.out.println("Input price per gallon: ");
        double priceOfGas = scan.nextDouble();

        double HundredPrice = (priceOfGas)*(100*(1/Eff));

        System.out.println("With your current gas you can go " +(Eff*galOfGas)+ " miles");
        System.out.printf("Going 100 miles will cost you $%.2f", HundredPrice);
    }
}
