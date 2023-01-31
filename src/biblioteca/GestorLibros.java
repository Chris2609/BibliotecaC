package biblioteca;

import java.sql.SQLException;
import java.util.Scanner;

public class GestorLibros {

	public static void run(Scanner scan) throws ClassNotFoundException, SQLException {
	
		int opcion = 0;

		do {
			Menu.mostrarMenuLibros();
			opcion = Integer.parseInt(scan.nextLine());
			
			switch(opcion) {
			case Menu.INSERTAR_LIBRO:
				
				Libro libro = new Libro();
				libro = new FormulariosDeDatos().pedirDatosLibro(scan);
				GestorBBDD gestor = new GestorBBDD();
				gestor.insertarLibro(libro);
				
				break;
				
			case Menu.ELIMINAR_LIBRO:
			
				System.out.println("Introduce el ID del libro a eliminar");
				int elim = Integer.parseInt(scan.nextLine());
				GestorBBDD eliminar = new GestorBBDD();
				eliminar.eliminarLibro(elim);

				
				break;
			
			
			case Menu.VISUALIZAR_LIBROS:
				
				System.out.println("Ver libros");
			
				break;
				
			}
			
		}while(opcion!=0);
		
	}
	
}
