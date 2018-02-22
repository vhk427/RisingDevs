package com.risingdevs.servicenow;

public class InheirtnaceTest {

	public static void main(String[] args) {
		A a = new C(10);
	}

	abstract static class A {
		A() {
			
		}
		A(int x) {
			System.out.println("A");
		}
	}

	static class B extends A {
		B(){
		}
		
		B(int y) {
			System.out.println("B");
		}
	}

	static class C extends B {

		C(int z) {
			System.out.println("C");
		}
	}
}
