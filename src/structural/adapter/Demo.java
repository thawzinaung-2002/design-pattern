package structural.adapter;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		int[] numbers = new int[] {34, 2, 0, 12, 3, 1, 2};
		
		Sorter sorter = new SortListAdapter();
		numbers = sorter.sort(numbers);
		
		Arrays.stream(numbers)
		.forEach(System.out::println);
	}
	
}
