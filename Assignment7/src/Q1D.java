import java.util.Scanner;

public class Q1D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a list of numbers; Q to quit: ");
        int input = scan.nextInt();
        while (scan.hasNextInt()) {
            int previous =input;
            input = scan.nextInt();
            if (input==previous) {
                System.out.print(input+ " ");
            }
        }
    }
}
