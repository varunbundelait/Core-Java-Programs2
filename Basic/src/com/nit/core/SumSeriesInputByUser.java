package com.nit.core;

import java.util.Scanner;

public class SumSeriesInputByUser {
   public static void main(String[] args) {
	   double sum=0.0; int n, z;
	   System.out.println("Enter a number sum to be calculate:\n");
	   Scanner sc=new Scanner(System.in);
	   n=sc.nextInt();
	  for(int i=0; i<n; i++) {
		  System.out.println("Enter a number\n");
		  z=sc.nextInt();
		  sum=sum+z;
		  
	  }
	  System.out.println("sum of series:"+" "+sum);
   }
}
