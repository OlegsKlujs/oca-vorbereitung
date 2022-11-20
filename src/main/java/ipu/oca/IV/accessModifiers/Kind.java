package ipu.oca.IV.accessModifiers;

import ipu.oca.IV.accessModifiers.Protected.Schulkind;

public class Kind extends Schulkind {

	protected void lernt() {
		super.lernen();
	}

	public void streiten() {
		Kind tester = new Kind();
		tester.lernen();
	}

}
