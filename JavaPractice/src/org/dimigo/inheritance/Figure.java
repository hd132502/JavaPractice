package org.dimigo.inheritance;

public class Figure {
	private int centerX;
	private int centerY;
	public Figure(int centerX, int centerY) {
		super();
		this.centerX = centerX;
		this.centerY = centerY;
	}
	protected double calcArea(){
		return 0.0;
	}
	
}
