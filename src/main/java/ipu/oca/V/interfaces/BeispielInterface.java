package ipu.oca.V.interfaces;

interface BeispielInterface {
	int testKonstante = 11;

	public abstract void testMethod();

	void zweiteTestMethode();

	static void fun() {
		System.out.println("Schneebalschlacht");
	}

	public default void testDefault() {
		System.out.println("Default");
	}

}
