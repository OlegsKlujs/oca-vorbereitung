package ipu.oca.I.objects;

public class Ausprobieren {

	public static void main(String[] args) {
		Sport swimmenVariable = new Sport("swimmen");
		Sport fussballVariable = new Sport("fussball");
		// swimmenVariable = fussballVariable;

		System.out.println("verglech: " + (swimmenVariable == fussballVariable));

	}

}
