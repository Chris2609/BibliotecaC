package biblioteca;

import java.util.Scanner;

public class GestorSocios {

	public static void run(Scanner scan) {
	
		int	opcion=0;
		
		do {
			Menu.mostrarMenuSocios();
			opcion = Integer.parseInt(scan.nextLine());
			
			switch(opcion) {
			case Menu.VER_SOCIOS:
				
				System.out.println("Socios:");
				
			}
			
			
		}while(opcion!=0);
		
	}
	
}
