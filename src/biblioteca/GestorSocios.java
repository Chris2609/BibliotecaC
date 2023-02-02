package biblioteca;

import java.sql.SQLException;
import java.util.Scanner;

public class GestorSocios {

	public static void run(Scanner scan) throws ClassNotFoundException, SQLException {
	
		int	opcion=0;
		
		do {
			Menu.mostrarMenuSocios();
			opcion = Integer.parseInt(scan.nextLine());
			
			switch(opcion) {
			case Menu.VER_SOCIOS:
				GestorBBDD versociosbbdd = new GestorBBDD();
				Visor.mostrarSocios(versociosbbdd.verSocios());
				
				break;
				
			case Menu.SALIR:
				
				Visor.mostrarMensaje("\nSaliendo...\n");
			}
			
		
			
			
		}while(opcion!=0);
		
	}
	
}
