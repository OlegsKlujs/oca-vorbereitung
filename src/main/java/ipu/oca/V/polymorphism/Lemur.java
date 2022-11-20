package ipu.oca.V.polymorphism;

public class Lemur extends Primat implements HasTail {
	String name = "huhu";

	@Override
	public boolean hasTail() {
		return false;
	}

	@Override
	public String hasName() {
		return name;
	}

	String alter() {
		return "12";
	}

	public static void main(String[] args) {
		// Primat p = (Primat)"hallo";
		Primat p = new Lemur();
		HasTail ht = new Lemur();
		System.out.println(p.hasName());
		testPolymorphosm(new Lemur());
	}

	public static void testPolymorphosm(Primat digi) {
		System.out.println(digi.hasName());
	}
}
