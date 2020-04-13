import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input name: ");
        String name = input.nextLine();
        System.out.println();

        System.out.print("Input salary: ");
        double sal = input.nextDouble();
        System.out.println();

        System.out.print("Input hours worked last week: ");
        double hours = input.nextDouble();
        System.out.println();

        if (hours > 40) {
            double OverHours = hours - 40;
            System.out.println();
            double OverSal = sal * 1.5;
            double pay = (40 * sal) + (OverHours * OverSal);
            System.out.println(name+ " earned $" + pay+ " this week working " + hours+ " hours ");
        }
        else {
            double pay = hours * sal;
            System.out.println(name+ " earned $" + pay+ " this week working " + hours+ " hours ");

        }

    }
}
