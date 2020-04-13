import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        double rad = scan.nextDouble();

        double area = Math.pow(rad,2) * Math.PI;
        double circum = 2 * Math.PI * rad;

        double volume = (4/3) * Math.PI * Math.pow(rad, 3);
        double SA = 4 * Math.PI * Math.pow(rad,2);

        System.out.println("\nArea: " +area+ "\nCircumference is: " + circum);

        System.out.println("\nSphere volume: " + volume + "\nSurface Area: " +SA);
//        No decimal formatting specified in instructions

    }
}
