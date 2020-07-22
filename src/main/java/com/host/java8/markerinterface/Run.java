package com.host.java8.markerinterface;

public class Run {

	public static void main(String[] args) {

		/*
		 * Ex: Sample Marker interfaces are - Serializable in java.io package to save
		 * state of object, and Remote Interface to create remote object
		 * 
		 */

		Demo d1 = new Demo();

		if (d1 instanceof Permissions) {
			System.out.println("d1 is instance of Permissions");
			d1.show();
		} else {
			System.out.println("not instance of Permissions");
		}

	}

}
