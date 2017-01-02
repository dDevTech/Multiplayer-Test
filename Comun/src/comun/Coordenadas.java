package comun;

import java.io.Serializable;

public class Coordenadas implements Serializable {
	private int movimiento;
	private int x;
	private int y;

	public Coordenadas(int x, int y) {

		this.x = x;
		this.y = y;

	}

	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}

}
