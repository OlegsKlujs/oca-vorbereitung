package ipu.oca.I.class_struktur;

public class Mitarbeiter {
	public String vorname;
	public String haarfarbe;
	public Haustiere haustier;
	public int alter;
	public static String abteilung;

	public Mitarbeiter(String name) {
		this.vorname = name;
	}

	public Mitarbeiter(String vornameInput, String haarfarbeInput) {
		this.vorname = vornameInput;
		this.haarfarbe = haarfarbeInput;
	}

	public void haareFaerbenIn(String neuefarbe) {
		this.haarfarbe = neuefarbe;
	}

	public void kaufeHaustier(String name) {
		this.haustier = new Haustiere();
		this.haustier.name = name;
	}

	public String getHaustiername() {
		return this.haustier.name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getHaarfarbe() {
		return haarfarbe;
	}

	public void setHaarfarbe(String haarfarbe) {
		this.haarfarbe = haarfarbe;
	}

	public Haustiere getHaustier() {
		return haustier;
	}

	public void setHaustier(Haustiere haustier) {
		this.haustier = haustier;
	}

}

class Haustiere {
	public String name;
}