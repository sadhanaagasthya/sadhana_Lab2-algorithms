package com.gl.transaction.main;

import java.util.Scanner;

import com.gl.transaction.service.TransactionService;

public class TransactionDriver {
	public static void main(String args[]) {
		Scanner s =new Scanner(System.in);
		System.out.println("enter the size of the transaction array");
		int size= s.nextInt();
		int arr[]= new int[size];
		System.out.println("enter the values of array");
		for(int i=0;i<size;i++) 
			arr[i]= s.nextInt();
			System.out.println("enter the total number of targets that needs to be achieved");
			int targetNo=s.nextInt();
			TransactionService transactionService =new TransactionService();
			transactionService.checkTransaction(arr,targetNo);
			s.close();
			
		}
		
	}

 
