package com.risingdevs.java.enums;


/**
 * @author Hemanth Kumar Velpula
 *	we can't extend the classes from Enum, only implements the interfaces
 */
public class TestInheritanceEnum {
public static void main(String[] args) {
	System.out.println(A.A);
	System.out.println(B.A);
}
}

interface A {
	int A = 0;
	
}

enum B implements A {
	//A,
	B, C, D
}


//class A {
//	
//}
//
//enum B extends A {
//	A, B, C, D
//}
