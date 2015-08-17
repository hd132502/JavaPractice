package org.dimigo.inheritance;

public class Figure {
	protected int centerX;
	protected int centerY;
	public Figure(int centerX, int centerY) {
		super();
		this.centerX = centerX;
		this.centerY = centerY;
	}
	protected double calcArea(){
		return 0.0;
	}
	protected void printCenter(){
		System.out.println("Áß½ÉÁÂÇ¥ : ("+centerX+","+centerY+")");
	}
	protected void moveFigure(int x, int y){
		centerX += x;
		centerY += y;
	}
	
}
