package com.host.java.synchronization;

class Print {

	void printable(int n) {

		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);

			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}


class Thread1 extends Thread{
	
	Print p;
	
	Thread1(Print p){
		
		this.p = p;
	}
	
	public void run() {
	
		p.printable(5);
	}
	
}

class Thread2 extends Thread{
	
	Print p;
	
	Thread2(Print p){
		this.p = p;
	}
	
	public void run() {
		p.printable(5);
	}
}


public class SyncPbmTest {

	public static void main(String[] args) {
		
		Print p = new Print();
		
		Thread1 t1 = new Thread1(p);
		Thread2 t2 = new Thread2(p);
		
		t1.start();
		t2.start();

	}

}
