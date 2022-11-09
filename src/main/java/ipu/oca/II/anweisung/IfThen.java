package ipu.oca.II.anweisung;

public class IfThen {

	public static void main(String[] args) {
		int alter = 17;
		ifThenEinzeilig(alter);
		System.out.println("-------------------");
		ifThenMehrzeilig(alter);
	}

	public static void ifThenEinzeilig(int alter) {
		if (alter <= 18)
			System.out.println("keine Zigaretten verkaufen!");

	}

	public static void ifThenMehrzeilig(int alter) {
		if (alter <= 18) {
			System.out.println("keine Vodka verkaufen!");
			System.out.println("keine Bier verkaufen!");
		}

	}
}
