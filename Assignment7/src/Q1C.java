import java.util.Scanner;

public class Q1C {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter a list of numbers; Q to quit: ");
        while (scan.hasNextInt()) {
            int input = scan.nextInt();
            sum += input;
            System.out.print(sum + " ");
        }
    }
}
