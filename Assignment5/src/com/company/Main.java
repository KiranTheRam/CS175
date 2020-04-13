package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scannyBoi = new Scanner(System.in);
        System.out.print("Input an n value: ");
        int n = scannyBoi.nextInt();
        System.out.println("\nFirst " + n + " squares numbers are ");

        int i=0;
        int test =1;
        double tester=0;
        int square=0;
        while (true) {

            if (tester<n) {
                square = (i*i);
                tester = (test * test);
                System.out.print(square+ " ");
                i++;
                test++;
            }
            else {
                break;
            }
        }
//        The purpose of test and tester to make sure "100" isn't included in the output

        System.out.println();
        i=1;
        System.out.println("\nThe numbers smaller than n dividable by 10 are");
        while (i<n) {
            if (i%10==0) {
                System.out.print(i + " ");
                i++;
            }
            else {
                i++;
            }
        }

        System.out.println();
        System.out.println("\nThe powers of 2 while the power is less than n are");
        i=0;
        test =1;
        tester=0;
        double twoPow = 0;


        while (tester<n) {
            twoPow = (int) Math.pow(2,i);
            System.out.print(twoPow+ " ");
            tester=Math.pow(2,test);
            i++;
            test++;
        }

        System.out.println();
        System.out.println("\nValues from 2^0 to 2^n are ");
        i=0;
        while (i<=n) {
            System.out.print((int) Math.pow(2,i)+ " ");
            i++;
        }


    }
}
