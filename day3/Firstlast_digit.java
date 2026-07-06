package day3;

import java.util.Scanner;
class FirstLast_digitSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int last = n % 10;
        int first = n;

        while (first >= 10) {
            first = first / 10;
        }

        int sum = first + last;

        System.out.println("First Digit = " + first);
        System.out.println("Last Digit = " + last);
        System.out.println("Sum = " + sum);
    }
}