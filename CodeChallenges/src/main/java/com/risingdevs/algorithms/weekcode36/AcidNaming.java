package com.risingdevs.algorithms.weekcode36;

import java.util.Scanner;
import java.util.regex.Pattern;

public class AcidNaming {

	static Pattern nonMetal = Pattern.compile("^hydro.*ic");
	static Pattern polyatomic = Pattern.compile("^.*ic");

	static String acidNaming(String name) {
		if (nonMetal.matcher(name).matches()) {
			return "non-metal acid";
		}
		else if (polyatomic.matcher(name).matches()) {
			return "polyatomic acid";
		}
		return "not an acid";
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int a0 = 0; a0 < n; a0++) {
			String acid_name = in.next();
			String result = acidNaming(acid_name);
			System.out.println(result);
		}
		in.close();
	}
}
