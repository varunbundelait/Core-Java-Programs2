package com.nit.core;

import java.util.Scanner;

public class ArmstrongNumber {
	int rem; double sum;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		 Scanner sc= new Scanner(System.in);
         System.out.println("enter a number");
         int number = sc.nextInt();
         if (isArmstrong(number)) {
             System.out.println(number + " is an Armstrong number.");
         } else {
             System.out.println(number + " is not an Armstrong number.");
         }
     }
     // Function to check if a number is an Armstrong number
     private static boolean isArmstrong(int num) {
         int originalNumber, remainder, result = 0, n = 0;
         originalNumber = num;
         // Count number of digits
         while (originalNumber != 0) {
             originalNumber /= 10;
             ++n;
         }
         originalNumber = num;
         // Calculate result
         while (originalNumber != 0) {
             remainder = originalNumber % 10;
             result += Math.pow(remainder, n);
             originalNumber /= 10;
         }
         // Check if num is Armstrong
         return result == num;
	}

}
