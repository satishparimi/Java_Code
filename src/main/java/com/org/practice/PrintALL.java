package com.org.practice;

import java.util.Scanner;

public class PrintALL {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter input");
		int n = scn.nextInt();
		
		printNum(n);

	}
	
	public static void printNum(int n){
		
        while(n !=1){
            System.out.println("n is :"+n);

            //if n is even
            if((n & 1 ) == 1){
                n = ( n * 3 ) + 1;
            }else{
                n = n/2;
            }
                  
        }
         System.out.println(n);
    }

}
