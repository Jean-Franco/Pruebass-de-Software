package Bib;

public class Libro {
	private String titulo;
	private String autor;
	private String fecha;
	private int paginas;
	private String editorial;
	private String genero;
	private String isbn;
	private String ubicacion;
	private String estado;
	private String desc;
	
	public Libro(String titulo, String autor, String fecha, int paginas, String editorial, String genero, String isbn, String ubicacion, String estado, String desc) {
		this.titulo = titulo;
		this.autor = autor;
		this.fecha = fecha;
		this.paginas = paginas;
		this.editorial = editorial;
		this.genero = genero;
		this.ubicacion = isbn;
		this.estado = estado;
		this.desc = desc;
	}
	public void SetTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void SetAutor(String autor) {
		this.autor = autor;
	}
	public void SetFecha(String fecha) {
		this.fecha = fecha;
	}
	public void SetPaginas(int paginas) {
		this.paginas = paginas;
	}
	public void SetEditorial(String editorial) {
		this.editorial = editorial;
	}
	public void SetGenero(String genero) {
		this.genero = genero;
	}
	public void SetIsbn(String isbn) {
		this.isbn = isbn;
	}
	public void SetUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public void SetEstado(String estado) {
		this.estado = estado;
	}
	public void SetDesc(String desc) {
		this.desc = desc;
	}
	public String GetTitulo() {
		return titulo;
	}
	public String GetAutor() {
		return autor;
	}
	public String GetFecha() {
		return fecha;
	}
	public int GetPaginas() {
		return paginas;
	}
	public String GetEditorial() {
		return editorial;
	}
	public String GetGenero() {
		return genero;
	}
	public String GetIsbn() {
		return isbn;
	}
	public String GetUbicacion() {
		return ubicacion;
	}
	public String GetEstado() {
		return estado;
	}
	public String GetDesc() {
		return desc;
	}
}
