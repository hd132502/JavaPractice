package org.dimigo.inheritance;

public class SmartPhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone p1 = new IPhone("iPhone6", "¾ÖÇÃ" , 700000);
		SmartPhone p2 =new Galaxy("°¶·°½Ã S6", "»ï¼º", 650000);
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
