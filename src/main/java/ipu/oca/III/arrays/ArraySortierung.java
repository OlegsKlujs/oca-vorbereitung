package ipu.oca.III.arrays;

import java.util.Arrays;

public class ArraySortierung {

	public static void main(String args[]) {

		sortierungBeispielInt();
		sortierungBeispielString();
	}

	private static void sortierungBeispielInt() {
		printTitle("sortierungBeispielInt");

		int unsortierterArrayInt[] = { 9, 8, 7, 6, 5 };
		Arrays.sort(unsortierterArrayInt);
		for (int elem : unsortierterArrayInt) {
			System.out.println(elem);
		}
	}

	private static void sortierungBeispielString() {
		printTitle("sortierungBeispielString");

		String[] unsortierterArrayString = { "10", "9", "1", "4" };
		Arrays.sort(unsortierterArrayString);
		for (String elem : unsortierterArrayString) {
			System.out.println(elem);
		}
	}

	private static void printTitle(String title) {
		System.out.println("--------------------------");
		System.out.println(title);
		System.out.println("--------------------------");
	}
}
