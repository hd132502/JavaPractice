package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int distance;
		String car;
		int charge;
		distance = 10;
		car = "고속버스";
		System.out.println("<<고속도로 통행료 계산>>");
		System.out.println("거리 : " +distance+"km");
		System.out.println("차종 : " +car);
		switch(car){
		case "경차":
			charge = 300+((distance-1)/10)*200;
			break;
		case "고속버스":
			charge = 850+((distance-1)/10)*300;
			break;
		default :
			charge = 600+((distance-1)/10)*200;
			break;
		}
		System.out.println("통행료 : "+charge+"원");
	}

}
