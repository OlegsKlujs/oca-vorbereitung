package ipu.oca.VI.exceptions;

import java.io.IOException;

public class Ausprobieren {

	public static void main(String[] args) {

		try {
			System.out.println("try");
			System.exit(2);
		} catch (Exception e) {
			System.out.println("catch");
		} finally {
			System.out.println("Finally");
		}

	}

	public void unreachable() {
//		try {
//			System.out.println("try");
//		}catch(IOException e) {
//			System.out.println("catch");
//		}
	}

	public void cheat() throws IOException {
		System.out.println("throws IOException cheat");
	}

}
