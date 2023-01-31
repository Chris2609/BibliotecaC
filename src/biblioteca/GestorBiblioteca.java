package biblioteca;

import java.sql.SQLException;
import java.util.Scanner;

public class GestorBiblioteca {

	public void run() throws ClassNotFoundException, SQLException {
        Scanner scan = new Scanner(System.in);
		int opcion;
		
		Menu.mostrarMenuPrincipal();
        opcion = Integer.parseInt(scan.nextLine());
		
        
        switch(opcion) {
        
        case Menu.GESTIONAR_LIBROS:
        	
        	GestorLibros.run(scan);

        	break;
        	
        }
	}
	
}
