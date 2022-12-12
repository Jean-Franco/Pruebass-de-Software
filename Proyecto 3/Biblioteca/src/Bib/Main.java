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
			System.out.println("(3) Editar libro. \n");
			System.out.println("(4) Eliminar registro de libro. \n");
			System.out.println("(5) Cambiar estado de libro. \n");
			System.out.println("(0) Salir. \n");
			try{
				Scanner input = new Scanner(System.in);
				option = input.nextInt();
			}catch (Exception e){
				option = 6;
			}
			if (option == 1) {
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
				String descripcion;
				System.out.println("Indique el titulo:  \n");
				Scanner Ititulo = new Scanner(System.in);
				titulo = Ititulo.nextLine();
				System.out.println("Indique el o los autores:  \n");
				Scanner Iautor = new Scanner(System.in);
				autor = Iautor.nextLine();
				System.out.println("Indique la fecha (formato DD/MM/AAAA):  \n");
				Scanner Ititulo = new Scanner(System.in);
				titulo = Ititulo.nextLine();
				System.out.println("Indique el titulo:  \n");
				Scanner Ititulo = new Scanner(System.in);
				titulo = Ititulo.nextLine();
				System.out.println("Indique el titulo:  \n");
				Scanner Ititulo = new Scanner(System.in);
				titulo = Ititulo.nextLine();
				System.out.println("Indique el titulo:  \n");
				Scanner Ititulo = new Scanner(System.in);
				titulo = Ititulo.nextLine();
				System.out.println("Indique el titulo:  \n");
				Scanner Ititulo = new Scanner(System.in);
				titulo = Ititulo.nextLine();
			}
		}
	}

}
