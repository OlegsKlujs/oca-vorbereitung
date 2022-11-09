package ipu.oca.II.schleifen;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ForEachSchleife {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> klassenkameraden = Arrays.asList("Sasha", "Pasha", "Misha", "Franz");
		Set<String> klassenkameradenInen = new HashSet<>(Arrays.asList("Birgit", "Franziska", "Saskia", "Olga"));
		String[] alle = { "Sasha", "Pasha", "Misha", "Franz", "Birgit", "Franziska", "Saskia", "Olga" };

		mitIterable(klassenkameraden);
		mitArray(alle);
	}

	private static void mitIterable(Iterable<String> klassenkameraden) {
		printBaseSetName("mitIterable");

		for (String klassenKamerad : klassenkameraden) {
			System.out.println(klassenKamerad);
		}
	}

	private static void mitArray(String[] klassenkameraden) {
		printBaseSetName("mitArray");

		for (String klassenKamerad : klassenkameraden) {
			System.out.println(klassenKamerad);
		}
	}

	private static void printBaseSetName(String baseSetName) {
		System.out.println("-----------");
		System.out.println(baseSetName);
		System.out.println("-----------");
	}
}
