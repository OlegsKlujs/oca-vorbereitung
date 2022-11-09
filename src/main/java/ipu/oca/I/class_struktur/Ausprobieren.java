
package ipu.oca.I.class_struktur;

public class ausprobieren {
	public static Mitarbeiter bla = null;

	public static void main(String[] args) {

//		Mitarbeiter nina = new Mitarbeiter("Nina", "Rot");
//
////		System.out.println(nina.vorname + " hat die Haarfarbe: " + nina.haarfarbe);
//		nina.kaufeHaustier("Fluffi");
//		System.out.println("Name von Haustier von " + nina.vorname + " ist " + nina.getHaustiername());
//
//		Haustiere test = new Haustiere();
//
//		Mitarbeiter alex = new Mitarbeiter();
//		alex.vorname = "Alex";
//		alex.haarfarbe = "Grün";
//
////		System.out.println(alex.vorname + " hat die Haarfarbe: " + alex.haarfarbe);
//
//		{
//			System.out.println("test");
//		}
		Mitarbeiter mitarbeiter = new Mitarbeiter("Peter");

		Mitarbeiter mitarbeiter2 = new Mitarbeiter("Hans");

		int test = 0041;

		System.out.println("Here Guck: " + test);

		mitarbeiter2 = mitarbeiter; // ---> kann Has raus

		System.out.println("Demo: " + Mitarbeiter.abteilung);
		bla = mitarbeiter2;
	}

	public void testMethode() {
		Mitarbeiter test = new Mitarbeiter("name");
	}

	public void testMethode2() {
		System.out.println(Mitarbeiter.abteilung);
	}

	public void testMethode3() {
		Mitarbeiter test = new Mitarbeiter("name");
	}

}

final class Kaese {
	private int art;

	Kaese(int inialwert) {
		art = inialwert;
	}

	public int getArt() {
		return art;
	}

}
