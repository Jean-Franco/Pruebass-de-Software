package piilapackage;
import java.util.Stack;
import java.util.*;
import java.util.Scanner;
import java.io.IOException;
import org.apache.logging.log4j.*;

public class Piiila {
	private static Logger stacklogger = LogManager.getLogger(Piiila.class.getName());
	public static void main(String args[]) throws IOException{
		Stack stack = new Stack();
		int option;
		int option2;
		int option3;
		int option4;
		String string;
		//Dar la bienvenida, pedir que ingrese al menos dos textos y luego preguntar si quiere agregar, comparar o buscar mas largo o corto 
		System.out.println("Bienvenido\n");
		while(true){
			if (stack.size() >= 2){ //Si tiene mas dos o mas de dos textos
				System.out.println("\nTamano de la pila: " + stack.size() + " elementos \n");
				System.out.println("Seleccione una opcion (del 0 al 4): ");
				System.out.println("\n(1) Ingresar un texto");
				System.out.println("\n(2) Ver texto mas largo o mas corto");
				System.out.println("\n(3) Imprimir un texto");
				System.out.println("\n(4) Comparar tamanos");
				System.out.println("\n(0) Cerrar programa");
				try{
					Scanner input = new Scanner(System.in);
					option = input.nextInt();
					stacklogger.info("Se ingreso la opcion " + option);
				}catch (Exception e){
					option = 5;
					stacklogger.info("Se ingreso una entrada invalida");
				}
				if (option == 1){ //Ingresar texto
					System.out.println("Ingrese un texto: ");
					Scanner input1 = new Scanner(System.in);
					string = input1.nextLine();
					stack.push(string);
					stacklogger.info("Entrada " + string + " obtenida y agregada al stack");
				}
				else if (option == 2){ //Ver textos mas largos o mas cortos
					Iterator iterator = stack.iterator();
					System.out.println("Seleccione una opcion: ");
					System.out.println("(1) Ver texto mas largo");
					System.out.println("(2) Ver texto mas corto");
					Scanner input2 = new Scanner(System.in);
					option2 = input2.nextInt();
					if (option2 == 1){ //Imprimir texto mas largo
						int i = 0;
						int max = 0;
						int posMax = 0;
						while(iterator.hasNext()){
							string = (String) iterator.next();
							if(string.length() > max){
								max = string.length();
								posMax = i;
							}
							i++;
						}
						System.out.println("El texto mas largo es: " + stack.get(posMax) + "\n");
						stacklogger.info("Opcion " + option2 + " seleccionada, resultado obtenido");
					}
					else if (option2 == 2){ //Imprimir texto mas corto
						int i = 0;
						int posMin = 0;
						double min = Double.POSITIVE_INFINITY;
						while(iterator.hasNext()){
							string = (String) iterator.next();
							System.out.println(string.length());
							if(string.length() < min){
								min = string.length();
								posMin = i;
							}
							i++;
						}
						System.out.println("El texto mas corto es: " + stack.get(posMin) + "\n");
						stacklogger.info("Opcion " + option2 + " seleccionada, resultado obtenido");
					}
					else{
						System.out.println("Por favor ingrese una opcion valida");
						stacklogger.info("Se ingreso una entrada " + option2 + " invalida");
					}
				}
				else if (option == 3){ //Imprimir un texto
					System.out.println("Los elementos en la pila son los siguientes: " + stack.toString());
					System.out.println("Seleccione la posicion de la cual quiere obtener el elemento (empezando por el 1): ");
					Scanner input3 = new Scanner(System.in);
					option3 = input3.nextInt();
					try {
						System.out.println(stack.get(option3-1));
						stacklogger.info("Entrada " + option3 + ", resultado obtenido");
					}catch(Exception e){
						System.out.println("Error en el input, por favor seleccione una posicion valida");
						stacklogger.info("Entrada " + option3 + " invalida");
					}
				}
				else if (option == 4){ //Comparar tamanos
					int option41;
					int option42;
					String string1 = "";
					String string2 = "";
					System.out.println("Los elementos en la pila son los siguientes: " + stack.toString());
					try{
						System.out.println("Seleccione la posicion del primer elemento a comparar (empezando por el 1): ");
						Scanner input41 = new Scanner(System.in);
						option41 = input41.nextInt();
						string1 = (String) stack.get(option41-1);
						System.out.println("Elemento seleccionado: " + string1);
						stacklogger.info("Entrada " + option41);
					} catch(Exception e){
						System.out.println("Error en el input, por favor seleccione una posicion valida");
						stacklogger.info("Entrada invalida");
					}
					try{
						System.out.println("Seleccione la posicion del segundo elemento a comparar (empezando por el 1): ");
						Scanner input42 = new Scanner(System.in);
						option42 = input42.nextInt();
						string2 = (String) stack.get(option42-1);
						System.out.println("Elemento seleccionado: " + string2);
						stacklogger.info("Entrada " + option42);
					} catch(Exception e){
						System.out.println("Error en el input, por favor seleccione una posicion valida");
						stacklogger.info("Entrada invalida");
					}
					if (string1.length() == string2.length()){
						System.out.println("Los elementos son del mismo tamano");
						stacklogger.info("Resultado obtenido");
					}
					else if (string1.length() < string2.length()){
						System.out.println("El elemento " + string1 + " es mas corto que " + string2);
						stacklogger.info("Resultado obtenido");
					}
					else{
						System.out.println("El elemento " + string1 + " es mas largo que " + string2);
						stacklogger.info("Resultado obtenido");
					}
				}
				else if (option == 0){ //Cerrar
					System.out.println("Adios!");
					stacklogger.info("Se cerro el programa");
					break;
				}
				else{
					System.out.println("Por favor ingrese una opcion valida");
					stacklogger.info("Entrada invalida");

				}
			}
			else{ //Si aun no tiene textos suficientes para operar con ellos
				System.out.println("Ingrese un texto: ");
				Scanner input = new Scanner(System.in);
				string = input.nextLine();
				stack.push(string);
				stacklogger.info("Entrada " + string + " obtenida y agregada al stack");
			}
		}
	}
}
