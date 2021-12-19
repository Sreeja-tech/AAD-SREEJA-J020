//ASSIGNMENT1c --> NEON NUMBER
package com.Sreeja;
import java.util.Scanner;
public class NEONNUMBER {
    public static void main(String[] args) {
        int sum = 0, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        int square = n * n;
//loop executes until the condition becomes false
        while(square != 0)
        {
//find the last digit of the square
            int digit = square % 10;
//adds digits to sum
            sum = sum + digit;
//removes last digit
            square = square / 10;
        }
//compares the given number
        if(n == sum)
            System.out.println(n+ " is a Neon Number.");
        else
            System.out.println(n+ " is not a Neon Number.");

    }

}

