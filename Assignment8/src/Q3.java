import java.awt.*;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input rectangle width: ");
        int width = input.nextInt();

        System.out.print("Input rectangle height: ");
        int height = input.nextInt();

        Rectangle rectangle = new Rectangle(0, 0, width, height);
        double perimeter = (2*rectangle.getHeight())+(2*rectangle.getWidth());
        System.out.println("The perimeter is: "+ perimeter );
    }
}
