package org.dimigo.oop;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String answer;
		String str1 = "aoa";
		String str2 = "이연희";
		String str3 = "자바";
		System.out.println("가장 좋아하는 가수는?");
		answer = scanner.nextLine();
		if(answer.equals(str1)){
			System.out.println("정답입니다!! ^^");
		}
		else{
			System.out.println("틀렸습니다!! ㅠ");
		}
		System.out.println();
		System.out.println("가장 좋아하는 배우는?");
		answer = scanner.nextLine();
		if(answer.equals(str2)){
			System.out.println("정답입니다!! ^^");
		}
		else{
			System.out.println("틀렸습니다!! ㅠ");
		}
		System.out.println();
		System.out.println("가장 좋아하는 과목은?");
		answer = scanner.nextLine();
		if(answer.equals(str3)){
			System.out.println("정답입니다!! ^^");
		}
		else{
			System.out.println("틀렸습니다!! ㅠ");
		scanner.close();
		}
	}

}
