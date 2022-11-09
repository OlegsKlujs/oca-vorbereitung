package ipu.oca.II.schleifen;

public class WhildeDoWhile {

	public static void main(String[] args) {
		int x = 20;
		whileInDoWhile(x);
		doInWhile(x);

	}

	private static void doInWhile(int x) {
		int iterationenCount = 0;
		while (x > 10) {
			x--;
			iterationenCount++;
			System.out.println("Iteration: " + iterationenCount);
		}

	}

	private static void whileInDoWhile(int x) {
		int iterationenCount = 0;
		do {
			if (x > 10) {
				x--;
				iterationenCount++;
				System.out.println("Iteration: " + iterationenCount);
			}
		} while (x > 10);

	}
}
