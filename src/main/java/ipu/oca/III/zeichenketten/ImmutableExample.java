package ipu.oca.III.zeichenketten;

public final class ImmutableExample {
	private String title = "kann man nicht �ndern";

	public String getTitle() {
		return this.title;
	}
}

class Mutable {
	private String title = "�nderbar";

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String update) {
		this.title = update;
	}
}
