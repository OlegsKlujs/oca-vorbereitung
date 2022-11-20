package ipu.oca.V.vererbung;

public class Tisch extends Moebel {

	Tisch() {
		super("glas");
	}

	public void finalMethod() {
		System.out.println("here you are");
	}

	public static void main(String[] args) {
		Tisch test = new Tisch();
		test.setMaterial("Holz");
		System.out.println(test.getMaterial());

	}

}
