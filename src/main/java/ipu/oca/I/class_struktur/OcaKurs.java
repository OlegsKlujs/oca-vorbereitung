package ipu.oca.I.class_struktur;

import ich.bin.ein.beispielpaket.Tutor;

public class OcaKurs {
	public static void main(String[] args) {
		String nameDerVeranstaltung = args[0];
		String nameDesTutors = args[1];

		Tutor veranstalter = new Tutor();
		veranstalter.namenAendern(nameDesTutors);

		Veranstaltung ocaKurs = new Veranstaltung();
		ocaKurs.titel = nameDerVeranstaltung;
		ocaKurs.veranstalter = veranstalter;

		System.out.println("Veranstaltung name: " + ocaKurs.titel);
		System.out.println("Veranstaltung name: " + ocaKurs.veranstalter.nameAuslesen());

	}

}

class Veranstaltung {
	String titel;
	String datum;
	String ort;
	int anzahlVonTeilnemern;
	Tutor veranstalter;
	boolean voll;

	void belegen(String... studenten) {

	}

	void anlegen(String[] studenten) {

	}

}