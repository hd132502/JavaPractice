package org.dimigo.oop;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.printf("국어 점수 입력 =>");
		int kor = scanner.nextInt();
		System.out.printf("수학 점수 입력 =>");
		int mat = scanner.nextInt();
		System.out.printf("영어 점수 입력 =>");
		int eng = scanner.nextInt();
		int sum = kor+mat+eng;
		double avg = (kor+mat+eng)/3.0;
		System.out.println();
		StringBuilder sb = new StringBuilder()
		  	.append("<<점수출력>>\n")
		    .append("국어점수 : ")
		    .append(kor)
		    .append("점\n")
		    .append("수학점수 : ")
		    .append(mat)
		    .append("점\n")
		    .append("영어점수 : ")
		    .append(eng)
		    .append("점\n")
		    .append("총점 : ")
		    .append(sum)
		    .append("점\n")
	    	.append("평균 : ")
	    	.append(String.format("%.1f", avg))
	    	.append("점\n");
		System.out.println(sb);
		scanner.close();
	}

}
