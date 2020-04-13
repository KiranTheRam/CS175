import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        A
        int sum =0;
        for(int i=2; i<=100; i=i+2){
            sum = sum + i;
        }
        System.out.println(sum);

//        B
        System.out.print("Enter a number n: ");
        int n = scan.nextInt();
        System.out.println();
        for (int i =1; i<n; i++) {
            if (i%10==0) {
                System.out.print(i + " ");
            }
        }

//        C
        System.out.println();
        System.out.print("Enter a word: ");
        char[] chr;
        String s1 = scan.next();
        chr = s1.toCharArray();

        for (int i =s1.length()-1; i>=0; i--) {
            System.out.print(chr[i]);
        }
    }
}
