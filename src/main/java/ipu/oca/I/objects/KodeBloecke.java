package ipu.oca.I.objects;

public class KodeBloecke {

	static {
		System.out.println("static"); // 0
	}

	{
		System.out.println("Auserhalb1"); // 1
	}

	KodeBloecke() {
		System.out.println("Im Konstruktor"); // 3
	}

	public static void main(String[] args) {
		KodeBloecke test;

		// Ausprobieren2 test = new Ausprobieren2();

		System.out.println("Innterhalb"); // 4

	}

	{
		System.out.println("Auserhalb2"); // 2
	}
}
