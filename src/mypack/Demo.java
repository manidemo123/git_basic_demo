package mypack;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Demo {
	
	
	public static void main(String[] args) {
		
		
		List<Integer> number =Arrays.asList(4,11,8,9,7,62);
		
		int sumEven =number.stream().filter(n->n%2==0).mapToInt(Integer::intValue).sum();
		int sumOdd= number.stream().filter(n->n%2!=0).mapToInt(Integer::intValue).sum();
		
	//	System.out.println("SUmEven"+sumEven);
	//	System.out.println("SUmOdd"+sumOdd);
		
		Optional<Integer> secondMin = number.stream().sorted().skip(1).findFirst();
		
		Optional<Integer> secondMax = number.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		
	//	System.out.println("secondMax ="+secondMax);
	//	System.out.println("secondMin ="+secondMin);
		
		
		List<String> words = Arrays.asList("Oracle", "Java", "Magazine");
		 List<Integer> wordLengths = words.stream().map(String::length).collect(Collectors.toList());
		System.out.println("+"+wordLengths);
		
		
				
		
	}

}
