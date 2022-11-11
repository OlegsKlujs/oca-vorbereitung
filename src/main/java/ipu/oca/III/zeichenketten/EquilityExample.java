package ipu.oca.III.zeichenketten;

public class EquilityExample {

	public static void main(String... args) {
		vergleichenVonStrings();
		vergleichenVonStringBuilder();
	}

	private static void vergleichenVonStringBuilder() {
		StringBuilder a = new StringBuilder("");
		StringBuilder b = a.append("A").append("A").append("A");
		System.out.println("Stringbuilder a==b: " + (a == b));
	}

	private static void vergleichenVonStrings() {
		String a = "AAA";
		String b = "aaa".toUpperCase();
		System.out.println("== von " + a + " und " + b + ": " + (a == b));
		System.out.println("equls von " + a + " und " + b + ": " + a.equals(b));
	}
}
