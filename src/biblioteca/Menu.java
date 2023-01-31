package biblioteca;



public class Menu {
	
	
	
	public static void mostrarMenuPrincipal() {
		System.out.println("1. Gestionar Libros\n2. Gestionar Socios\n3. Gestionar Prestamos");
	}
		
	public static final int GESTIONAR_LIBROS = 1;
	public static final int GESTIONAR_SOCIOS = 2;
	
	
	public static void mostrarMenuLibros() {
		System.out.println("1. Insertar libro\n2. Eliminar libro\n3. Visualizar libros");
	}
	
	public static final int INSERTAR_LIBRO = 1;
	public static final int ELIMINAR_LIBRO = 2;
	public static final int VISUALIZAR_LIBROS=3;
	
	
	public static void mostrarMenuSocios() {
		System.out.println("1. Ver socios");
	} 
	
	public static final int VER_SOCIOS = 1;
	
	
	public static void mostrarMenuPrestamos() {
		System.out.println("Realizar préstamo");
	}

}
