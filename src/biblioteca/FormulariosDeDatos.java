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
		
		return libro;
	}
	
	public static Libro modificarDatosLibro(Libro libro, Scanner scan) {
		
		System.out.println("Introduce el nuevo titulo del libro");
		libro.setTitulo(scan.nextLine());
		System.out.println("Introduce el nuevo autor del libro");
		libro.setAutor(scan.nextLine());
		System.out.println("Introduce e nuevo número de páginas del libro");
		libro.setNumPag(Integer.parseInt(scan.nextLine()));
		
		return libro;
	}
	
	public static int pedirIdLibro(Scanner scan) {
		
		int idLibro;
		System.out.println("Introduce el ID del libro");
		idLibro = Integer.parseInt(scan.nextLine());
		
		return 0;
		
	}
	
}
