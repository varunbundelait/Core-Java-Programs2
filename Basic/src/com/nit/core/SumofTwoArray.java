package com.nit.core;

import java.util.Scanner;

public class SumofTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub4
		int n, sum=0;
		System.out.println("Enter the size of array:\n");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("enter array first array:\n");
			a[i]=sc.nextInt();
			System.out.println("enter array second array:\n");
			b[i]=sc.nextInt();
			sum+=a[i]+b[i];
		}
		System.out.println("sum of two array:"+" "+sum);
	}

}
