package com.org.practice;

public class SingleTon {
	
	//Early Instantiation
		/*
		 * private static member: it loads into the memory once because of static, it contains the instance of the class
		 * private constructor: it can prevent create instance of singleton calss from outside of the class
		 * static factory method: this provides global acess to singleton class and return instance to the caller
		 */

	private static SingleTon obj;

	private SingleTon() {
	};

	public static SingleTon getInstance() {

		if (obj == null) {
			synchronized (SingleTon.class) {
				if (obj == null) {
					obj = new SingleTon();
				}

			}
		}
		return obj;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public SingleTon returnObj() {

		return obj;
	}

}
