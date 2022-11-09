package ipu.oca.II.anweisung;

public class IfThenElse {
	public static void main(String[] args) {
		int alter = 22;
		ifThenElse(alter);
		System.out.println("-------------------");
		multipleIfs(alter);
	}

	public static void ifThenElse(int alter) {
		if (alter < 6) {
			System.out.println("Du musst noch nicht in die Schule");
		} else {
			System.out.println("Entweder besuchst du schon die Schule oder bist schon fertig damit");
		}
	}

	public static void multipleIfs(int alter) {
		if (alter < 6) {
			System.out.println("Du musst noch nicht in die Schule");
		} else if (alter < 18) {
			System.out.println("Du Schulkind du!");
		} else {
			System.out.println("Die schöne Schulzeit ist vorbei!");
		}
	}
}
