//ASSIGNMENT1a --> AMSTRONG NUMBER
package com.Sreeja;
import java.util.Scanner;

public class AMSTRONGNUMBER {

    public static void main(String[] args) {
        int n, count = 0, a, b, c, sum = 0;// Initialization
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        a = n;
        c = n;
        while (a > 0) // Counting the digit and place of the digits
        {
            a = a / 10;
            count++;
        }
        while (n > 0)// Splitting into digits
        {
            b = n % 10;
            sum = (int) (sum + Math.pow(b, count));
            n = n / 10;
        }
        if (sum == c) // Checking the number
        {
            System.out.println( "Armstrong number");
        } else {
            System.out.println("Is Not an Armstrong Number");
        }
    }
}
