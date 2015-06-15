package org.dimigo.oop;

public class FamilyMember {
	private static int memberCnt;
	private String memberName;
	public FamilyMember(String memberName){
		this.memberName = memberName;
		memberCnt++;
	}
	public static void printMemberCnt(){
		System.out.println("가족 총 인원수  : "+getMemberCnt()+"명");
	}
	public static int getMemberCnt() {
		return memberCnt;
	}
	public String getMemberName() {
		return memberName;
	}
	public static void setMemberCnt(int memberCnt) {
		FamilyMember.memberCnt = memberCnt;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
}
