package data;

import java.util.List;

import model.Juego;

public interface IntHemerotecaDatos {
	
	public void addJuego(Juego juego);
	
	public void addJuego();
	
	public List<Juego> cargarFichero();

}
