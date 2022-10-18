package ipu.oca.I.packages;

import ipu.oca.I.class_struktur.Mitarbeiter;

public class SimpleImport {
	public static void main(String[] args) {
		Mitarbeiter ma1 = new Mitarbeiter();
		ma1.vorname = "Nina";
		ma1.haarfarbe = "Rot";

		System.out.println(ma1.vorname + " hat die Haarfarbe: " + ma1.haarfarbe);

		SimpleKlasse test = new SimpleKlasse();
	}
}
