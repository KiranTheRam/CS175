import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input length of side 1: ");
        int side1 = input.nextInt();
        System.out.println();
        System.out.print("Input length side 2: ");
        int side2 = input.nextInt();

        double pythag = Math.sqrt(Math.pow(side1,2) + Math.pow(side2,2));
        System.out.println();
        System.out.println("The area is: " + (side1 * side2));
        System.out.println("The perimeter is: " + ((side1*2)+(side2*2)));
        System.out.println("The length of the diagonal is: " + pythag);

    }
}
