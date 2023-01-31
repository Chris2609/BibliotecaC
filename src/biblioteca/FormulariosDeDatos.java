package biblioteca;

import java.util.Scanner;

public class FormulariosDeDatos {
	
	public static Libro pedirDatosLibro(Scanner scan) {
		
		Libro libro = new Libro();
		System.out.println("Introduce el titulo del libro");
		libro.setTitulo(scan.nextLine());
		System.out.println("Introduce el autor del libro");
		libro.setAutor(scan.nextLine());
		System.out.println("Introduce el número de páginas");
		libro.setNumPag(Integer.parseInt(scan.nextLine()));
		
		return null;
	}
	
	public static Libro modificarDatosLibro(Libro libro, Scanner scan) {
		
		
		
		return null;
	}
	
}
