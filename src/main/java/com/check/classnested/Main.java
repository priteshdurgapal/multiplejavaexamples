package com.check.classnested;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass.USB usb = new OuterClass.USB();
		System.out.println("Total Ports = " + usb.getTotalPorts());
		usb.display();

	}
}
