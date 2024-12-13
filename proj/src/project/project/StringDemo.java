package project.project;

import java.util.*;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1 = new ArrayList<>(Arrays.asList(3, 1, 5, 7, 9, 2, 2, 9));

		// Add all elements to the list
		Collections.addAll(l1, 11, 12);
		System.out.println("After addAll: " + l1);

		// Sort the list in ascending order
		Collections.sort(l1);
		System.out.println("Sorted in ascending order: " + l1);

		// Sort the list in descending order
		Collections.sort(l1, Collections.reverseOrder());
		System.out.println("Sorted in descending order: " + l1);

		// Shuffle the list
		Collections.shuffle(l1);
		System.out.println("After shuffle: " + l1);

		// Find the minimum and maximum elements
		System.out.println("Min: " + Collections.min(l1));
		System.out.println("Max: " + Collections.max(l1));

		// Find the frequency of an element
		System.out.println("Frequency(Repeated) of 2: " + Collections.frequency(l1, 2));

		// Reverse the list
		Collections.reverse(l1);
		System.out.println("After reverse: " + l1);

		// Swap elements at index 0 and index 1
		Collections.swap(l1, 3,4);
		System.out.println("After swap: " + l1);

		// Replace all occurrences of a value
		Collections.replaceAll(l1, 9, 99);
		System.out.println("After replaceAll (replace 9 with 99): " + l1);

		// Rotate the list by 2 positions
		Collections.rotate(l1, 2);
		System.out.println("After rotate by 2: " + l1);

		// Fill the list with a single value
		Collections.fill(l1, 42);
		System.out.println("After fill: " + l1);
		
//		l1.stream().distinct().forEach(s -> System.out.print(s + " "));
	
	}

}
