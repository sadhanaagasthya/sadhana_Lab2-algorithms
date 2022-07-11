package com.gl.notecount.service;

public class MergeSortImplementation {
	 void merge(int arr[],int left,int mid, int right) {
		//find the size of two subarrays to merge
		int n1= mid-left+1;
		int n2=right-mid;
		
		//create two temporary arrays
		int leftArray[]= new int[n1];
		int rightArray[]= new int[n2];
		
		//copy the data to temporary arrays
		for(int i=0;i<n1;++i) 
			leftArray[i]= arr[left+i];
		for(int j=0;j<n2;++j) 
			rightArray[j]= arr[mid+1+j];
		int i=0,j=0;
		
		//initial index of merged subarray
		int k=left;
		while(i<n1 && j<n2) {
			if(leftArray[i]>= rightArray[j]) {
				arr[k]=leftArray[i];
				i++;
				}
			else {
				arr[k]= rightArray[j];
				j++;
			}
			k++;
		}
		//copy remaining elements of L[] if any
		while (i<n1) {
			arr[k]= leftArray[i];
			i++;
			k++;
		}
		//copy remaining elements of R[] if any
		while (j<n2) {
			arr[k]= rightArray [j];
			j++;
			k++;
		}
	}
	
public   void sort(int[] notes,int left,int right) {
	if(left<right) {
		int mid= (left+right)/2;
		
		sort(notes,left,mid);
		sort(notes,mid+1,right);
		merge(notes,left,mid,right);
	}

		
	}
}


