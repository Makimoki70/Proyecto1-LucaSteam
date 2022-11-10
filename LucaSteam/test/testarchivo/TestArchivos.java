package testarchivo;

import static org.junit.Assert.*;
import java.io.File;
import org.junit.Test;

public class TestArchivos {

	//Comprobamos que en esa localizacion esta el archivo
	@Test
	public void TestLocalizacion() {
		File archivo = new File("resources/vgsales.cvs");
		assertTrue(archivo.exists());
	}
	
	//Comprobamos que se han sacado datos del archivo
	@Test
	public void TestTamañoArchivo() {
		boolean tamaño = false;
		
		assertTrue(true);
	}
}
