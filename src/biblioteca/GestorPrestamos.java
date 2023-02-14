package biblioteca;

import java.sql.SQLException;
import java.util.Scanner;

public class GestorPrestamos {

	public static void run(Scanner scan) throws ClassNotFoundException, SQLException {
	
		int opcion=0;
		
		do {
		Menu.mostrarMenuPrestamos();
		opcion = Integer.parseInt(scan.nextLine());
		switch(opcion) {
		
		case 1:
			Prestamo prestamo = new Prestamo();
			prestamo = new FormulariosDeDatos().pedirDatosPrestamo(scan);
			GestorBBDD insertar = new GestorBBDD();
			insertar.insertarPrestamo(prestamo);
			
			Visor.mostrarMensaje("\nPrestamo insertado\n");
			break;
			
			
		}
		
		}while(opcion != 0);
	}
}
