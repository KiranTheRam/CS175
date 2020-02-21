import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a measurement in meters: ");
        int meters = input.nextInt();
        double miles = meters * 0.000621371;
        double feet = meters * 3.28084;
        double inches = meters * 39.3701;

        System.out.println("Miles: " + miles);
        System.out.println("Feet: " + feet);
        System.out.println("Inches: " + inches);
    }
}
