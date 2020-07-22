package com.host.java.synchronization;

class PrintNum {

	 synchronized void print(int n) {

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


class ThreadRunner1 extends Thread{
	
	PrintNum p;
	
	ThreadRunner1(PrintNum p){
		
		this.p = p;
	}

	public void run() {
		p.print(5);
	}
}


class ThreadRunner2 extends Thread{
	
	PrintNum p;
	
	ThreadRunner2(PrintNum p){
		this.p = p;
	}
	
	public void run() {
		
		p.print(5);
	}
}



public class SolveSyncPbm {

	public static void main(String[] args) {
		
		PrintNum p = new PrintNum();
		
		ThreadRunner1 t1 = new ThreadRunner1(p);
		ThreadRunner2 t2 = new ThreadRunner2(p);
		
		t1.start();
		t2.start();
	}

}
