package service;

import data.HemerotecaDatosImpl;

public class HemerotecaServiceImpl implements HemerotecaService {
	
	private HemerotecaDatosImpl hemerotecaDatos = new HemerotecaDatosImpl();
	
	
	public void addJuego() {
		
	}
	
	public void mostrarJuegos() {
		hemerotecaDatos.getBiblioteca();
	}
}
