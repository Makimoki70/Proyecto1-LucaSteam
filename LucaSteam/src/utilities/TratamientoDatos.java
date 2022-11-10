package utilities;

import model.Genero;
import model.Plataforma;

public class TratamientoDatos {
	
	public static Plataforma tratarEnumPlataforma(String stringPrincipal) {
		//Guardamos en un array todos los valores del Enum
		Plataforma[] arrayPlataforma = Plataforma.values();
		
		//Recorremos el array, buscando el values ("") de cada token del enum
		for (Plataforma p : arrayPlataforma) {
			if (p.getPlataforma().equals(stringPrincipal)) {
				return p;
			}
		}
		//En caso de no encontrar en la lista el valor, devolvemos el por defecto
		return Plataforma.Defecto;
	}
	
	public static Genero tratarEnumGenero(String stringPrincipal) {
		Genero[] arrayGenero = Genero.values();
		for (Genero g : arrayGenero) {
			if (g.getGenero().equals(stringPrincipal)) {
				return g;
			}
		}
		return Genero.Defecto;
	}
	
	
	public static String tratarEnumPlantilla(String stringPrincipal) {
		//Plantilla para tratar enums que empiecen por letras (PARA LA INTRODUCCION DE REGISTROS INDIVIDUALES POR TERMINAL)
		//Pasamos a minuscula todo el String
		char[] stringATratar = stringPrincipal.toLowerCase().toCharArray();	
		
		boolean espacioBlanco = true; //controlador de que el caracter actual esta tras un espacio (o es el primer caracter de la cadena)
		
		//Poner en mayuscula la primera letra de cada palabra
		for (int i = 0; i < stringATratar.length; i++) {
			//comprobacion si ha habido un espacio en blanco y el hueco actual es una letra
			if (espacioBlanco && Character.isLetter(stringATratar[i])) {
				stringATratar[i] = Character.toUpperCase(stringATratar[i]);
				espacioBlanco = false;
			} else if (Character.isWhitespace(stringATratar[i])) { // Si es en blanco, activamos el semaforo
				espacioBlanco = true;
		    }
		}
		stringPrincipal = String.valueOf(stringATratar);
		stringPrincipal = stringPrincipal.replaceAll("[^\\dA-Za-z]", ""); //Reemplazamos todo lo que no sea caracteres (incluyendo espacios)
				
		return stringPrincipal;
	}
}