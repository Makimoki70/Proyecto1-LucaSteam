package model;

public class Juego {
	private String nombre;
	private String plataforma;
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

	//¿Lectura de datos via Hashmap y escritura individual de registros con un metodo tratarEnum() para genero?
	public Juego(String nombre, String plataforma, int fecha, Genero genero, String editor) {
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

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
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
		return "Juego [nombre=" + nombre + ", plataforma=" + plataforma + ", fecha=" + fecha + ", genero=" + genero.getGenero().toString()
				+ ", editor=" + editor + "]";
	}

	
}
