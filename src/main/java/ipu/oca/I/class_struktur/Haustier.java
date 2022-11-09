package ipu.oca.I.class_struktur;

public class Haustier {
	public String name;
	public boolean mitHaar;
	public int age;

	public int Haustier() {
		this.name = "Putsi";
		return 1;
	}

	public Haustier(String name) {
		this.name = name;
	}

	public Haustier(int name) {
		System.out.println("test" + name);
	}
}
