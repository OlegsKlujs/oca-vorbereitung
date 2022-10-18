import ipu.oca.I.class_struktur.Mitarbeiter;

//ipu.oca.I.objects.instanzen.SimpleKlasse

public class main_Example {

	main_Example() {
	}

	public static void main(String args[]) {
		Mitarbeiter a1 = new Mitarbeiter("Klaus", "braun");
		Mitarbeiter a2 = a1;

		int test1 = 10;
		int test2 = 10;
		test2 = test2 - 4;
		System.out.println("test1 " + test1);

		a2.haareFaerbenIn("blond");

		System.out.println("Die Haare von " + a1.vorname + " sind " + a1.haarfarbe);

	}

}
