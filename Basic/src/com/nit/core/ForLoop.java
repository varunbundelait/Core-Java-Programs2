package com.nit.core;

import java.util.Scanner;
//print table using for loop
public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i; int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number\n");
        num= sc.nextInt();
        for(i=1; i<=10; i++) {
        		System.out.println(num+"*"+i+"="+ num*i);
        	
        }
	}

}
