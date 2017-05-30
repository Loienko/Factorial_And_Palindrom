package net.ukr.dreamsicle.Palindrom;

import java.util.Scanner;

/**
 * Created by Yura on 24.05.2017.
 */
public class Palindrom {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input number and press Enter");
        int n;

        n = sc.nextInt();

        int a = n / 100000;

        int b = n % 100000 / 10000;

        int c = n % 100000 % 10000 / 1000;

        int d = n % 100000 % 10000 % 1000 / 100;

        int e = n % 100000 % 10000 % 1000 % 100 / 10;

        int f = n % 100000 % 10000 % 1000 % 100 % 10 / 1;

        sc.close();

        if (a == f && b == e && c == d) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

}
