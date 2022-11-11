package ipu.oca.I.objects;

public class Sport {

	public String sportart;
	private String equipment;
	private String platz;

	public Sport(String sportart) {

		this.sportart = sportart;
		String test2 = new String("fussball");

		if (this.sportart.contentEquals(test2)) {
			this.equipment = "Ball";
			this.platz = "Fussbalfeld";
		} else {
			this.equipment = "Müsliriegel";
			this.platz = "überal";
		}

	}

	public String getSportart() {
		return this.sportart;
	}

	public String getEquipment() {
		return equipment;
	}

	public void printeInformationenenZumSport() {
		System.out.println("das Equipment für " + this.sportart + " ist " + this.equipment);
		System.out.println("es kann auf " + this.platz + " gespielt werden");
	}

}
