package day3;

import java.util.Scanner;
class Spy_Number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = n;
        int sum = 0;
        int product = 1;

        while (temp > 0) {
            int rem = temp % 10;
            sum = sum + rem;
            product = product * rem;
            temp = temp / 10;
        }

        if (sum == product) {
            System.out.println("Spy Number");
        } else {
            System.out.println("Not a Spy Number");
        }
    }
}
