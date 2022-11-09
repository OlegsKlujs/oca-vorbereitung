package ipu.oca.II.schleifen;

public class ContinueAnweisung {
	public static void main(String[] args) {
		String[][] kursteilnehmer = { { "Stefan Meineke", "Melani SInger", "Olaf Scholz" },
				{ "Olaf Mies", "Malene Otzenkopf", "Markus Meinz" },
				{ "Sibel Schlaumeyer", "Olaf Witz", "Olaf Hesch" } };

		String gesucht = "Olaf";
		System.out.println("break: " + schleifeMitLabelBreak(kursteilnehmer, gesucht));
		System.out.println("continue: " + schleifeMitLabelContinue(kursteilnehmer, gesucht));
	}

	private static String schleifeMitLabelBreak(String[][] kursteilnehmer, String gesucht) {
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

	private static String schleifeMitLabelContinue(String[][] kursteilnehmer, String gesucht) {
		String gefunden = "";
		SCHLEIFEN_START: for (String[] kurs : kursteilnehmer) {
			for (int i = 0; i < kurs.length; i++) {
				if (kurs[i].contains(gesucht)) {
					gefunden = kurs[i];
					continue SCHLEIFEN_START;
				}
			}
		}

		return gefunden;
	}
}
