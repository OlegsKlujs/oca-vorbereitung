//ipu.oca.I.objects.instanzen.SimpleKlasse

public class main_Example {

	main_Example() {
	}

	public static void main(String args[]) {
		float flieskommazahl = 1_01.2f;
		long groseZahl = 124356_43633_355L;
		int ganzZahl = 0B10;
		int dezimal = 16;
		int hexadecimal = 0X10;
		int octal = 012;
		boolean result = (dezimal == hexadecimal);
		System.out.println("ist 16=16: " + result);
	}

}
