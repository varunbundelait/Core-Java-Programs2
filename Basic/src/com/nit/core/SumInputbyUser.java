package com.nit.core;

import java.util.Scanner;

public class SumInputbyUser {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,  y,  z; // non-static variables
		System.out.println("enter two integers no\n");
		
		//scanner is used for input given by user
		Scanner sc= new Scanner(System.in);
		x=sc.nextInt();//for integer
		y=sc.nextInt();
		z=x+ y;
		System.out.println("sum of entered integers=" +z);
	}

}
