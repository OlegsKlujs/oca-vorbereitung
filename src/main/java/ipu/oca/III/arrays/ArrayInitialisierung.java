package ipu.oca.III.arrays;

public class ArrayInitialisierung {

	public static void main(String[] args) {
		defaultValues();
	}

	private static void defaultValues() {
		intValues();
		stringValues();
		booleanValues();
	}

	private static void intValues() {
		int[] intArray = new int[10];
		System.out.println("intArray\n ________________________");
		for (int el : intArray) {
			System.out.println(el);
		}
		System.out.println("_________________________");
	}

	private static void booleanValues() {
		boolean[] booleanArray = new boolean[10];
		System.out.println("booleanArray\n ________________________");
		for (boolean el : booleanArray) {
			System.out.println(el);
		}
		System.out.println("_________________________");
	}

	private static void stringValues() {
		String[] stringArray = new String[10];
		System.out.println("stringArray\n ________________________");
		for (String el : stringArray) {
			System.out.println(el);
		}
		System.out.println("_________________________");
	}
}
