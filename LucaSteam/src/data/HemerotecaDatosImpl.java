package data;



import java.util.ArrayList;
import java.util.List;

import model.Juego;
import utilities.LeerTeclado;

public class HemerotecaDatosImpl implements IntHemerotecaDatos {

	private List<Juego> biblioteca = new ArrayList<>();
	
	@Override
	public void addJuego(Juego juego) {
		// TODO Auto-generated method stub
		
		biblioteca.add(juego);
		
	}

	
	@Override
	public void addJuego() {
		// TODO Auto-generated method stub
		String nombre = LeerTeclado.leerLinea("Dame el nombre del juego:");
		
		int anyo = LeerTeclado.leerInt("Dame el año de lanzamiento:");
		
		String editor = LeerTeclado.leerPalabra("Dame su editor: ");
		
		Juego juego = new Juego(nombre, anyo, editor);
		
		addJuego(juego);
		
		boolean vacio = false;				
		
		
	}
	
	
	

}
