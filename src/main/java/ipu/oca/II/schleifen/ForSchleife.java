package ipu.oca.II.schleifen;

public class ForSchleife {

	public static void main(String[] args) {
		sonderfall_MehrereBedingungen();
	}

	private static void unendlicheSchleife() {
		for (;;) {
		}
	}

	private static void sonderfall_MehrereBedingungen() {
		int x = 2;
		for (int i = 1, k = 0; i < 3 && x < 10; i++, k++)
			System.out.println("wie gehts");

	}

	private static void sonderfall_VariableAusserhalbDesSchleifengeltungsbereiches() {
		for (int i = 10; i > 0; i--)
			System.out.println("Laufvariable ist gleich: " + i--);
		// System.out.println("Erneute aktualisierung ist gleich: " + i);

	}
}
