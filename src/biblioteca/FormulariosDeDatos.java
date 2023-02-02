package biblioteca;

import java.util.Scanner;

public class FormulariosDeDatos {
	
	public static Libro pedirDatosLibro(Scanner scan) {
		
		Libro libro = new Libro();
		System.out.println("Introduce el titulo del libro");
		libro.setTitulo(scan.nextLine());
		System.out.println("Introduce el autor del libro");
		libro.setAutor(scan.nextLine());
		System.out.println("Introduce el número de páginas");
		libro.setNumPag(Integer.parseInt(scan.nextLine()));
		
		return libro;
	}
	
	public static Libro modificarDatosLibro(Scanner scan) {
		
		Libro libro = new Libro();
		System.out.println("Introduce el nuevo titulo del libro");
		libro.setTitulo(scan.nextLine());
		System.out.println("Introduce el nuevo autor del libro");
		libro.setAutor(scan.nextLine());
		System.out.println("Introduce e nuevo número de páginas del libro");
		libro.setNumPag(Integer.parseInt(scan.nextLine()));
		
		return libro;
	}
	
	public static int pedirIdLibro(Scanner scan) {
		
		int idLibro;
		System.out.println("Introduce el ID del libro");
		idLibro = Integer.parseInt(scan.nextLine());
		
		return idLibro;
		
	}
	
	public static Socio pedirDatosSocio(Scanner scan) {
		
		Socio socio = new Socio();
		System.out.println("Introduce el nombre del socio");
		socio.setNombre(scan.nextLine());
		System.out.println("Introduce el apellido del socio");
		socio.setApellido(scan.nextLine());
		System.out.println("Introduce la direccion");
		socio.setDireccion(scan.nextLine());
		System.out.println("Introduce la población");
		socio.setPoblacion(scan.nextLine());
		System.out.println("Introduce la provincia");
		socio.setProvincia(scan.nextLine());
		System.out.println("Introduce el DNI del socio");
		socio.setDni(scan.nextLine());
		
		return socio;
	}
	
	public static int pedirIdSocio(Scanner scan) {
		
		int idSocio;
		System.out.println("Introduce el ID del socio");
		idSocio = Integer.parseInt(scan.nextLine());
		
		return idSocio;
	}
	
	public static Socio modificarSocio(Scanner scan) {
		
		Socio socio = new Socio();
		System.out.println("Introduce el nuevo nombre del socio");
		socio.setNombre(scan.nextLine());
		System.out.println("Introduce el nuevo apellido del socio");
		socio.setApellido(scan.nextLine());
		System.out.println("Introduce la nueva direccion");
		socio.setDireccion(scan.nextLine());
		System.out.println("Introduce la nueva población");
		socio.setPoblacion(scan.nextLine());
		System.out.println("Introduce la nueva provincia");
		socio.setProvincia(scan.nextLine());
		System.out.println("Introduce el nuevo DNI del socio");
		socio.setDni(scan.nextLine());
		
		return socio;
	}
	
}
