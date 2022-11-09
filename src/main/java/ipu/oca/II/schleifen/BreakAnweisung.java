package ipu.oca.II.schleifen;

public class BreakAnweisung {

	public static void main(String[] args) {
		String[][] kursteilnehmer = { { "Stefan Meineke", "Melani SInger", "Olaf Scholz" },
				{ "Olaf Mies", "Malene Otzenkopf", "Markus Meinz" },
				{ "Sibel Schlaumeyer", "Olaf Witz", "Olaf Hesch" } };

		String gesucht = "Olaf";
		String resulat = schleifeMitLabel(kursteilnehmer, gesucht);
		// String resulat = schleifeMitBreak(kursteilnehmer, gesucht);
		// String resulat = schleifeOhneBreak(kursteilnehmer, gesucht);
		System.out.println(resulat);
	}

	private static String schleifeMitLabel(String[][] kursteilnehmer, String gesucht) {
		String gefunden = "";
		SCHLEIFEN_START: for (String[] kurs : kursteilnehmer) {
			for (int i = 0; i < kurs.length; i++) {
				if (kurs[i].contains(gesucht)) {
					gefunden = kurs[i];
					break SCHLEIFEN_START;
				}
			}
		}

		return gefunden;
	}

	private static String schleifeMitBreak(String[][] kursteilnehmer, String gesucht) {
		String gefunden = "";
		for (String[] kurs : kursteilnehmer) {
			for (int i = 0; i < kurs.length; i++) {
				if (kurs[i].contains(gesucht)) {
					gefunden = kurs[i];
					break;
				}
			}
		}
		return gefunden;
	}

	private static String schleifeOhneBreak(String[][] kursteilnehmer, String gesucht) {
		String gefunden = "";
		for (String[] kurs : kursteilnehmer) {
			for (int i = 0; i < kurs.length; i++) {
				if (kurs[i].contains(gesucht)) {
					gefunden = kurs[i];
				}
			}
		}
		return gefunden;
	}
}
