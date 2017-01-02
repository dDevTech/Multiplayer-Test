package servidor;

public class Inteligencia {
	private int Vx, Vy = 0;

	public static int[] mover(int movimiento, Cliente c) {
		int[] velocidades = new int[2];
		// [0]-> velocidad
		// [1]-> X o Y
		// {Vx=1,Vy=2}
		switch (movimiento) {
		// ARRIBA-PRESSED
		case 1:
			velocidades[0] = -Math.abs(c.getVelocidadY());
			velocidades[1] = 2;
			return velocidades;
		// ABAJO-PRESSED
		case 2:
			velocidades[0] = +Math.abs(c.getVelocidadY());
			velocidades[1] = 2;
			return velocidades;
		// DERECHA-PRESSED
		case 3:
			velocidades[0] = Math.abs(c.getVelocidadX());
			velocidades[1] = 1;
			return velocidades;
		// IZQUIERDA-PRESSED
		case 4:
			velocidades[0] = -Math.abs(c.getVelocidadX());
			velocidades[1] = 1;
			return velocidades;
		// ARRIBA-RELEASED
		case 5:
			velocidades[0] = 0;
			velocidades[1] = 2;
			return velocidades;
		// ABAJO-RELEASED
		case 6:
			velocidades[0] = 0;
			velocidades[1] = 2;
			return velocidades;
		// DERECHA-RELEASED
		case 7:
			velocidades[0] = 0;
			velocidades[1] = 1;
			return velocidades;
		// IZQUIERDA-RELEASED
		case 8:
			velocidades[0] = 0;
			velocidades[1] = 1;
			return velocidades;

		default:
			return null;

		}

	}
}
