package mypack;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class PractiseQ {
	
	public static void main(String[] args) {
		
		
		//Write a Java 8 program to get the three maximum and three
		//minimum numbers from a given list of integers.
		
		
		List<Integer> number=Arrays.asList(23,34,11,9,2,32,88,65,3,4,30);
		
		
		List<Integer> min=number.stream()
        .sorted(Integer::compare)
       // .limit(3)
        .collect(Collectors.toList());
		
		
		System.out.println("Min"+min);
		
		
	List<Integer> max =	number.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
	
	System.out.println("Max"+max);
	
	
	
	
	  List<String> names = Arrays.asList("rohit", "urmila", "rohit", "urmila", "ram", "sham", "sita", "gita");
      Map<String, Long> frequencyWords = names.stream()
              .collect(groupingBy(Function.identity(), counting()));
      System.out.println("T"+frequencyWords);
		
	}

	   List<String> names = Arrays.asList("rohit", "urmila", "rohit", "urmila", "ram", "sham", "sita", "gita");

       // Using Stream API to count the frequency of each string in the list
       Map<String, Long> frequencyWords = names.stream()
               .collect(groupingBy(Function.identity(), counting()));

       // Output the result
     

}
