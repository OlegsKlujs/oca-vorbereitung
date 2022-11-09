
public class TestIT {
	public static void main(String[] args) {
		int haken = 100;
		for (int i = 0; i < 10 && haken > 0; haken--) {
			i = i++;
		}
		System.out.println(haken);
	}
}
