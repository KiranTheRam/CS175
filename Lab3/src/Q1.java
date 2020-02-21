import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = scan.next();
        System.out.println();

//        First Letter
        System.out.println("First letter: " + input.substring(0,1));
//        Last Letter
        System.out.println("Last letter: " + input.substring(input.length()-1));
//        Middle Letters
        System.out.println("Middle letters: " + input.substring(1,(input.length()-1)));
    }
}
