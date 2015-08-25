package org.dimigo.inheritance;

public class SmartPhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone p1 = new IPhone("iPhone6", "애플" , 700000);
		SmartPhone p2 =new Galaxy("갤럭시 S6", "삼성" , 650000);
		IPhone i = (IPhone)p1;
		System.out.println(p1.toString());
		p1.turnOn();
		i.pay();
		i.useAirDrop();
		p1.turnOff();
		System.out.println();
		Galaxy g = (Galaxy)p2;
		System.out.println(p2.toString());
		p2.turnOn();
		g.pay();
		g.useWirelessCharging();
		p2.turnOff();
	}

}
