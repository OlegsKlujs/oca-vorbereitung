package ipu.oca.II.zuweisung;

public class AutomatischesCasting {
	public static void main(String[] args) {
		automatisch();
		explizit();

		AutomatischesCasting test1 = new AutomatischesCasting();
		AutomatischesCasting test2 = new AutomatischesCasting();
		System.out.println(test1 == test2);
	}

	private static void automatisch() {
		int x = 1;
		long y = 18;
		x += y;
		System.out.println("automatisch x: " + x);
	}

	private static void explizit() {
		int x = 1;
		long y = 18;
		x = (int) (x + y);
		System.out.println("explizit x: " + x);
	}
}
