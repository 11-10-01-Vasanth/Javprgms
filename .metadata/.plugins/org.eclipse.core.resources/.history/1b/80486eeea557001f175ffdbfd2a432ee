package proj;

import java.util.*;

// Insertion Sort
public class InsertionSort {
	public static void main(String[] args) {
		int a[] = { 5, 4, 2, 3, 1 };
		for (int i = 1; i < a.length; i++) {
			int key = a[i];
			int j = i - 1;
			while (j >= 0 && key < a[j]) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;
		}
		for (int a1 : a) {
			System.out.print(a1);
		}
	}
}
