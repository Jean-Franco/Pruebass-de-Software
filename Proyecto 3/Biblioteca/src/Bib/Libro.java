package Bib;

public class Libro {
	String titulo;
	String autor;
	String fecha;
	int paginas;
	String editorial;
	String genero;
	String isbn;
	String ubicacion;
	String estado;
	String descripcion;
	
	public Libro(String titulo, String autor, String fecha, int paginas, String editorial, String genero, String isbn, String ubicacion, String estado, String descripcion) {
		this.titulo = titulo;
		this.autor = autor;
		this.fecha = fecha;
		this.paginas = paginas;
		this.editorial = editorial;
		this.genero = genero;
		this.ubicacion = isbn;
		this.estado = estado;
		this.descripcion = descripcion;
	}
}
