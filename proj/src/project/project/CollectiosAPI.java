package project.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//import java.util.stream.Stream;

public class CollectiosAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1 = Arrays.asList(2, 1, 5, 4, 7);
//		l1.forEach(n -> System.out.println(n));
//		int result = l1.stream().reduce(0, (c,e) -> c+e);

		Collections.sort(l1);
		System.out.println(l1);

		l1.stream().sorted().filter(i -> i % 2 == 0).forEach(i -> System.out.println(i));

	}

}
