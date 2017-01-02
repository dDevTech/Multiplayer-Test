package main.graphics;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

import org.omg.CORBA.Environment;

import comun.Evento;
import main.cliente.MainCliente;

public class Ventana extends JFrame {
	Panel p;
	public Ventana() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		p= new Panel();
		this.setContentPane(p);
		this.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_UP) {
					MainCliente.enviarMensajeAlServidor(new Evento(1));
				}
				if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					MainCliente.enviarMensajeAlServidor(new Evento(2));
				}
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					MainCliente.enviarMensajeAlServidor(new Evento(3));
				}
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					MainCliente.enviarMensajeAlServidor(new Evento(4));
				}
				super.keyPressed(e);
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_UP) {
					MainCliente.enviarMensajeAlServidor(new Evento(5));
				}
				if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					MainCliente.enviarMensajeAlServidor(new Evento(6));
				}
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					MainCliente.enviarMensajeAlServidor(new Evento(7));
				}
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					MainCliente.enviarMensajeAlServidor(new Evento(8));
				}
				super.keyReleased(e);
			}

			@Override
			public void keyTyped(KeyEvent e) {

				super.keyTyped(e);
			}

		});
		this.setVisible(true);
	}
	public Panel getP() {
		return p;
	}
	public void setP(Panel p) {
		this.p = p;
	}
	
}
