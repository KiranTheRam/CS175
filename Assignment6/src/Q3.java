import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = input.nextInt();

        System.out.println();

        System.out.print("Enter 2nd number: ");
        int num2 = input.nextInt();

        System.out.println();

        System.out.print("Enter 3rd number: ");
        int num3 = input.nextInt();

        System.out.println();

        if ((num1<num2 && num2<num3)) {
            System.out.println(num1 +" "+num2 +" "+num3 + " increasing");
        }
        else if ((num3<num2 && num2<num1)) {
            System.out.println(num1 +" "+num2 +" "+num3 + " decreasing");
        }
        else {
            System.out.println(num1 +" "+num2 +" "+num3 + " neither");
        }
    }
}
