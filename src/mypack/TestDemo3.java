package mypack;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestDemo3 {
	
	public static void main(String[] args) {
		
		List<Integer> number =  Arrays.asList(1,5,56,76,88);
		// List <Integer> result =number.stream.filter(Comparator.reverseOrder()).forEach(System.out::println);
		 
		// number.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		 
		 List<Integer> test = number.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		 
		 System.out.println(test);
		 
		
		//Optional<Integer> maxE = number.stream().max(Comparator.naturalOrder()).ifPresent(null);
		
		Optional<Integer> maxRR = number.stream().min(Comparator.naturalOrder());
		System.out.println(maxRR);
		
		Optional<Integer> secMax =number.stream().skip(1).max(Comparator.naturalOrder());
		System.out.println("ll"+secMax);
		
		//int arr[]= {1,5,56,76,88,4,27};
		
		

		        int[] arr = {5, 2, 9, 1, 5, 6};

		        bubbleSortDescending(arr);
		        System.out.println("Sorted array in descending order:");
		        for (int num : arr) {
		            System.out.print(num + " ");
		        }
		    }

		    // Bubble Sort in descending order
		    public static void bubbleSortDescending(int[] arr) {
		        int n = arr.length;
		        

		        for (int i = 0; i < n - 1; i++) {
		           
		            for (int j = 0; j < n - 1 - i; j++) {
		            	
		                if (arr[j] < arr[j + 1]) {
		                    // Swap arr[j] and arr[j + 1]
		                    int temp = arr[j];
		                    arr[j] = arr[j + 1];
		                    arr[j + 1] = temp;
		                    
		                }
		            }
		         
		        }
		    }
		

		
		
		 
		
	

}
