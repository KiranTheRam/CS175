import java.util.Scanner;

public class Q1B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a list of numbers; Q to quit" );
        int evencount=0;
        int oddcount =0;

        while (scan.hasNextInt()) {
            int input = scan.nextInt();
            if (input%2 == 0) {
                evencount++;
            }
            else {
                oddcount++;
            }

        }
        System.out.println("There were " + evencount+ " even numbers and " +oddcount+ " odd numbers");

    }
}
