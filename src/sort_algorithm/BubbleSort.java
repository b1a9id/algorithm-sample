package sort_algorithm;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] array = {2, 5, 8, 6, 10, 1, 3, 7, 9, 4};

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = array.length - 1; j > i; j--) {
				if (array[j - 1] > array[j]) {
					int x = array[j - 1];
					array[j - 1] = array[j];
					array[j] = x;
				}
			}
		}

		Arrays.stream(array).forEach(System.out::println);
	}
}
