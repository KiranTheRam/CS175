import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");

        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();
        float num3 = scanner.nextFloat();

        if ((num1>=num2 && num1>=num3)) {
            System.out.print("\nThe largest number is: " + num1);
        }
        else if ((num3>=num1 && num3>=num2)) {
            System.out.print("\nThe largest number is: " + num3);
        }
        else {
            System.out.print("\nThe largest number is: " + num2);
        }
    }
}
