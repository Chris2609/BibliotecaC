package biblioteca;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		GestorBiblioteca ejecutar = new GestorBiblioteca();
		ejecutar.run();
		
	}
}
