package model;

public class Juego {
	private String nombre;
	private Plataforma plataforma;
	private int fecha;
	private Genero genero;
	private String editor;
	
	public Juego() {
		
	}

	public Juego(String nombre, int fecha, String editor) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
		this.editor = editor;
	}

	public Juego(String nombre, Plataforma plataforma, int fecha, Genero genero, String editor) {
		super();
		this.nombre = nombre;
		this.plataforma = plataforma;
		this.fecha = fecha;
		this.genero = genero;
		this.editor = editor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Plataforma getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(Plataforma plataforma) {
		this.plataforma = plataforma;
	}

	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	@Override
	public String toString() {
		return "Juego [nombre=" + nombre + ", fecha=" + fecha + "editor=" + editor + "]";
	}
}
