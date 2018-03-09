package com.risingdevs.java.serialization.magicmethods.test1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadObjectNoDataTest {

	public static void main(String[] args) throws Exception {
		Employee employee = new Employee();
		employee.empid = "1";
		employee.salary = -1;
//		employee.name= "Kumar";
//		write(employee); // Serialization
		Employee p = read(); // De-serialization
		System.out.println(p.empid);
		System.out.println(p.salary);
		System.out.println(p.name);
	}

	public static void write(Employee employee) throws IOException {
		FileOutputStream outputStream = new FileOutputStream("src/main/java/com/risingdevs/java/serialization/magicmethods/test1/test.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
		objectOutputStream.writeObject(employee);
		objectOutputStream.close();
	}

	public static Employee read() throws IOException, ClassNotFoundException {
		FileInputStream inputStream = new FileInputStream("src/main/java/com/risingdevs/java/serialization/magicmethods/test1/test.txt");
		ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
		Employee b = (Employee) objectInputStream.readObject();
		objectInputStream.close();
		return b;
	}
}
