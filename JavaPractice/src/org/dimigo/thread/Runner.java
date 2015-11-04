package org.dimigo.thread;

public class Runner extends Thread{
	private String name;
	public Runner(String name) {
		super();
		this.name = name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(name+" 출발");
		try {
			for(int i=10; i>=0; i--){
				System.out.println(name+" "+10*i+" 미터");
				Thread.sleep(1000);
			}
			System.out.println(name+" 골인");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
