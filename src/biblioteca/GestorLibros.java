package biblioteca;

import java.util.Scanner;

public class GestorLibros {

	public static void run(Scanner scan) {
	
		int opcion = 0;

		do {
			Menu.mostrarMenuLibros();
			opcion = Integer.parseInt(scan.nextLine());
			
			switch(opcion) {
			case Menu.INSERTAR_LIBRO:
				
				System.out.println("Insertar libro");
				
				break;
				
			case Menu.ELIMINAR_LIBRO:
			
				System.out.println("Eliminar libro");
				
				break;
			
			
			case Menu.VISUALIZAR_LIBROS:
				
				System.out.println("Ver libros");
			
				break;
				
			}
			
		}while(opcion!=0);
		
	}
	
}
