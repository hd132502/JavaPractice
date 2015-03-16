package org.dimigo.basic;

public class PrimitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "아이유";
		boolean isman = true;
		int age = 23;
		double height = 161.8;
		float weight = 44.3f;
		char type = 'A';
		System.out.println("이름 : "+name);
		if(isman==true)
		{
			System.out.println("성별 : 여자");
		}
		else
		{
			System.out.println("성별 : 남자");
		}
		System.out.println("나이 : "+age+"세");
		System.out.println("키 : "+height+"cm");
		System.out.println("몸무게 : "+weight+"kg");
		System.out.println("혈액형 : "+type+"형");
		
;
	}

}
