import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a list of numbers; Q to quit: ");
        int max = scan.nextInt();
        int min = max;

        while (scan.hasNextInt()) {
            int input = scan.nextInt();

            if (input>max) {
                max = input;
            }
            if (input<min) {
                min = input;
            }
        }
        System.out.println("The maximum value is "+ max);
        System.out.println("The minimum value is "+ min);
    }
}
