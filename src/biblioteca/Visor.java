package biblioteca;

import java.util.ArrayList;
import java.util.Iterator;

public class Visor {

	public static void mostrarLibros(ArrayList<Libro> libros) {
		for (int i = 0; i < libros.size(); i++) {
			System.out.println(libros.get(i).getId() + "," + libros.get(i).getTitulo() + "," + libros.get(i).getAutor() + "," + libros.get(i).getNumPag() + "\n" );
		}
	}
	
	public static void mostrarLibro(Libro libro) {
		System.out.println("ID:" + libro.getId() + "\nTitulo:" + libro.getTitulo() + "\nAutor:" + libro.getAutor() + "Número de páginas:" + libro.getNumPag());
	}
	
	public static void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}
	
}
