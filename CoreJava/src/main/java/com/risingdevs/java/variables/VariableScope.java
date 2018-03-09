package com.risingdevs.java.variables;

public class VariableScope {

	public static void main(String args[]) {
		int x;
		x = 5;
		{
			int y = 6;
			System.out.print(x + " " + y);
		}
		// local variables can't be accessed out side
		//System.out.println(x + " " + y);
	}
}
