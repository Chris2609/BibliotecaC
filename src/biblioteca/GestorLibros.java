package biblioteca;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.ArrayList;

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
				Visor.mostrarMensaje("Libro insertado");
				break;
				
			case Menu.ELIMINAR_LIBRO:
			
				int elim = new FormulariosDeDatos().pedirIdLibro(scan);
				GestorBBDD eliminar = new GestorBBDD();
				eliminar.eliminarLibro(elim);
				Visor.mostrarMensaje("Libro eliminado");
				break;
			
			
			case Menu.MODIFICAR_LIBRO:
				
				int idModificar = new FormulariosDeDatos().pedirIdLibro(scan);
				libro = new FormulariosDeDatos().modificarDatosLibro(scan);
				GestorBBDD modificar = new GestorBBDD();
				modificar.modificarLibro(idModificar, libro);
				
				break;
				
			case Menu.VER_LIBROS:
				GestorBBDD verlibrosbbdd = new GestorBBDD();
				Visor.mostrarLibros(verlibrosbbdd.verLibros());
				break;
				
			case Menu.SALIR:
				 Visor.mostrarMensaje("\nSaliendo...\n");
				
				break;
			default:
                System.out.println("Opcion incorrecta!");
            }
		}while(opcion != 0);
		
	}
	
}
