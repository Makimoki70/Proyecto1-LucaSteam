package control;

import gui.MenuPrincipal;
import service.HemerotecaServiceImpl;
import utilities.LeerTeclado;

public class LucaSteamClient {
	
	private HemerotecaServiceImpl services = new HemerotecaServiceImpl();
	
	public void ejecucionCliente() {
		
		//Arraylist enlazado a Clase servicio para cargar la lista
		
		services.cargarJuegos();
		
		boolean salir = false;
		
		while (!salir) {
			MenuPrincipal.manejarMenu();		
			salir = seleccionDeOpcion(salir);
		}
		System.out.println("\n******************************************");
		System.out.println("Programa Finalizado");
	}

	private boolean seleccionDeOpcion(boolean salir) {
		
		switch (LeerTeclado.leerInt()) {
		case 1:
			//Introduccion de registros individuales
			services.addJuego();
			break;
		case 2: 
			services.mostrarJuegos();
			break;
		case 3: 
			//Mostrar el listado de juegos por plataforma
			services.filtrarJuegosPlataformas();
			break;
		case 4:
			salir = true;
			break;
		default:
			System.out.println("No has metido un valor correcto");
			break;
		}
		return salir;
	}
}
