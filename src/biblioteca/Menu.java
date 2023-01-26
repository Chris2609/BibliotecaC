package biblioteca;

import java.util.Scanner;

public class Menu {
	
	public static void menuPrincipal() {
		final int GESTIONAR_LIBROS = 1;
        final int GESTIONAR_SOCIOS = 2;
        final int GESTIONAR_PRESTAMOS = 3;
        final int SALIR = 0;
        Scanner scan = new Scanner(System.in);
        int opcion_menu;
        do {
            System.out.println(" ------MENU------");
            System.out.println(GESTIONAR_LIBROS + ". Gestionar libros");
            System.out.println(GESTIONAR_SOCIOS + ". Gestionar Socios");
            System.out.println(GESTIONAR_PRESTAMOS + ". Gestionar prestamos");
            System.out.println(SALIR + ". Salir");
            System.out.println("Elije una de las opciones");
            opcion_menu = Integer.parseInt(scan.nextLine());
            switch (opcion_menu) {
            case GESTIONAR_LIBROS:
                System.out.println("primera opcion seleccionada\n");
                menuLibros();
                break;
            case GESTIONAR_SOCIOS:
                System.out.println("segunda opcion seleccionada\n");
                menuSocios();
                break;
            case GESTIONAR_PRESTAMOS:
                System.out.println("tercera opcion seleccionada\n");
                menuPrestamos();
                break;
            case SALIR:
                System.out.println("ADIOS");
                break;
            default:
                System.out.println("Opcion incorrecta!");
            }
        } while (opcion_menu != SALIR);
	}
	
	public static void menuLibros() {
		
	}
	
	public static void menuSocios() {
		
	} 
	
	public static void menuPrestamos() {
	}

}
