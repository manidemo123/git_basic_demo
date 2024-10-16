package mypack;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		
		
		int arr[]= {34,21,44,1,9,7};
		 printArray(arr);
		
		for (int i = 0; i < arr.length-1; i++) {
			
		for (int j = 0; j < arr.length-i-1; j++) {
				
				if(arr[j]>arr[j+1])
				{
					int  temp= arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=temp;
					
				}
				
			}
			
		
			
		}
		
		
		
		
	}
	
	  public static void printArray(int[] arr) {
	        for (int i : arr) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	    }


}
