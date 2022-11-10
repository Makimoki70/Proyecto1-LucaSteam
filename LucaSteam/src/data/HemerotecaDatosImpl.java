package data;



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import model.Juego;
import utilities.LeerTeclado;

public class HemerotecaDatosImpl implements IntHemerotecaDatos {

	private List<Juego> biblioteca = new ArrayList<>();		
	
	public List<Juego> getBiblioteca() {
		return biblioteca;
	}

	public void setBiblioteca(List<Juego> biblioteca) {
		this.biblioteca = biblioteca;
	}


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
						
		
	}


	@Override
	public List<Juego> cargarFichero() {
		// TODO Auto-generated method stub	
		
		try (BufferedReader br = new BufferedReader(new FileReader("/resources/vgsales.csv"))) {
					
			StringBuilder registro = new StringBuilder(br.readLine());
								
			
			while (null!=registro.toString())
			{			
								
				String [] data = registro.toString().split(",");
				
				String name = data[1];
				
				int year = Integer.parseInt(data[3]);
				
				String editor = data[5];			
								
				Juego juego = new Juego (name, year, editor);
				
				addJuego(juego);				
				
				registro = new StringBuilder(br.readLine());				
				
			}			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block	
			System.out.println("No se encuentra el fichero");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return biblioteca;
	}
	
	
	
	

}
