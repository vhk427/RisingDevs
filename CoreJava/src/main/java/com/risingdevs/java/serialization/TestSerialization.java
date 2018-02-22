package com.risingdevs.java.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		B b = new B(20);
		b.b = 40;
		write(b);
		B c = read();
		System.out.println("a :" + c.a);
		System.out.println("b :" + c.b);
	}

	public static void write(B b) throws IOException {
		FileOutputStream outputStream = new FileOutputStream("src/main/java/com/risingdevs/java/serialization/text.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
		objectOutputStream.writeObject(b);
		objectOutputStream.close();
	}

	public static B read() throws IOException, ClassNotFoundException {
		FileInputStream inputStream = new FileInputStream("src/main/java/com/risingdevs/java/serialization/text.txt");
		ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
		B b = (B) objectInputStream.readObject();
		objectInputStream.close();
		return b;
	}
}

class A {
	A(int a) {
		this.a = a;
	}
	
	A() {
		
	}

	int a = 10;
}

class B extends A implements Serializable {
	
	B(int a) {
		super(a);
	}
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	static int b = 20;
}
