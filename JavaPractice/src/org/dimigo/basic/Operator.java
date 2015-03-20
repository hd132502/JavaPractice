package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("<< 도형 넓이 비교 >>");
		int a=9;
		int b=10;
		double h = 5.8;
		double b1 = 0.5*(a+b)*h;
		System.out.println("사다리꼴 넓이 : "+b1);
		a = 9;
		h = 5.4;
		double b2 = a*h;
		System.out.println("평행사변형 넓이 : "+b2);
		System.out.println();
		if(b1>b2) System.out.println("사다리꼴이 평행사변형 보다 "+(b1-b2)+" 더 큽니다");
		else if(b1<b2) System.out.println("평행사변형이 사다리꼴 보다 "+(b2-b1)+" 더 큽니다");
		else System.out.println("두 도형의 넓이가 같습니다");
	}

}
