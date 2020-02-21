import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number, and I'll take its abs val: ");
        int num = scan.nextInt();

        if (num<0) {
            num = -num;
            System.out.println(num);
        }
        else {
            System.out.println(num);
        }

    }
}
