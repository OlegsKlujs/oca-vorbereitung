package ich.bin.ein.beispielpaket;

public class Tutor {
	String name;
	String klassifikation;
	int alter;
	Standesamt standesamt;

	public void aleterWerdern() {
		this.alter = this.alter + 1;
	}

	public void namenAendern(String neuerName) {
		this.name = neuerName;
		Standesamt.infor("name geändert");
	}

	public String nameAuslesen() {
		return this.name;
	}

}

class Standesamt {
	public static void infor(String bla) {
		System.out.println("Die dokumente wurden ins Standesamt geschickt");
	}
}
