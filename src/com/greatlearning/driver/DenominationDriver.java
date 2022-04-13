package com.greatlearning.driver;

import java.util.Scanner;

public class DenominationDriver {
	
	public static void main(String[] args) throws Exception{
		
		System.out.println("Enter number of denominations:");
		try (Scanner sc = new Scanner(System.in)) {
			int n= sc.nextInt();
			
			System.out.println("Enter the denomination:");
			int denominations[] = new int[n];
			
			for (int i=0; i<n; i++) {
				denominations[i]= sc.nextInt();	
			}
			
			System.out.println("Enter Amount:");
			int sum = sc.nextInt();
			
			int count[] = new int[denominations.length];
			
			for(int i=0; i<denominations.length; i++){
				if(sum>= denominations[i]) {
					int x = sum/denominations[i];
					sum= sum - (denominations[i]*x);
					count[i] = x;
				}
			}
			
			if(sum>0) {
				System.out.println("Not Possible to pay the Amount");
			}else {
				System.out.println("Your Payment is done with minimum number of notes as below:");
				for(int i=0;i<count.length;i++) {
					System.out.println(denominations[i]+":"+count[i]);
					
				}
				
			}
			
		}
		
	}

}
