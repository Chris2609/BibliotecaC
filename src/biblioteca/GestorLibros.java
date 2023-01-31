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
				GestorBBDD insertar = new GestorBBDD();
				insertar.insertarLibro(libro);
				
				break;
				
			case Menu.ELIMINAR_LIBRO:
			
				int elim = new FormulariosDeDatos().pedirIdLibro(scan);
				GestorBBDD eliminar = new GestorBBDD();
				eliminar.eliminarLibro(elim);

				break;
			
			
			case Menu.VISUALIZAR_LIBROS:
				
				
			
				break;
			case Menu.SALIR:
				break;
			default:
                System.out.println("Opcion incorrecta!");
            }
		}while(opcion!= Menu.SALIR);
		
	}
	
}
