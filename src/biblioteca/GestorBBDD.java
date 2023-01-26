package biblioteca;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GestorBBDD {

	public void insertarLibro(Libro libro) throws ClassNotFoundException, SQLException {
		Conector conec = new Conector();
		conec.conectar();
        PreparedStatement preparedSt = conec.getCon().prepareStatement("INSERT INTO libros (titulo, autor, num_pag) VALUES (?,?,?)");
        preparedSt.setString(1, libro.getTitulo());
        preparedSt.setString(2, libro.getAutor());
        preparedSt.setInt(3, libro.getNumPag());
		preparedSt.execute();
	
		conec.cerrarConexion();
	}
	
	
	
}
