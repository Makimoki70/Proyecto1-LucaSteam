package service;

import data.HemerotecaDatosImpl;
import gui.ImprimirJuegos;

public class HemerotecaServiceImpl implements HemerotecaService {
	
	private HemerotecaDatosImpl hemerotecaDatos = new HemerotecaDatosImpl();
	
	
	public void addJuego() {
		
	}
	
	public void mostrarJuegos() {
		ImprimirJuegos.impreJuegos(hemerotecaDatos.getBiblioteca());
	}
}
