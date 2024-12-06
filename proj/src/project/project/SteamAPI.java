package project.project;

import java.util.*;
import java.util.stream.Stream;

public class SteamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List l1 = Arrays.asList(1,3,4,2,6,5);
			
			l1.addAll(l1);
			
			int res = Collections.binarySearch(l1, 1);
			
			System.out.println(res);
			
//			l1.forEach(i -> System.out.println(i));
			
			Stream<Integer> s = l1.stream();
			
			Stream<Integer> s1 = s.filter(i -> i%2==0).sorted();
			
//			s1.forEach(i -> System.out.println(i));
			
	}

}
