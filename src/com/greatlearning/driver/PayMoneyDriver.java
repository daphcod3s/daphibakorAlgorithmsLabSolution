package com.greatlearning.driver;

import java.util.Scanner;

public class PayMoneyDriver {
	
	public static void main(String[] args) throws Exception{
		
		int size, targetNo, transaction[], target, sum=0, i;
		int flag=0;
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the size of transaction array:");
			size = sc.nextInt();
			
			transaction = new int[size];
			System.out.println("Enter the values of array:");
			for (i=0; i<size; i++) {
				transaction[i]=sc.nextInt();
			}
			
			System.out.println("Enter the total no of targets that needs to be achieved: \n");
			targetNo=sc.nextInt();
			
			while(targetNo-- !=0)
			{
				System.out.println("Enter the value of target:");
				target=sc.nextInt();
				
				for(i=0; i<size; i++) {
					sum+=transaction[i];
					
					if(sum>=target){
						System.out.println("Target achieved after "+ (i+1) +" transactions");
						flag=1;
						break;
					}
					
				}
				
				if(flag==0) {
					System.out.println("Target was not achieved");
				}	
			}
			
			sc.close();
		}	
	
	}
}
