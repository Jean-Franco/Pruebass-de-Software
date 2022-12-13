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
			System.out.println("Que desea hacer?, por favor seleccione una opcion: \n");
			System.out.println("(1) Registrar libro. \n");
			System.out.println("(2) Buscar libro. \n");
			System.out.println("(3) Editar libro o cambiar su estado. \n");
			System.out.println("(4) Eliminar registro de libro. \n");
			System.out.println("(0) Salir. \n");
			System.out.println(Arrays.toString(LibrosList.toArray()) + "\n");
			System.out.println(LibrosList.size());
			try{
				Scanner input = new Scanner(System.in);
				option = input.nextInt();
			}catch (Exception e){
				option = 6;
			}
			if (option == 1) { //Registrar libro
				System.out.println("Opcion registrada: \"Registrar libro\". \n");
				System.out.println("Por favor, rellene los siguientes campos para registrar el libro \n");
				String titulo;
				String autor;
				String fecha;
				int paginas;
				String editorial;
				String genero;
				String isbn;
				String ubicacion;
				String estado;
				String desc;
				System.out.println("Indique el titulo:  \n");
				Scanner Ititulo = new Scanner(System.in);
				titulo = Ititulo.nextLine();
				System.out.println("Indique el o los autores:  \n");
				Scanner Iautor = new Scanner(System.in);
				autor = Iautor.nextLine();
				System.out.println("Indique la fecha (formato DD/MM/AAAA):  \n"); //verificar formato
				Scanner Ifecha = new Scanner(System.in);
				fecha = Ifecha.nextLine();
				System.out.println("Indique el numero de paginas:  \n"); //verificar que sea un numero
				Scanner Ipaginas = new Scanner(System.in);
				paginas = Ipaginas.nextInt();
				System.out.println("Indique la editorial:  \n");
				Scanner Ieditorial = new Scanner(System.in);
				editorial = Ieditorial.nextLine();
				System.out.println("Indique el genero:  \n");
				Scanner Igenero = new Scanner(System.in);
				genero = Igenero.nextLine();
				System.out.println("Indique el numero ISBN:  \n"); //verificar unico
				Scanner Iisbn = new Scanner(System.in);
				isbn = Iisbn.nextLine();
				System.out.println("Indique la ubicacion (Piso de biblioteca, numero de pasillo, estante, posicion (x,y)):  \n"); //verif pos
				Scanner Iubicacion = new Scanner(System.in);
				ubicacion = Iubicacion.nextLine();
				System.out.println("Indique el estado del libro (Prestado, disponible, extraviado):  \n"); //verificar solo 3 estados
				Scanner Iestado = new Scanner(System.in);
				estado = Iestado.nextLine();
				System.out.println("Indique la desc:  \n");
				Scanner Idesc = new Scanner(System.in);
				desc = Idesc.nextLine();
				Libro libro = new Libro(titulo, autor, fecha, paginas, editorial, genero, isbn, ubicacion, estado, desc);
				LibrosList.add(libro);
			}
			else if (option == 2) { //Buscar libro usar text.contains(palabra) y si es verdadero en la lista, retornar
				System.out.println("Indique el filtro de busqueda, (1) Titulo, (2) Autor, (3) ISBN. \n");
				int buscar;
				String buscarT;
				String buscarA;
				String buscarI;
				try {
					Scanner option2 = new Scanner(System.in);
					buscar = option2.nextInt();
				}catch (Exception e) {
					buscar = 4;
					System.out.println("Por favor, ingrese una entrada valida.  \n");
				}
				if (buscar == 1) { //por titulo
					System.out.println("Buscar por titulo, ingrese titulo:  \n");
					String T;
					Scanner titulo = new Scanner(System.in);
					buscarT = titulo.nextLine();
					for(int i = 0; i < LibrosList.size(); i++) {
						List<String> libro = new ArrayList<String>();
						//System.out.println("XD \n");
						//System.out.println(LibrosList.get(i));
						T = LibrosList.get(i).GetTitulo();
						if(T.contains(buscarT) == true) {
							libro.add(LibrosList.get(i).GetTitulo());
							libro.add(LibrosList.get(i).GetAutor());
							libro.add(LibrosList.get(i).GetFecha());
							libro.add(Integer.toString(LibrosList.get(i).GetPaginas()));
							libro.add(LibrosList.get(i).GetEditorial());
							libro.add(LibrosList.get(i).GetGenero());
							libro.add(LibrosList.get(i).GetIsbn());
							libro.add(LibrosList.get(i).GetUbicacion());
							libro.add(LibrosList.get(i).GetEstado());
							libro.add(LibrosList.get(i).GetDesc());
							System.out.println(libro);
						}
					}
				}
				else if (buscar == 2) { //por autor
					System.out.println("Buscar por autor, ingrese autor:  \n");
					String A;
					Scanner autor = new Scanner(System.in);
					buscarA = autor.nextLine();
					for(int i = 0; i < LibrosList.size(); i++) {
						List<String> libro = new ArrayList<String>();
						//System.out.println("XD \n");
						//System.out.println(LibrosList.get(i));
						A = LibrosList.get(i).GetAutor();
						if(A.contains(buscarA) == true) {
							libro.add(LibrosList.get(i).GetTitulo());
							libro.add(LibrosList.get(i).GetAutor());
							libro.add(LibrosList.get(i).GetFecha());
							libro.add(Integer.toString(LibrosList.get(i).GetPaginas()));
							libro.add(LibrosList.get(i).GetEditorial());
							libro.add(LibrosList.get(i).GetGenero());
							libro.add(LibrosList.get(i).GetIsbn());
							libro.add(LibrosList.get(i).GetUbicacion());
							libro.add(LibrosList.get(i).GetEstado());
							libro.add(LibrosList.get(i).GetDesc());
							System.out.println(libro);
						}
					}
				}
				else if (buscar == 3) { //por isbn
					System.out.println("Buscar por ISBN, ingrese ISBN:  \n");
					String I;
					Scanner isbn = new Scanner(System.in);
					buscarI = isbn.nextLine();
					for(int i = 0; i < LibrosList.size(); i++) {
						List<String> libro = new ArrayList<String>();
						//System.out.println("XD \n");
						//System.out.println(LibrosList.get(i));
						I = LibrosList.get(i).GetIsbn();
						if(I.contains(buscarI) == true) {
							libro.add(LibrosList.get(i).GetTitulo());
							libro.add(LibrosList.get(i).GetAutor());
							libro.add(LibrosList.get(i).GetFecha());
							libro.add(Integer.toString(LibrosList.get(i).GetPaginas()));
							libro.add(LibrosList.get(i).GetEditorial());
							libro.add(LibrosList.get(i).GetGenero());
							libro.add(LibrosList.get(i).GetIsbn());
							libro.add(LibrosList.get(i).GetUbicacion());
							libro.add(LibrosList.get(i).GetEstado());
							libro.add(LibrosList.get(i).GetDesc());
							System.out.println(libro);
						}
					}
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
				if(edit == 1) { //editar libro
					List<String> libros = new ArrayList<String>();
					int index;
					for(int i = 0; i < LibrosList.size(); i++) {
						libros.add(LibrosList.get(i).GetIsbn());
					}
					System.out.println(Arrays.toString(libros.toArray()) + "\n");
					System.out.println("Seleccione el libro que quiera editar (por ISBN) \n");
					try {
						Scanner indexi = new Scanner(System.in);
						index = indexi.nextInt();
					}catch (Exception e) {
						index = -1;
						System.out.println("Por favor ingrese una entrada valida \n");
					}
				}
				else if(edit == 2) { //cambiar estado
					List<String> libros = new ArrayList<String>();
					for(int i = 0; i < LibrosList.size(); i++) {
						libros.add(LibrosList.get(i).GetIsbn());
					}
					System.out.println(Arrays.toString(libros.toArray()) + "\n");
					System.out.println("Seleccione el libro que quiera cambiar el estado (por ISBN) \n");
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
						if(index < LibrosList.size()) { //valor limite
							System.out.println("Libro eliminado de la biblioteca \n"); //indicar cual fue borrado
							LibrosList.remove(index);
						}
						else {
							System.out.println("Por favor ingrese una entrada valida \n");
						}
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
