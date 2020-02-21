import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter an integer between 1,000 and 999,999: ");
        String num = scan.next();
        num = num.replaceAll(",", "");
        int number = Integer.parseInt(num);

        if (number >=1000 && number<=999999) {
            System.out.println(number);
        }
        else {
            System.out.println("Number not valid or within bounds");
        }
    }
}
