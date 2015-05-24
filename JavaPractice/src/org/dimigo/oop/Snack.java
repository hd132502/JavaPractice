package org.dimigo.oop;

public class Snack {
	private String name;
	private String company;
	private int price;
	private int number;
	
	public Snack(String name, String company, int price, int number) {
		super();
		this.name = name;
		this.company = company;
		this.price = price;
		this.number = number;
	}
	public void printSnack(){
		System.out.println("이름 : "+this.name);
		System.out.println("제조사 : "+this.company);
		System.out.println("가격 : "+String.format("%d", this.price) + "원");
		System.out.println("개수 : "+this.number);
	}
	public int calcPrice(){
		int total = 0;
		total += number*price;
		return total;
	}
	public String getName() {
		return name;
	}
	public String getCompany() {
		return company;
	}
	public int getPrice() {
		return price;
	}
	public int getNumber() {
		return number;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}	
