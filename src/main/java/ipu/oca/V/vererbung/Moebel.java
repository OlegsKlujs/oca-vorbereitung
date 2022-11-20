package ipu.oca.V.vererbung;

public class Moebel {

	private String material;

	private Moebel() {
	}

	Moebel(String material) {
		this.material = material;
	}

	private final void finalMethod() {
		System.out.println("Gotcha");
	}

	private void doeblesetMaterial() {
		material = "stein";
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
		doeblesetMaterial();
	}

}
