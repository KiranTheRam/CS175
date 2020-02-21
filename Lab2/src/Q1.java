import java.util.Scanner;

public class Q1 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Please enter a number: " );
            int num1 = input.nextInt();
            System.out.println();
            System.out.print("Please enter another number:");
            int num2 = input.nextInt();

            System.out.println("The sum is " + (num1 + num2));
            System.out.println("The difference is " + (num1 - num2));
            System.out.println("The product is " + (num1 * num2));
            System.out.println("The average is " + ((double)(num1 * (double)num2)/2));
            System.out.println("The distance is " + Math.abs(num1 - num2));

            System.out.println("The maximum of the two is " + Math.max(num1, num2));
            System.out.println("The minimum of the two is " + Math.min(num1, num2));


//      I wrote this before reading you wanted me to use the Math.min/max function
//            if (num1 >num2) {
//                System.out.println("The maximum of the two is " + num1);
//                System.out.println("The minimum of the two is " + num2);
//            }
//            else if (num2 > num1){
//                System.out.println("The maximum of the two is " + num2);
//                System.out.println("The minimum of the two is " + num1);
//            }
//            else
//                System.out.println("The numbers are equal");

        }
    }