package com.nit.core;

import java.util.Scanner;
//reverse of a number
public class ReverseNumber {
	public static void main(String[] args) {
	   int rev=0;
	   System.out.println("Enter a number:\n");
	   Scanner sc= new Scanner(System.in);
	   int num=sc.nextInt();
	   while(num!=0) {
		   int rem=num%10;
		   rev =rev*10+rem;
		   num=num/10;
	   }
	   System.out.println();
	   System.out.println("Reverse of a number:"+" "+rev);
	 
	}

}
