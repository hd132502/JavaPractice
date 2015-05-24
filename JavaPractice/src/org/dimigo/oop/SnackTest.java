package org.dimigo.oop;

public class SnackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		Snack[] Snacklist = new Snack[] {new Snack("새우깡", "농심", 1100, 2),
										 new Snack("콘칩", "크라운", 1200, 1),
										 new Snack("허니버터칩", "해태", 1500, 4)};
		int sum = 0;
		for(Snack value : Snacklist){
			value.printSnack();
			sum += value.calcPrice();
			System.out.println();
		}
		    System.out.println("총 구매 금액 : "+String.format("%,d",sum)+"원");
	}

}
