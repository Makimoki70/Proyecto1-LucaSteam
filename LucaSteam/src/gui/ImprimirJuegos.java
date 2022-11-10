package gui;

import java.util.List;

import model.Juego;

public class ImprimirJuegos {
	
	public static boolean impreJuegos(List<Juego> juegos)
	{
		
		boolean lectura = true;
		
		for (Juego juego : juegos){
			
			System.out.println(juego.toString());
			
		}
		
		if (juegos.size() == 0) {
			
			lectura = false;
			
		}
		
		return lectura;
		
	}
	
}
