package ipu.oca.I.class_struktur;

public class Ausprobieren {

	public static void main(String[] args) {
		Mitarbeiter nina = new Mitarbeiter("Nina", "Rot");

//		System.out.println(nina.vorname + " hat die Haarfarbe: " + nina.haarfarbe);
		nina.kaufeHaustier("Fluffi");
		System.out.println("Name von Haustier von " + nina.vorname + " ist " + nina.getHaustiername());

		Haustiere test = new Haustiere();

		Mitarbeiter alex = new Mitarbeiter();
		alex.vorname = "Alex";
		alex.haarfarbe = "Grün";

//		System.out.println(alex.vorname + " hat die Haarfarbe: " + alex.haarfarbe);

		{
			System.out.println("test");
		}

	}

}
