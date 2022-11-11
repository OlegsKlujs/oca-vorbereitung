package ipu.oca.I.uebung;

import ipu.oca.I.class_struktur.Haustier;
import ipu.oca.I.class_struktur.Mitarbeiter;

//Olegs Klujs 19 ist verheiratet mit Özlem Klujs 18, kein Kind.

public class Ausfuehren {

	public static void main(String[] args) {
		// Mensch einmensch = new Mensch(args[0], args[1], new Integer(args[2]));
		Mensch einmensch = new Mensch("Martin", "Iden", 19);
		Mensch andererMensch = new Mensch("Susanne", "Schiller", 18);

		System.out.println("ist " + einmensch.vorname + " alter: " + einmensch.alleMeinSchweinchen());
		einmensch.aelterWerden();
		einmensch.aelterWerden();
		einmensch.aelterWerden();
		einmensch.aelterWerden();
		einmensch.aelterWerden();
		einmensch.aelterWerden();
		einmensch.aelterWerden();
		einmensch.aelterWerden();
		einmensch.aelterWerden();
		System.out.println("ist " + einmensch.vorname + " alter: " + einmensch.alleMeinSchweinchen());

		einmensch.heiraten(andererMensch);
		andererMensch.heiraten(einmensch);

		System.out.println("ist " + einmensch.vorname + " verheiratet mit: " + einmensch.ehepartner.vorname);
		System.out.println("ist " + einmensch.vorname + " verheiratet: " + einmensch.verheiratet);
		System.out.println("ist " + andererMensch.vorname + " verheiratet: " + andererMensch.verheiratet);

		Haustier hund = new Haustier("Fluffy");
		hund.mitHaar = true;

		andererMensch.liebling = hund;
		System.out.println(andererMensch.vorname + " hat ein Tier namens " + andererMensch.liebling.name);

	}
}

class Mensch {
	String vorname;
	String familienname;
	private int alter;
	Mensch kind;
	Mensch ehepartner;
	boolean verheiratet;
	Haustier liebling;
	Mitarbeiter freund;

	public Mensch() {
	}

	public Mensch(String vornameEingabe, String nachnameEingabe, int alterEingabe) {
		this.vorname = vornameEingabe;
		this.familienname = nachnameEingabe;
		this.alter = alterEingabe;
	}

	void heiraten(Mensch coolerMensch) {
		this.ehepartner = coolerMensch;
		this.verheiratet = true;
	}

	void aelterWerden() {
		this.alter = this.alter + 1;
	}

	public int alleMeinSchweinchen() {
		return this.alter;
	}
}
