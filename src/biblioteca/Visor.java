package biblioteca;

import java.util.ArrayList;
import java.util.Iterator;

public class Visor {

	public static void mostrarLibros(ArrayList<Libro> libros) {
		for (int i = 0; i < libros.size(); i++) {
			System.out.println("ID:" + libros.get(i).getId() + "\nTitulo: " + libros.get(i).getTitulo() + "\nAutor: " + libros.get(i).getAutor() + "\nNúm Páginas: " + libros.get(i).getNumPag() + "\n" );
		}
	
	}
	
	public static void mostrarLibro(Libro libro) {
		System.out.println("ID:" + libro.getId() + "\nTitulo:" + libro.getTitulo() + "\nAutor:" + libro.getAutor() + "Número de páginas:" + libro.getNumPag());
	}
	
	public static void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}
	
	public static void mostrarSocios(ArrayList<Socio> socios) {
		for (Socio socio : socios) {
			System.out.println("ID:" + socio.getId() + "\nNombre:" + socio.getNombre() + "\nApellido:" + socio.getNombre() + "\nDireccion:" + socio.getDireccion() + "\nPoblacion:" + socio.getPoblacion() + "\nProvincia:" + socio.getProvincia() + "\nDNI:" + socio.getDni() + "\n");
		}
	}
	
}
