package biblioteca;



public class Menu {
	
	
	
	public static void mostrarMenuPrincipal() {
		System.out.println("1. Gestionar Libros\n2. Gestionar Socios\n3. Gestionar Prestamos\n0. Salir");
	}
		
	public static final int GESTIONAR_LIBROS = 1;
	public static final int GESTIONAR_SOCIOS = 2;
	public static final int GESTIONAR_PRESTAMOS = 3;
	
	
	public static void mostrarMenuLibros() {
		System.out.println("1. Insertar libro\n2. Eliminar libro\n3. Modificar libro\n4. Ver libros\n0. Salir");
	}
	
	public static final int INSERTAR_LIBRO = 1;
	public static final int ELIMINAR_LIBRO = 2;
	public static final int MODIFICAR_LIBRO=3;
	public static final int VER_LIBROS=4;
	
	public static final int SALIR = 0;
	
	
	public static void mostrarMenuSocios() {
		System.out.println("1. Ver Socios\n2. Insertar Socio\n3. Eliminar Socio\n4. Modificar Socio   \n0. Salir");
	} 
	
	public static final int VER_SOCIOS = 1;
	public static final int INSERTAR_SOCIO = 2;
	public static final int ELIMINAR_SOCIO = 3;
	public static final int MODIFICAR_SOCIO = 4;
	
	public static void mostrarMenuPrestamos() {
		System.out.println("Realizar préstamo");
	}

}
