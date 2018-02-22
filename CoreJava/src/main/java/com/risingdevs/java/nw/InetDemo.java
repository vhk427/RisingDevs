package com.risingdevs.java.nw;

import java.net.InetAddress;

public class InetDemo {

	public static void main(String[] args) {
		try {
			InetAddress ip = InetAddress.getLocalHost();//getByName("BTG704615");
			System.out.println("Host Name: " + ip.getHostName());
			System.out.println("Cannonical Host Name: " + ip.getCanonicalHostName());
			System.out.println("IP Address: " + ip.getHostAddress());
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
