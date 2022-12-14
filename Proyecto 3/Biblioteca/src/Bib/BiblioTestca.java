package Bib;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BiblioTestca {
	
	@Test
	public void RegistrarLibroTest(){ //Testea si se agrega el objeto a la lista, aun no cumple con todos los requisitos (como el de la ubicacion, etc)
		InputStream sysInBackup = System.in; // backup System.in to restore it later
		ArrayList<Libro> LibrosList = new ArrayList<Libro>();
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
			ByteArrayInputStream in = new ByteArrayInputStream("hola".getBytes());
			System.setIn(in);
			Scanner Ititulo = new Scanner(in);
			titulo = Ititulo.nextLine();
			if(titulo.isBlank() || titulo.isEmpty()) {
				System.out.println("El campo no puede estar vacio. \n");
			}
		}
		while(autor.isBlank() || autor.isEmpty()) {
			System.out.println("Ingrese el o los autores \n");
			ByteArrayInputStream in = new ByteArrayInputStream("hola".getBytes());
			System.setIn(in);
			Scanner Iautor = new Scanner(in);
			autor = Iautor.nextLine();
			if(autor.isBlank() || autor.isEmpty()) {
				System.out.println("El campo no puede estar vacio. \n");
			}
		}
		while(fecha.isBlank() || fecha.isEmpty()) {
			System.out.println("Ingrese la fecha \n");
			ByteArrayInputStream in = new ByteArrayInputStream("hola".getBytes());
			System.setIn(in);
			Scanner Ifecha = new Scanner(in);
			fecha = Ifecha.nextLine();
			if(fecha.isBlank() || fecha.isEmpty()) {
				System.out.println("El campo no puede estar vacio. \n");
			}
		}
		while(paginas <= 0) { 
			System.out.println("Ingrese numero de paginas \n");
			ByteArrayInputStream in = new ByteArrayInputStream("2".getBytes());
			System.setIn(in);
			Scanner Ipaginas = new Scanner(in);
			paginas = Ipaginas.nextInt();
			if(paginas <= 0) {
				System.out.println("El campo no puede ser 0 o negativo. \n");
			}
		}
		while(editorial.isBlank() || editorial.isEmpty()) {
			System.out.println("Ingrese la editorial \n");
			ByteArrayInputStream in = new ByteArrayInputStream("hola".getBytes());
			System.setIn(in);
			Scanner Ieditorial = new Scanner(in);
			editorial = Ieditorial.nextLine();
			if(editorial.isBlank() || editorial.isEmpty()) {
				System.out.println("El campo no puede estar vacio. \n");
			}
		}
		while(genero.isBlank() || genero.isEmpty()) {
			System.out.println("Ingrese genero \n");
			ByteArrayInputStream in = new ByteArrayInputStream("hola".getBytes());
			System.setIn(in);
			Scanner Igenero = new Scanner(in);
			genero = Igenero.nextLine();
			if(genero.isBlank() || genero.isEmpty()) {
				System.out.println("El campo no puede estar vacio. \n");
			}
		}
		while(isbn.isBlank() || isbn.isEmpty()) {
			System.out.println("Ingrese codigo ISBN \n");
			ByteArrayInputStream in = new ByteArrayInputStream("hola".getBytes());
			System.setIn(in);
			Scanner Iisbn = new Scanner(in);
			isbn = Iisbn.nextLine();
			if(isbn.isBlank() || isbn.isEmpty()) {
				System.out.println("El campo no puede estar vacio. \n");
			}
		}
		while(ubicacion.isBlank() || ubicacion.isEmpty()) {
			System.out.println("Ingrese ubicacion \n");
			ByteArrayInputStream in = new ByteArrayInputStream("hola".getBytes());
			System.setIn(in);
			Scanner Iubicacion = new Scanner(in);
			ubicacion = Iubicacion.nextLine();
			if(ubicacion.isBlank() || ubicacion.isEmpty()) {
				System.out.println("El campo no puede estar vacio. \n");
			}
		}
		while(estado.isBlank() || estado.isEmpty()) {
			System.out.println("Ingrese estado (prestado, disponible, extraviado) \n");
			ByteArrayInputStream in = new ByteArrayInputStream("prestado".getBytes());
			System.setIn(in);
			Scanner Iestado = new Scanner(in);
			estado = Iestado.nextLine();
			if(estado.isBlank() || estado.isEmpty()) {
				System.out.println("El campo no puede estar vacio. \n");
			}
			if(estado != "prestado" || estado != "disponible" || estado != "extraviado") {
				System.out.println("Por favor, indique alguno de los 3 estados en minuscula (prestado, disponible o extraviado) \n");
			}
		}
		while(desc.isBlank() || desc.isEmpty()) {
			System.out.println("Ingrese descripcion \n");
			ByteArrayInputStream in = new ByteArrayInputStream("hola".getBytes());
			System.setIn(in);
			Scanner Idesc = new Scanner(in);
			desc = Idesc.nextLine();
			if(desc.isBlank() || desc.isEmpty()) {
				System.out.println("El campo no puede estar vacio. \n");
			}
		}
		Libro libro = new Libro(titulo, autor, fecha, paginas, editorial, genero, isbn, ubicacion, estado, desc);
		Main.Registrar(LibrosList, libro);
		assertEquals("hola", LibrosList.get(0).GetTitulo());
		assertEquals("hola", LibrosList.get(0).GetAutor());
		assertEquals("hola", LibrosList.get(0).GetFecha());
		assertEquals(2, LibrosList.get(0).GetPaginas());
		assertEquals("hola", LibrosList.get(0).GetEditorial());
		assertEquals("hola", LibrosList.get(0).GetGenero());
		assertEquals("hola", LibrosList.get(0).GetIsbn());
		assertEquals("hola", LibrosList.get(0).GetUbicacion());
		assertEquals("prestado", LibrosList.get(0).GetEstado());
		assertEquals("hola", LibrosList.get(0).GetDesc());
		System.setIn(sysInBackup);
	}
	
	@Test
	public void BuscarTituloTest() { //Test si con solo una palabra que coincida, devuelve el libro correcto
		ArrayList<Libro> LibrosList = new ArrayList<Libro>();
		List<String> lista;
		Libro libro = new Libro("The Hunger Games", "Suzanne Collins", "14/09/2008", 384, "Scholastic Press", "Novela", "9876091654", "Estante 2 (1,13)", "disponible", "Descripcion");
		LibrosList.add(libro);
		InputStream sysInBackup = System.in;
		String titulo;
		System.out.println("Ingrese titulo para buscar \n");
		ByteArrayInputStream in = new ByteArrayInputStream("The".getBytes());
		System.setIn(in);
		Scanner Ititulo = new Scanner(in);
		titulo = Ititulo.nextLine();
		lista = Main.BuscarT(LibrosList, titulo);
		assertEquals("Titulo: The Hunger Games", lista.get(0));
		System.setIn(sysInBackup);
	}
	
	@Test
	public void BuscarAutorTest() { //Test si con solo una palabra que coincida, devuelve el libro correcto
		ArrayList<Libro> LibrosList = new ArrayList<Libro>();
		List<String> lista;
		Libro libro = new Libro("The Hunger Games", "Suzanne Collins", "14/09/2008", 384, "Scholastic Press", "Novela", "9876091654", "Estante 2 (1,13)", "disponible", "Descripcion");
		LibrosList.add(libro);
		InputStream sysInBackup = System.in;
		String autor;
		System.out.println("Ingrese autor para buscar \n");
		ByteArrayInputStream in = new ByteArrayInputStream("Suzanne".getBytes());
		System.setIn(in);
		Scanner input = new Scanner(in);
		autor = input.nextLine();
		lista = Main.BuscarA(LibrosList, autor);
		assertEquals("Autor: Suzanne Collins", lista.get(1));
		System.setIn(sysInBackup);
	}
	
	@Test
	public void BuscarIsbnTest() { //Test si con solo una palabra que coincida, devuelve el libro correcto
		ArrayList<Libro> LibrosList = new ArrayList<Libro>();
		List<String> lista;
		Libro libro = new Libro("The Hunger Games", "Suzanne Collins", "14/09/2008", 384, "Scholastic Press", "Novela", "9876091654", "Estante 2 (1,13)", "disponible", "Descripcion");
		LibrosList.add(libro);
		InputStream sysInBackup = System.in;
		String isbn;
		System.out.println("Ingrese ISBN para buscar \n");
		ByteArrayInputStream in = new ByteArrayInputStream("987".getBytes());
		System.setIn(in);
		Scanner input = new Scanner(in);
		isbn = input.nextLine();
		lista = Main.BuscarI(LibrosList, isbn);
		assertEquals("ISBN: 9876091654", lista.get(6));
		System.setIn(sysInBackup);
	}
	
	@Test
	public void EditarLLibroTest() { //Para efectos de simpleza y por temas de tiempo, solo se probara si efectivamente se cambia solo 1 campo
									//El resto de campos tienen el mismo codigo, por lo que "en teoria" deberian funcionar de igual manera que este test
		Libro libro = new Libro("The Hunger Games", "Suzanne Collins", "14/09/2008", 384, "Scholastic Press", "Novela", "9876091654", "Estante 2 (1,13)", "disponible", "Descripcion");
		ArrayList<Libro> LibrosList = new ArrayList<Libro>();
		LibrosList.add(libro);
		String titulo = "hola";
		String autor = "yo";
		String fecha = "123";
		int paginas = 23;
		String editorial = "asd";
		String genero = "asd";
		String isbn = "asd";
		String ubicacion = "asd";
		String desc = "asd";
		int index = 0;
		assertEquals("The Hunger Games", libro.GetTitulo());
		assertEquals("Suzanne Collins", libro.GetAutor());
		assertEquals("14/09/2008", libro.GetFecha());
		assertEquals(384, libro.GetPaginas());
		assertEquals("Scholastic Press", libro.GetEditorial());
		assertEquals("Novela", libro.GetGenero());
		assertEquals("9876091654", libro.GetIsbn());
		assertEquals("Estante 2 (1,13)", libro.GetUbicacion());
		assertEquals("Descripcion", libro.GetDesc());
		Main.EditarLLibro(LibrosList, index,  titulo,  autor,  fecha,  paginas,  editorial,  genero,  isbn,  ubicacion,  desc);
		assertEquals("hola", libro.GetTitulo());
		assertEquals("yo", libro.GetAutor());
		assertEquals("123", libro.GetFecha());
		assertEquals(23, libro.GetPaginas());
		assertEquals("asd", libro.GetEditorial());
		assertEquals("asd", libro.GetGenero());
		assertEquals("asd", libro.GetIsbn());
		assertEquals("asd", libro.GetUbicacion());
		assertEquals("asd", libro.GetDesc());
	}
	
	@Test
	public void EditarEEstado() {
		Libro libro = new Libro("The Hunger Games", "Suzanne Collins", "14/09/2008", 384, "Scholastic Press", "Novela", "9876091654", "Estante 2 (1,13)", "disponible", "Descripcion");
		ArrayList<Libro> LibrosList = new ArrayList<Libro>();
		LibrosList.add(libro);
		String estado = "extraviado";
		int index = 0;
		assertEquals("disponible", libro.GetEstado());
		Main.EditarEEstado(LibrosList, index, estado);
		assertEquals("extraviado", libro.GetEstado());
	}

	@Test
	public void EliminarLibro() {
		Libro libro = new Libro("The Hunger Games", "Suzanne Collins", "14/09/2008", 384, "Scholastic Press", "Novela", "9876091654", "Estante 2 (1,13)", "disponible", "Descripcion");
		ArrayList<Libro> LibrosList = new ArrayList<Libro>();
		LibrosList.add(libro);
		assertEquals(1, LibrosList.size());
		Main.EliminarLibro(LibrosList, 0);
		assertEquals(0, LibrosList.size());
	}
	
}
