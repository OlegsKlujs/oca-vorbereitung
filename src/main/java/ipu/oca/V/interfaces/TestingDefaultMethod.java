package ipu.oca.V.interfaces;

public interface TestingDefaultMethod extends BeispielInterface {
	public void testDefault();
}

interface OverrideDefault extends BeispielInterface {
	public default void testDefault() {
		System.out.println("Override Default");
	}
}