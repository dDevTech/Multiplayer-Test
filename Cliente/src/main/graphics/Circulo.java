package main.graphics;

import java.awt.Color;
import java.awt.Graphics;

public class Circulo {
	private int radio;
	private int x=200;
	private int y=200;
	public Circulo(int radio){
		this.radio = radio;
		
	}
	public void dibujarCirculo(Graphics g){
		g.setColor(Color.DARK_GRAY);
		g.fillOval(x, y, radio*2, radio*2);
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}
