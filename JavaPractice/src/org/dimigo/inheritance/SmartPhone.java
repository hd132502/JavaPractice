package org.dimigo.inheritance;

public class SmartPhone {
	private String model;
	private String company;
	private int price;
	public SmartPhone(String model, String company, int price) {
		super();
		this.model = model;
		this.company = company;
		this.price = price;
	}
	public void turnOn(){
		System.out.println(model+"�� ������ �մϴ�.");
	}
	public void turnOff(){
		System.out.println(model+"�� ������ ���ϴ�.");
	}
	public void pay(){
		
	}
	public void useSpecialFunction(SmartPhone phone){
		
	}
	@Override
	public String toString() {
		return "�𵨸� : "+ model + ", ������ : " + company
				+ ", ���� : " + String.format("%,d",price)+ "��";
	}

}
