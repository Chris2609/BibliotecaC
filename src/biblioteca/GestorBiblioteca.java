package biblioteca;

import java.util.Scanner;

public class GestorBiblioteca {

	public void run() {
        Scanner scan = new Scanner(System.in);
		int opcion;
		
		Menu.mostrarMenuPrincipal();
        opcion = Integer.parseInt(scan.nextLine());
		
        
        switch(opcion) {
        
        case Menu.GESTIONAR_LIBROS:
        	System.out.println("");
        	
        	break;
        	
        }
	}
	
}
