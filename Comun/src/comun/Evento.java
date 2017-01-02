package comun;

import java.io.Serializable;

public class Evento implements Serializable{
	private int tipoDeEvento;

	public Evento(int tipoDeEvento){
		this.tipoDeEvento = tipoDeEvento;
		
	}

	public int getTipoDeEvento() {
		return tipoDeEvento;
	}
	
}
