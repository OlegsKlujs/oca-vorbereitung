package ipu.oca.II.anweisung;

public class DreistelligeOperatoren {

	public static void main(String[] args) {
		boolean sues = true;

		String essen = simpleTernary(sues);
		System.out.println("Wir essen jetzt: " + essen);

		System.out.println("----------------------");

		beispielUnterschiedliecherRueckgabewert();

	}

	public static String simpleTernary(boolean suesesEssen) {
		String essen = suesesEssen ? "Nachtisch" : "Hauptgang";
		return essen;
	}

	public static void beispielUnterschiedliecherRueckgabewert() {
		boolean kondition = true;

		Object magischesEtwas = kondition ? "Hier ein String" : 1234;
		System.out.println("Hier passiert die Magie: " + magischesEtwas);
	}
}
