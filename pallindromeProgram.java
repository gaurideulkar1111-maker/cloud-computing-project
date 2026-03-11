package com;

import java.util.Scanner;

public class pallindromeProgram {
	public static void main(String[] args) {
        int num, originalNum, remainder, reverse = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        originalNum = num;

        while(num != 0) {
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }

        if(originalNum == reverse)
            System.out.println("The number is Palindrome");
        else
            System.out.println("The number is not Palindrome");
    }
}
