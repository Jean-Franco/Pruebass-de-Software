package Bib;
import java.util.*;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException{
		System.out.println("Bienvenid@ a la biblioteca\n");
		Boolean loop = true;
		int option;
		ArrayList<Libro> LibrosList = new ArrayList<Libro>();
		while(loop) {
			if (LibrosList.size() == 0) {
				System.out.println("Que desea hacer?, por favor seleccione una opcion: \n");
				System.out.println("(1) Registrar libro. \n");
				System.out.println("(0) Salir. \n");
				System.out.println("Cantidad de libros: " + LibrosList.size() + "\n");
				try{
					Scanner input = new Scanner(System.in);
					option = input.nextInt();
				}catch (Exception e){
					option = 6;
				}
				if (option == 1) { //Registrar libro
					System.out.println("Opcion registrada: \"Registrar libro\". \n");
					System.out.println("Por favor, rellene los siguientes campos para registrar el libro \n");
					String titulo = "";
					String autor = "";
					String fecha = "";
					int paginas = 0;
					String editorial = "";
					String genero = "";
					String isbn = "";
					String ubicacion = "";
					String estado = "";
					String desc = "";
					
					while(titulo.isBlank() || titulo.isEmpty()) {
						System.out.println("Ingrese el titulo \n");
						Scanner Ititulo = new Scanner(System.in);
						titulo = Ititulo.nextLine();
						if(titulo.isBlank() || titulo.isEmpty()) {
							System.out.println("El campo no puede estar vacio. \n");
						}
					}
					while(autor.isBlank() || autor.isEmpty()) {
						System.out.println("Ingrese el o los autores \n");
						Scanner Iautor = new Scanner(System.in);
						autor = Iautor.nextLine();
						if(autor.isBlank() || autor.isEmpty()) {
							System.out.println("El campo no puede estar vacio. \n");
						}
					}
					while(fecha.isBlank() || fecha.isEmpty()) {
						System.out.println("Ingrese la fecha \n");
						Scanner Ifecha = new Scanner(System.in);
						fecha = Ifecha.nextLine();
						if(fecha.isBlank() || fecha.isEmpty()) {
							System.out.println("El campo no puede estar vacio. \n");
						}
					}
					while(paginas <= 0) {
						try {
							System.out.println("Ingrese numero de paginas \n");
							Scanner Ipaginas = new Scanner(System.in);
							paginas = Ipaginas.nextInt();
						}catch (Exception e) {
							paginas = 0;
							System.out.println("Por favor, ingrese una entrada valida.  \n");
						}
						
						if(paginas <= 0) {
							System.out.println("El campo no puede ser 0 o negativo. \n");
						}
					}
					while(editorial.isBlank() || editorial.isEmpty()) {
						System.out.println("Ingrese la editorial \n");
						Scanner Ieditorial = new Scanner(System.in);
						editorial = Ieditorial.nextLine();
						if(editorial.isBlank() || editorial.isEmpty()) {
							System.out.println("El campo no puede estar vacio. \n");
						}
					}
					while(genero.isBlank() || genero.isEmpty()) {
						System.out.println("Ingrese genero \n");
						Scanner Igenero = new Scanner(System.in);
						genero = Igenero.nextLine();
						if(genero.isBlank() || genero.isEmpty()) {
							System.out.println("El campo no puede estar vacio. \n");
						}
					}
					while(isbn.isBlank() || isbn.isEmpty()) {
						System.out.println("Ingrese codigo ISBN \n");
						Scanner Iisbn = new Scanner(System.in);
						isbn = Iisbn.nextLine();
						if(isbn.isBlank() || isbn.isEmpty()) {
							System.out.println("El campo no puede estar vacio. \n");
						}
					}
					while(ubicacion.isBlank() || ubicacion.isEmpty()) {
						System.out.println("Ingrese ubicacion \n");
						Scanner Iubicacion = new Scanner(System.in);
						ubicacion = Iubicacion.nextLine();
						if(ubicacion.isBlank() || ubicacion.isEmpty()) {
							System.out.println("El campo no puede estar vacio. \n");
						}
					}
					while(estado.isBlank() || estado.isEmpty() || !"prestado".equals(estado) && !"disponible".equals(estado) && !"extraviado".equals(estado)) {
						System.out.println("Ingrese estado (prestado, disponible, extraviado) \n");
						Scanner Iestado = new Scanner(System.in);
						estado = Iestado.nextLine();
						if(estado.isBlank() || estado.isEmpty()) {
							System.out.println("El campo no puede estar vacio. \n");
						}
						if(!"prestado".equals(estado) && !"disponible".equals(estado) && !"extraviado".equals(estado)) {
							System.out.println("Por favor, indique alguno de los 3 estados en minuscula (prestado, disponible o extraviado) \n");
						}
					}
					while(desc.isBlank() || desc.isEmpty()) {
						System.out.println("Ingrese descripcion \n");
						Scanner Idesc = new Scanner(System.in);
						desc = Idesc.nextLine();
						if(desc.isBlank() || desc.isEmpty()) {
							System.out.println("El campo no puede estar vacio. \n");
						}
					}
					Libro libro = new Libro(titulo, autor, fecha, paginas, editorial, genero, isbn, ubicacion, estado, desc);
					Registrar(LibrosList, libro);
				}
				else if(option == 0) {
					System.out.println("Adios!");
					break;
				}
				else {
					System.out.println("Por favor, ingrese una opcion valida. \n");
				}
			}
			else {
				System.out.println("Que desea hacer?, por favor seleccione una opcion: \n");
				System.out.println("(1) Registrar libro. \n");
				System.out.println("(2) Buscar libro. \n");
				System.out.println("(3) Editar libro o cambiar su estado. \n");
				System.out.println("(4) Eliminar registro de libro. \n");
				System.out.println("(0) Salir. \n");
				System.out.println("Cantidad de libros: " + LibrosList.size() + "\n");
				try{
					Scanner input = new Scanner(System.in);
					option = input.nextInt();
				}catch (Exception e){
					option = 6;
				}
				if (option == 1) { //Registrar libro
					System.out.println("Opcion registrada: \"Registrar libro\". \n");
					System.out.println("Por favor, rellene los siguientes campos para registrar el libro \n");
					String titulo = "";
					String autor = "";
					String fecha = "";
					int paginas = 0;
					String editorial = "";
					String genero = "";
					String isbn = "";
					String ubicacion = "";
					String estado = "";
					String desc = "";
					while(titulo.isBlank() || titulo.isEmpty()) {
						System.out.println("Ingrese el titulo \n");
						Scanner Ititulo = new Scanner(System.in);
						titulo = Ititulo.nextLine();
						if(titulo.isBlank() || titulo.isEmpty()) {
							System.out.println("El campo no puede estar vacio. \n");
						}
					}
					while(autor.isBlank() || autor.isEmpty()) {
						System.out.println("Ingrese el o los autores \n");
						Scanner Iautor = new Scanner(System.in);
						autor = Iautor.nextLine();
						if(autor.isBlank() || autor.isEmpty()) {
							System.out.println("El campo no puede estar vacio. \n");
						}
					}
					while(fecha.isBlank() || fecha.isEmpty()) {
						System.out.println("Ingrese la fecha \n");
						Scanner Ifecha = new Scanner(System.in);
						fecha = Ifecha.nextLine();
						if(fecha.isBlank() || fecha.isEmpty()) {
							System.out.println("El campo no puede estar vacio. \n");
						}
					}
					while(paginas <= 0) { 
						try {
							System.out.println("Ingrese numero de paginas \n");
							Scanner Ipaginas = new Scanner(System.in);
							paginas = Ipaginas.nextInt();
						}catch (Exception e) {
							paginas = 0;
							System.out.println("Por favor, ingrese una entrada valida.  \n");
						}
						if(paginas <= 0) {
							System.out.println("El campo no puede ser 0 o negativo. \n");
						}
					}
					while(editorial.isBlank() || editorial.isEmpty()) {
						System.out.println("Ingrese la editorial \n");
						Scanner Ieditorial = new Scanner(System.in);
						editorial = Ieditorial.nextLine();
						if(editorial.isBlank() || editorial.isEmpty()) {
							System.out.println("El campo no puede estar vacio. \n");
						}
					}
					while(genero.isBlank() || genero.isEmpty()) {
						System.out.println("Ingrese genero \n");
						Scanner Igenero = new Scanner(System.in);
						genero = Igenero.nextLine();
						if(genero.isBlank() || genero.isEmpty()) {
							System.out.println("El campo no puede estar vacio. \n");
						}
					}
					while(isbn.isBlank() || isbn.isEmpty()) {
						System.out.println("Ingrese codigo ISBN \n");
						Scanner Iisbn = new Scanner(System.in);
						isbn = Iisbn.nextLine();
						if(isbn.isBlank() || isbn.isEmpty()) {
							System.out.println("El campo no puede estar vacio. \n");
						}
					}
					while(ubicacion.isBlank() || ubicacion.isEmpty()) {
						System.out.println("Ingrese ubicacion \n");
						Scanner Iubicacion = new Scanner(System.in);
						ubicacion = Iubicacion.nextLine();
						if(ubicacion.isBlank() || ubicacion.isEmpty()) {
							System.out.println("El campo no puede estar vacio. \n");
						}
					}
					while(estado.isBlank() || estado.isEmpty() || !"prestado".equals(estado) && !"disponible".equals(estado) && !"extraviado".equals(estado)) {
						System.out.println("Ingrese estado (prestado, disponible, extraviado) \n");
						Scanner Iestado = new Scanner(System.in);
						estado = Iestado.nextLine();
						if(estado.isBlank() || estado.isEmpty()) {
							System.out.println("El campo no puede estar vacio. \n");
						}
						if(!"prestado".equals(estado) && !"disponible".equals(estado) && !"extraviado".equals(estado)) {
							System.out.println("Por favor, indique alguno de los 3 estados en minuscula (prestado, disponible o extraviado) \n");
						}
					}
					while(desc.isBlank() || desc.isEmpty()) {
						System.out.println("Ingrese descripcion \n");
						Scanner Idesc = new Scanner(System.in);
						desc = Idesc.nextLine();
						if(desc.isBlank() || desc.isEmpty()) {
							System.out.println("El campo no puede estar vacio. \n");
						}
					}
					Libro libro = new Libro(titulo, autor, fecha, paginas, editorial, genero, isbn, ubicacion, estado, desc);
					Registrar(LibrosList, libro);
				}
				else if (option == 2) { //Buscar libro usar text.contains(palabra) y si es verdadero en la lista, retornar
					System.out.println("Indique el filtro de busqueda, (1) Titulo, (2) Autor, (3) ISBN. \n");
					int buscar;
					try {
						Scanner option2 = new Scanner(System.in);
						buscar = option2.nextInt();
					}catch (Exception e) {
						buscar = 4;
						System.out.println("Por favor, ingrese una entrada valida.  \n");
					}
					if (buscar == 1) { //por titulo
						String buscarT;
						System.out.println("Buscar por titulo, ingrese titulo:  \n");
						Scanner titulo = new Scanner(System.in);
						buscarT = titulo.nextLine();
						BuscarT(LibrosList, buscarT);
					}
					else if (buscar == 2) { //por autor
						String buscarA;
						System.out.println("Buscar por autor, ingrese autor:  \n");
						String A;
						Scanner autor = new Scanner(System.in);
						buscarA = autor.nextLine();
						BuscarA(LibrosList, buscarA);
					}
					else if (buscar == 3) { //por isbn
						String buscarI;
						System.out.println("Buscar por ISBN, ingrese ISBN:  \n");
						String I;
						Scanner isbn = new Scanner(System.in);
						buscarI = isbn.nextLine();
						BuscarI(LibrosList, buscarI);
					}
				}
				else if(option == 3) { //Editar libro o Cambiar de estado
					System.out.println("Que desea hacer?, (1) Editar un libro, (2) Cambiar estado de un libro \n");
					int edit;
					try {
						Scanner option3 = new Scanner(System.in);
						edit = option3.nextInt();
					}catch (Exception e) {
						edit = 3;
						System.out.println("Por favor, ingrese una entrada valida.  \n");
					}
					if(edit == 1) { //editar libro, se puede editar todo
						List<String> libros = new ArrayList<String>();
						int index;
						for(int i = 0; i < LibrosList.size(); i++) {
							libros.add(LibrosList.get(i).GetIsbn());
						}
						System.out.println(Arrays.toString(libros.toArray()) + "\n");
						System.out.println("Seleccione la posicion del libro ordenado por ISBN quiera editar (empezando de 0) \n");
						try {
							Scanner indexi = new Scanner(System.in);
							index = indexi.nextInt();
						}catch (Exception e) {
							index = -1;
							System.out.println("Por favor ingrese una entrada valida \n");
						}
						if(index != -1) {
							String titulo = "";
							String autor = "";
							String fecha = "";
							int paginas = 0;
							String editorial = "";
							String genero = "";
							String isbn = "";
							String ubicacion = "";
							String desc = "";
							while(titulo.isBlank() || titulo.isEmpty()) {
								System.out.println("Ingrese nuevo titulo \n");
								Scanner Ititulo = new Scanner(System.in);
								titulo = Ititulo.nextLine();
								if(titulo.isBlank() || titulo.isEmpty()) {
									System.out.println("El campo no puede estar vacio. \n");
								}
							}
							while(autor.isBlank() || autor.isEmpty()) {
								System.out.println("Ingrese el o los autores \n");
								Scanner Iautor = new Scanner(System.in);
								autor = Iautor.nextLine();
								if(autor.isBlank() || autor.isEmpty()) {
									System.out.println("El campo no puede estar vacio. \n");
								}
							}
							while(fecha.isBlank() || fecha.isEmpty()) {
								System.out.println("Ingrese la fecha \n");
								Scanner Ifecha = new Scanner(System.in);
								fecha = Ifecha.nextLine();
								if(fecha.isBlank() || fecha.isEmpty()) {
									System.out.println("El campo no puede estar vacio. \n");
								}
							}
							while(paginas <= 0) { 
								try {
									System.out.println("Ingrese numero de paginas \n");
									Scanner Ipaginas = new Scanner(System.in);
									paginas = Ipaginas.nextInt();
								}catch (Exception e) {
									paginas = 0;
									System.out.println("Por favor, ingrese una entrada valida.  \n");
								}
								if(paginas <= 0) {
									System.out.println("El campo no puede ser 0 o negativo. \n");
								}
							}
							while(editorial.isBlank() || editorial.isEmpty()) {
								System.out.println("Ingrese la editorial \n");
								Scanner Ieditorial = new Scanner(System.in);
								editorial = Ieditorial.nextLine();
								if(editorial.isBlank() || editorial.isEmpty()) {
									System.out.println("El campo no puede estar vacio. \n");
								}
							}
							while(genero.isBlank() || genero.isEmpty()) {
								System.out.println("Ingrese genero \n");
								Scanner Igenero = new Scanner(System.in);
								genero = Igenero.nextLine();
								if(genero.isBlank() || genero.isEmpty()) {
									System.out.println("El campo no puede estar vacio. \n");
								}
							}
							while(isbn.isBlank() || isbn.isEmpty()) {
								System.out.println("Ingrese codigo ISBN \n");
								Scanner Iisbn = new Scanner(System.in);
								isbn = Iisbn.nextLine();
								if(isbn.isBlank() || isbn.isEmpty()) {
									System.out.println("El campo no puede estar vacio. \n");
								}
							}
							while(ubicacion.isBlank() || ubicacion.isEmpty()) {
								System.out.println("Ingrese ubicacion \n");
								Scanner Iubicacion = new Scanner(System.in);
								ubicacion = Iubicacion.nextLine();
								if(ubicacion.isBlank() || ubicacion.isEmpty()) {
									System.out.println("El campo no puede estar vacio. \n");
								}
							}
							while(desc.isBlank() || desc.isEmpty()) {
								System.out.println("Ingrese descripcion \n");
								Scanner Idesc = new Scanner(System.in);
								desc = Idesc.nextLine();
								if(desc.isBlank() || desc.isEmpty()) {
									System.out.println("El campo no puede estar vacio. \n");
								}
							}
							EditarLLibro(LibrosList, index,  titulo,  autor,  fecha,  paginas,  editorial,  genero,  isbn,  ubicacion,  desc);							
						}
					}
					else if(edit == 2) { //cambiar estado
						List<String> libros = new ArrayList<String>();
						int index;
						for(int i = 0; i < LibrosList.size(); i++) {
							libros.add(LibrosList.get(i).GetIsbn());
						}
						System.out.println(Arrays.toString(libros.toArray()) + "\n");
						System.out.println("Seleccione la posicion del libro ordenado por ISBN quiera editar (empezando de 0) \n");
						try {
							Scanner indexi = new Scanner(System.in);
							index = indexi.nextInt();
						}catch (Exception e) {
							index = -1;
							System.out.println("Por favor ingrese una entrada valida \n");
						}
						if(index != -1) {
							String estado = "";
							while(estado.isBlank() || estado.isEmpty() || !"prestado".equals(estado) && !"disponible".equals(estado) && !"extraviado".equals(estado)) {
								System.out.println("Ingrese estado (prestado, disponible, extraviado) \n");
								Scanner Iestado = new Scanner(System.in);
								estado = Iestado.nextLine();
								if(estado.isBlank() || estado.isEmpty()) {
									System.out.println("El campo no puede estar vacio. \n");
								}
								if(!"prestado".equals(estado) && !"disponible".equals(estado) && !"extraviado".equals(estado)) {
									System.out.println("Por favor, indique alguno de los 3 estados en minuscula (prestado, disponible o extraviado) \n");
								}
							}
							EditarEEstado(LibrosList, index,  estado);							
						}
					}
				} 
				else if(option == 4) { //Eliminar libro
					if(LibrosList.size() == 0) {
						System.out.println("No hay libros registrados en la biblioteca. \n");
					}
					else {
						List<String> libros = new ArrayList<String>();
						String isbn;
						System.out.println("Listado de libros segun su codigo ISBN \n");
						for(int i = 0; i < LibrosList.size(); i++) {
							libros.add(LibrosList.get(i).GetIsbn());
						}
						System.out.println(Arrays.toString(libros.toArray()) + "\n");
						System.out.println("Seleccione la posicion en la lista para borrar (empezando desde el 0) \n");
						int index;
						try {
							Scanner indexi = new Scanner(System.in);
							index = indexi.nextInt();
						}catch (Exception e) {
							index = -1;
							System.out.println("Por favor ingrese una entrada valida \n");
						}
						if(index != -1) {
							EliminarLibro(LibrosList, index);
							
						}
					}
				}
				else if(option == 0) {
					System.out.println("Adios!");
					break;
				}
				else {
					System.out.println("Por favor, ingrese una opcion valida. \n");
				}
			}
			
		}
	}
	
	public static void Registrar(ArrayList<Libro> LibrosList, Libro libro){
		LibrosList.add(libro);
	}
	
	public static List<String> BuscarT(ArrayList<Libro> LibrosList, String buscarT) {
		for(int i = 0; i < LibrosList.size(); i++) {
			List<String> libro = new ArrayList<String>();
			String T;
			T = LibrosList.get(i).GetTitulo();
			if(T.contains(buscarT) == true) {
				libro.add("Titulo: " + LibrosList.get(i).GetTitulo());
				libro.add("Autor: " + LibrosList.get(i).GetAutor());
				libro.add("Fecha: " + LibrosList.get(i).GetFecha());
				libro.add("Paginas: " + Integer.toString(LibrosList.get(i).GetPaginas()));
				libro.add("Editorial: " + LibrosList.get(i).GetEditorial());
				libro.add("Genero: " + LibrosList.get(i).GetGenero());
				libro.add("ISBN: " + LibrosList.get(i).GetIsbn());
				libro.add("Ubicacion: " + LibrosList.get(i).GetUbicacion());
				libro.add("Estado: " + LibrosList.get(i).GetEstado());
				libro.add("Descripcion: " + LibrosList.get(i).GetDesc());
				System.out.println(libro);
				return libro;
			}
			if(libro.size() == 0) {
				System.out.println("No se encontro ninguna coincidencia con la busqueda  \n");
				return libro;
			}
		}
		return null;
	}
	
	public static List<String> BuscarA(ArrayList<Libro> LibrosList, String buscarA) {
		for(int i = 0; i < LibrosList.size(); i++) {
			String A;
			List<String> libro = new ArrayList<String>();
			A = LibrosList.get(i).GetAutor();
			if(A.contains(buscarA) == true) {
				libro.add("Titulo: " + LibrosList.get(i).GetTitulo());
				libro.add("Autor: " + LibrosList.get(i).GetAutor());
				libro.add("Fecha: " + LibrosList.get(i).GetFecha());
				libro.add("Paginas: " + Integer.toString(LibrosList.get(i).GetPaginas()));
				libro.add("Editorial: " + LibrosList.get(i).GetEditorial());
				libro.add("Genero: " + LibrosList.get(i).GetGenero());
				libro.add("ISBN: " + LibrosList.get(i).GetIsbn());
				libro.add("Ubicacion: " + LibrosList.get(i).GetUbicacion());
				libro.add("Estado: " + LibrosList.get(i).GetEstado());
				libro.add("Descripcion: " + LibrosList.get(i).GetDesc());
				System.out.println(libro);
				return libro;
			}
			if(libro.size() == 0) {
				System.out.println("No se encontro ninguna coincidencia con la busqueda  \n");
				return libro;
			}
		}
		return null;
	}
	
	public static List<String> BuscarI(ArrayList<Libro> LibrosList, String buscarI) {
		String I;
		for(int i = 0; i < LibrosList.size(); i++) {
			List<String> libro = new ArrayList<String>();
			I = LibrosList.get(i).GetIsbn();
			if(I.contains(buscarI) == true) {
				libro.add("Titulo: " + LibrosList.get(i).GetTitulo());
				libro.add("Autor: " + LibrosList.get(i).GetAutor());
				libro.add("Fecha: " + LibrosList.get(i).GetFecha());
				libro.add("Paginas: " + Integer.toString(LibrosList.get(i).GetPaginas()));
				libro.add("Editorial: " + LibrosList.get(i).GetEditorial());
				libro.add("Genero: " + LibrosList.get(i).GetGenero());
				libro.add("ISBN: " + LibrosList.get(i).GetIsbn());
				libro.add("Ubicacion: " + LibrosList.get(i).GetUbicacion());
				libro.add("Estado: " + LibrosList.get(i).GetEstado());
				libro.add("Descripcion: " + LibrosList.get(i).GetDesc());
				System.out.println(libro);
				return libro;
			}
			if(libro.size() == 0) {
				System.out.println("No se encontro ninguna coincidencia con la busqueda  \n");
				return libro;
			}
		}
		return null;
	}
	
	public static void EditarLLibro(ArrayList<Libro> LibrosList, int index, String titulo, String autor, String fecha, int paginas, String editorial, String genero, String isbn, String ubicacion, String desc) {
		LibrosList.get(index).SetTitulo(titulo);
		LibrosList.get(index).SetAutor(autor);
		LibrosList.get(index).SetFecha(fecha);
		LibrosList.get(index).SetPaginas(paginas);
		LibrosList.get(index).SetEditorial(editorial);
		LibrosList.get(index).SetGenero(genero);
		LibrosList.get(index).SetIsbn(isbn);
		LibrosList.get(index).SetUbicacion(ubicacion);
		LibrosList.get(index).SetDesc(desc);
	}
	
	public static void EditarEEstado(ArrayList<Libro> LibrosList, int index, String estado) {
		LibrosList.get(index).SetEstado(estado);
	}
	
	public static void EditarLibro(ArrayList<Libro> LibrosList, int index) {
		if(index < LibrosList.size()) {
			String titulo = "";
			String autor = "";
			String fecha = "";
			int paginas = 0;
			String editorial = "";
			String genero = "";
			String isbn = "";
			String ubicacion = "";
			String desc = "";
			while(titulo.isBlank() || titulo.isEmpty()) {
				System.out.println("Ingrese nuevo titulo \n");
				Scanner Ititulo = new Scanner(System.in);
				titulo = Ititulo.nextLine();
				LibrosList.get(index).SetTitulo(titulo);
				if(titulo.isBlank() || titulo.isEmpty()) {
					System.out.println("El campo no puede estar vacio. \n");
				}
			}
			while(autor.isBlank() || autor.isEmpty()) {
				System.out.println("Ingrese nuevo autor \n");
				Scanner Iautor = new Scanner(System.in);
				autor = Iautor.nextLine();
				LibrosList.get(index).SetAutor(autor);
				if(autor.isBlank() || autor.isEmpty()) {
					System.out.println("El campo no puede estar vacio. \n");
				}
			}
			while(fecha.isBlank() || fecha.isEmpty()) {
				System.out.println("Ingrese nueva fecha \n");
				Scanner Ifecha = new Scanner(System.in);
				fecha = Ifecha.nextLine();
				LibrosList.get(index).SetFecha(fecha);
				if(fecha.isBlank() || fecha.isEmpty()) {
					System.out.println("El campo no puede estar vacio. \n");
				}
			}
			while(paginas <= 0) {
				System.out.println("Ingrese nuevo numero de paginas \n");
				Scanner Ipaginas = new Scanner(System.in);
				paginas = Ipaginas.nextInt();
				LibrosList.get(index).SetPaginas(paginas);
				if(paginas <= 0) {
					System.out.println("El campo no puede ser 0 o negativo. \n");
				}
			}
			while(editorial.isBlank() || editorial.isEmpty()) {
				System.out.println("Ingrese nueva editorial \n");
				Scanner Ieditorial = new Scanner(System.in);
				editorial = Ieditorial.nextLine();
				LibrosList.get(index).SetEditorial(editorial);
				if(editorial.isBlank() || editorial.isEmpty()) {
					System.out.println("El campo no puede estar vacio. \n");
				}
			}
			while(genero.isBlank() || genero.isEmpty()) {
				System.out.println("Ingrese nuevo genero \n");
				Scanner Igenero = new Scanner(System.in);
				genero = Igenero.nextLine();
				LibrosList.get(index).SetGenero(genero);
				if(genero.isBlank() || genero.isEmpty()) {
					System.out.println("El campo no puede estar vacio. \n");
				}
			}
			while(isbn.isBlank() || isbn.isEmpty()) {
				System.out.println("Ingrese nuevo codigo ISBN \n");
				Scanner Iisbn = new Scanner(System.in);
				isbn = Iisbn.nextLine();
				LibrosList.get(index).SetIsbn(isbn);
				if(isbn.isBlank() || isbn.isEmpty()) {
					System.out.println("El campo no puede estar vacio. \n");
				}
			}
			while(ubicacion.isBlank() || ubicacion.isEmpty()) {
				System.out.println("Ingrese nueva ubicacion \n");
				Scanner Iubicacion = new Scanner(System.in);
				ubicacion = Iubicacion.nextLine();
				LibrosList.get(index).SetUbicacion(ubicacion);
				if(ubicacion.isBlank() || ubicacion.isEmpty()) {
					System.out.println("El campo no puede estar vacio. \n");
				}
			}
			while(desc.isBlank() || desc.isEmpty()) {
				System.out.println("Ingrese nueva descripcion \n");
				Scanner Idesc = new Scanner(System.in);
				desc = Idesc.nextLine();
				LibrosList.get(index).SetDesc(desc);
				if(desc.isBlank() || desc.isEmpty()) {
					System.out.println("El campo no puede estar vacio. \n");
				}
			}
		}
		else {
			System.out.println("Por favor ingrese una entrada valida \n");
		}
		
	}
	
	public static void CambiarEstado(ArrayList<Libro> LibrosList) {
		List<String> libros = new ArrayList<String>();
		for(int i = 0; i < LibrosList.size(); i++) {
			libros.add(LibrosList.get(i).GetIsbn());
		}
		System.out.println(Arrays.toString(libros.toArray()) + "\n");
		System.out.println("Seleccione la posicion del libro que quiera cambiar el estado (por ISBN) \n");
		int index;
		String estado = "";
		try {
			Scanner indexi = new Scanner(System.in);
			index = indexi.nextInt();
		}catch (Exception e) {
			index = -1;
			System.out.println("Por favor ingrese una entrada valida \n");
		}
		if(index != -1) {
			if(index < LibrosList.size()) { //valor limite
				while(estado.isBlank() || estado.isEmpty()) {
					System.out.println("Ingrese nuevo estado (prestado, disponible, extraviado) \n");
					Scanner Iestado = new Scanner(System.in);
					estado = Iestado.nextLine();
					LibrosList.get(index).SetEstado(estado);
					if(estado.isBlank() || estado.isEmpty()) {
						System.out.println("El campo no puede estar vacio. \n");
					}
				}
			}
			else {
				System.out.println("Por favor ingrese una entrada valida \n");
			}
		}
	}
	
	public static void EliminarLibro(ArrayList<Libro> LibrosList, int index) {
		if(index < LibrosList.size()) { //valor limite
			System.out.println("Libro eliminado de la biblioteca \n"); //indicar cual fue borrado
			LibrosList.remove(index);
		}
		else {
			System.out.println("Por favor ingrese una entrada valida \n");
		}
		
	}

}
