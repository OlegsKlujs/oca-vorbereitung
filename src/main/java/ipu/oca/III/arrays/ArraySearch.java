package ipu.oca.III.arrays;

import java.util.Arrays;

public class ArraySearch {

	public static void main(String[] args) {

		int[] sortierterArray = { 1, 2, 3, 4, 8, 10 };
		int unsortierterArray[] = { 9, 8, 7, 6, 5 };

		System.out.println("Exists: " + Arrays.binarySearch(sortierterArray, 3));
		System.out.println("Doesnt exist: " + Arrays.binarySearch(sortierterArray, 9));
		System.out.println("Unsorted" + Arrays.binarySearch(unsortierterArray, 9));
	}

}
