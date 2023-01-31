package biblioteca;

import java.sql.SQLException;
import java.util.Scanner;

public class GestorBiblioteca {

	public void run() throws ClassNotFoundException, SQLException {
        Scanner scan = new Scanner(System.in);
		int opcion;
		
		Menu.mostrarMenuPrincipal();
        opcion = Integer.parseInt(scan.nextLine());
		
        do {
        switch(opcion) {
        
        case Menu.GESTIONAR_LIBROS:
        	
        	GestorLibros.run(scan);

        	break;
        	
        	
        	
        	
        case 0:        	
        	System.out.println("Adios");
        
        break;
        
        }
        
  
        }while(opcion != 0);
	}
	
}
