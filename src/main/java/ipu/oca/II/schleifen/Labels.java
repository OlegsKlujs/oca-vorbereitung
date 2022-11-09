package ipu.oca.II.schleifen;

public class Labels {

	public static void main(String[] args) {
		labelBeispiel1(2);
	}

	private static void labelBeispiel1(int einZweiDrai) {
		HierFangenWirAn: if (einZweiDrai > 0) {
			System.out.println("wir haben Spaﬂ!");
			einZweiDrai++;
			if (einZweiDrai < 3) {
				break HierFangenWirAn;
			}
			System.out.println("und gehen bis zum Ende!");
		}
	}

}
