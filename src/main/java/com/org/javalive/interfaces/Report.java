package com.org.javalive.interfaces;

public class Report implements IReport{

	public static void main(String[] args) {
		
		IReport report = new Report();
		
		report.run();
	}

	@Override
	public void run() {
		
		System.out.println("Launch Report...");
		
	}

}
