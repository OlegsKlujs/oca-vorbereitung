import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

//ipu.oca.I.objects.instanzen.SimpleKlasse

public class main_Example {
	static int y;
	private int age = 12;
	double ___________num_________Pets__________;

	static {
		y = 1;

	}

	public static void changeAge(int newAge, main_Example test) {
		test.age = newAge;
	}

	public static void main(String args) {
	}

	public void chiwawa() {
		LocalDate test = LocalDate.now();
		LocalTime testTime = LocalTime.now();
		LocalDateTime testDateTime = LocalDateTime.of(test, testTime);
		System.out.println(test.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(testTime.format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println(testDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

		DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(test.format(shortDateTime));
		System.out.println(shortDateTime.format(test));
		System.out.println(test.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
		System.out.println(testDateTime.format(DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm")));
		System.out.println(testDateTime.format(DateTimeFormatter.ofPattern("dd MM yyyy hh:mm")));
		LocalTime test3 = LocalTime.parse("03:30", DateTimeFormatter.ofPattern("kk:mm"));

		System.out.println(test3);
	}

	public static void main(String... $test) {

		main_Example test = new main_Example();
		test.chiwawa();
	}

}
