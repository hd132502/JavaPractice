package org.dimigo.thread;

public class Race2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main thread start");
		Thread t1 = new Thread(new Runner("홍길동"));
		Thread t2 = new Thread(new Runner("홍길순"));
		
//		t1.setPriority(Thread.MAX_PRIORITY);
//		t2.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		System.out.println("main thread end");
	}

}
