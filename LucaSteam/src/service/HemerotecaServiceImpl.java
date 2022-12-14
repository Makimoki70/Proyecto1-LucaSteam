package service;

import data.HemerotecaDatosImpl;
import gui.ImprimirJuegos;

public class HemerotecaServiceImpl implements HemerotecaService {
	
	private HemerotecaDatosImpl hemerotecaDatos = new HemerotecaDatosImpl();
	
	
	public void addJuego() {
		hemerotecaDatos.addJuego();
	}
	
	public void mostrarJuegos() {
		ImprimirJuegos.impreJuegos(hemerotecaDatos.getBiblioteca());
	}
	
	public void cargarJuegos() {
		hemerotecaDatos.setBiblioteca(hemerotecaDatos.cargarFichero());
	}
	
	public void filtrarJuegosPlataformas() {
		ImprimirJuegos.impreJuegos(hemerotecaDatos.filtradoPlataforma());
	}
}
