
public class TestIT {
	public static void main(String[] args) {

		main_Example.y = 213;

		main_Example test = new main_Example();
		test.y = 3333;

		int haken = 100;
		for (int i = 0; i < 10 && haken > 0; haken--) {
			i = i++;
		}
		System.out.println(haken);
	}
}
