package testarchivo;

import static org.junit.Assert.assertTrue;
import java.io.File;
import java.util.List;

import org.junit.Test;

import data.HemerotecaDatosImpl;
import gui.ImprimirJuegos;
import model.Juego;

public class TestArchivos {

	//Comprobamos que en esa localizacion esta el archivo
	@Test
	public void TestLocalizacion() {
		File archivo = new File("resources/vgsales.csv");
		assertTrue(archivo.exists());
	}
	
	//Comprobamos que se han sacado datos del archivo
	@Test
	public void TestTamañoArchivo() {
		int tamaño = new HemerotecaDatosImpl().cargarFichero().size();
		boolean isFull = false;
		if(tamaño > 0) {
			isFull = true;
		}
		assertTrue(isFull);
	}
	
	@Test
	public void TestJuego() {
		boolean exist = true;
		Juego juego = new HemerotecaDatosImpl().cargarFichero().get(2);
		if(juego.toString().length() == 0) { 
			exist = false;
		}
		assertTrue(exist);
	}
	
	@Test
	public void muestraLista()
	{
		
		boolean imprime = true;
		List <Juego> juegos = new HemerotecaDatosImpl().cargarFichero();
		
		imprime = ImprimirJuegos.impreJuegos(juegos);
		
		assertTrue(imprime);
		
	}
	
	
}
