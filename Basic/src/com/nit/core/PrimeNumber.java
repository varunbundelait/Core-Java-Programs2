package com.nit.core;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n;
		System.out.println("Enter a number\n");
		Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        if(checkPrime(n)) {
        	System.out.println("number is prime");
        }
        else {
        	System.out.println("number is not prime" );
        }
	}

	private static boolean checkPrime(int n) {
		// TODO Auto-generated method stub
		if(n<=1) {
			return false;
		}
		for(int i=2; i < Math.sqrt(n); i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
