import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    //        In this code I reuse variables because they make sense within the context of each example. (For example I used 'sum' in multiple questions)
    //        I would have preferred to make different classes for each sub-question of #2 to stop confusion but i wasn't sure if you were OK with that

//        2 A
        int i =2;
        int sum =0;
        while (i<=100) {

            sum = sum + i;
            i = i + 2;
        }
        System.out.println("The sum of all even numbers between 2 and 100 is "+ sum);

//        2 B
        i = 1;
        int squareValue;
        sum = 0;
        while (i <= 10) {
            squareValue= (i*i);
            sum += squareValue;
            i++;
        }
        System.out.println("The sum of all squares between 1 and 100 is "+sum);

//        2 C
        System.out.print("Please enter 2 integers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        sum = 0;

    // Check which input is greater and swaps them if needed
        int temp;
        if(a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        int j =a;
        while (j<=b) {
            if (j % 2 == 1)
                sum += j;
            j++;
        }

        System.out.println("The sum of all odd numbers (inclusive) between " + a + " and "+ b + " is " + sum);

//        2 D
        int num, digit, count = 0;

        System.out.print("Enter a number to have its odd digits summed:");

        num = in.nextInt();
        in.close();

        temp = num;
        sum =0;
        while(num > 0)
        {
            num = num / 10;
            count++;
        }
        while(temp > 0)
        {
            digit = temp % 10;
                if (digit%2==1) {
                    sum +=digit;
                }
            temp = temp / 10;
            count--;
        }
        System.out.println(sum);
    }

    }
