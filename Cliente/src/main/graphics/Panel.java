package main.graphics;



import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Panel extends JPanel {
	Circulo c;
	public Panel(){
		setBackground(Color.BLACK);
		c = new Circulo(20);
	}
	public void paint(Graphics g){
		super.paint(g);
		c.dibujarCirculo(g);
		repaint();
	}
	public Circulo getC() {
		return c;
	}
	public void setC(Circulo c) {
		this.c = c;
	}
	
}
