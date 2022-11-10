package data;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;

import model.Juego;
import utilities.LeerTeclado;
import utilities.TratamientoDatos;

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
		try (CSVReader csvReader = new CSVReader(new FileReader("resources/vgsales.csv"), ',', '"')) {

			csvReader.readNext();
			String [] data = csvReader.readNext();			
			
			while (null!=data) {
				
				Juego juego = new Juego ();
				
				juego.setNombre(data[1]);
				
				juego.setPlataforma(TratamientoDatos.tratarEnumPlataforma(data[2]));
				
				if(!data[3].equals("N/A")){
					juego.setFecha(Integer.parseInt(data[3]));
				}
				
				juego.setGenero(TratamientoDatos.tratarEnumGenero(data[4]));
				
				juego.setEditor(data[5]);
				
				addJuego(juego);
				
				data = csvReader.readNext();
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
	
	public List<Juego> filtradoPlataforma(){
		List<Juego> listaAux = new ArrayList<>();
		
		for (Juego juego : biblioteca) {
			if (juego.getGenero().getGenero().equals("Platform")) {
				listaAux.add(juego);
			}
		}
		return listaAux;	
	}
}
