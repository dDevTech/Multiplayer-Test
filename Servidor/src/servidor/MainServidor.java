package servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import comun.Constantes;
import comun.Coordenadas;

public class MainServidor {
	static ArrayList<Cliente>clientes = new ArrayList<>();
	static ServerSocket ss;
	public static void main(String[] args) {
		try {
			 ss = new ServerSocket(Constantes.PORT);
			System.out.println("Servidor ejecutando");
		} catch (IOException e) {
			System.out.println("No se ha podido ejecutar el servidor");
			e.printStackTrace();
		}
	Thread t = new Thread(new Runnable() {
		
		@Override
		public void run() {
			while(true){
				try {
					Socket s = ss.accept();
					clientes.add(new Cliente(s));
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
			
		}
	});
	t.start();
	}

	public static void enviarMensajeATodos(Coordenadas coor){
		for(Cliente c:clientes){
			c.enviarMensaje(coor);
	
		}
	}
}
