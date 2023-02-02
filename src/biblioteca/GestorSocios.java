package biblioteca;

import java.sql.SQLException;
import java.text.Normalizer.Form;
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
				
			case Menu.INSERTAR_SOCIO:
				
				Socio socio = new Socio();
				socio = new FormulariosDeDatos().pedirDatosSocio(scan);
				GestorBBDD insertar = new GestorBBDD();
				insertar.insertarSocio(socio);
				
				Visor.mostrarMensaje("Socio insertado");
				
				break;
				
			case Menu.ELIMINAR_SOCIO:
				
				GestorBBDD eliminar = new GestorBBDD();
				eliminar.eliminarSocio(FormulariosDeDatos.pedirIdSocio(scan));
				Visor.mostrarMensaje("Socio eliminado");
				break;
				
			case Menu.MODIFICAR_SOCIO:
				
				GestorBBDD modificar = new GestorBBDD();
				modificar.modificarSocio(FormulariosDeDatos.pedirIdSocio(scan), FormulariosDeDatos.modificarSocio(scan));
				
				break;
			
				
			case Menu.SALIR:
				
				Visor.mostrarMensaje("\nSaliendo...\n");
			}
			
		
			
			
		}while(opcion!=0);
		
	}
	
}
