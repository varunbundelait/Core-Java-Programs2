package com.nit.core;

import java.util.Scanner;

public class SwitchProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number between 1 to 7\n");
	   Scanner sc= new Scanner(System.in);
	  int num=sc.nextInt();
       switch(num) {
          case 1:
              System.out.println("Monday");
              break;
          case 2:
              System.out.println("Tuesday");
              break;
          case 3:
              System.out.println("Wednesday");
              break;
          case 4:
              System.out.println("Thrusday");
              break;
          case 5:
              System.out.println("Friday");
              break;
          case 6:
              System.out.println("Saturday");
              break;
          case 7:
              System.out.println("Sunday");
              break;
          default:
        	  System.out.println("Please enter vaild number");
       }
	}

}
