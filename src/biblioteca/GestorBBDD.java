package biblioteca;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GestorBBDD {

	public void insertarLibro(Libro libro) throws ClassNotFoundException, SQLException {
		Conector conectar = new Conector();
		conectar.conectar();
        PreparedStatement insertar = conectar.getCon().prepareStatement("INSERT INTO libros (titulo, autor, num_pag) VALUES (?,?,?)");
        insertar.setString(1, libro.getTitulo());
        insertar.setString(2, libro.getAutor());
        insertar.setInt(3, libro.getNumPag());
		insertar.execute();
	
		conectar.cerrarConexion();
	}
	
	public void eliminarLibro(int id) throws ClassNotFoundException, SQLException {
		Conector conectar = new Conector();
		conectar.conectar();
		PreparedStatement eliminar = conectar.getCon().prepareStatement("DELETE FROM libros WHERE id = ?");
		eliminar.setInt(1, id);
		
	}
	
	public Libro getLibro(int id) {
		
		return null;
	}
	
}
