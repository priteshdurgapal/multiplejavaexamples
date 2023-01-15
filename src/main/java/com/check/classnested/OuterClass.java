package com.check.classnested;

public class OuterClass {
	static String model;
	/*
	 * public OuterClass(String model) { this.model = model; }
	 */
	static int outer_x = 10;
	int outer_y = 20;

	static class USB {
		int usb2 = 2;
		int usb3 = 1;
		// OuterClass ooc = new OuterClass();

		// model="hello";
		int getTotalPorts() {
			return usb2 + usb3 + outer_x;// + outer_y;

		}

		void display() {
			System.out.println("outer_x" + outer_x);
			System.out.println(model);
			// System.out.println("outer_y" + outer_y);
		}

	}

	// System.out.println("usb2" + usb2);

}
