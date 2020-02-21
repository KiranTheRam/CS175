import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: " );
        int num1 = input.nextInt();
        System.out.println();
        System.out.print("Please enter another number:");
        int num2 = input.nextInt();


        int sum = (num1 + num2);
        int difference = (num1 - num2);
        int product =(num1 * num2);
        double average = ((double) num1 + (double)num2)/2;
        int distance = Math.abs(num1 - num2);
        int max =  Math.max(num1, num2);
        int min = Math.min(num1, num2);


        System.out.printf("Sum: %15d" , sum);
        System.out.println();
        System.out.printf("Difference: %8d" , difference);
        System.out.println();
        System.out.printf("Product: %11d" , product);
        System.out.println();
        System.out.printf("Average: %14.2f" , average);
        System.out.println();
        System.out.printf("Distance: %10d" , distance);
        System.out.println();
        System.out.printf("Maximum: %11d" , max);
        System.out.println();
        System.out.printf("Minimum: %11d" , min);

    }
}
