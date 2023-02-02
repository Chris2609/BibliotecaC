package biblioteca;
	
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GestorBBDD {
	Conector conectar = new Conector();

	public void insertarLibro(Libro libro) throws ClassNotFoundException, SQLException {
		conectar.conectar();
        PreparedStatement insertar = conectar.getCon().prepareStatement("INSERT INTO libros (titulo, autor, num_pag) VALUES (?,?,?)");
        insertar.setString(1, libro.getTitulo());
        insertar.setString(2, libro.getAutor());
        insertar.setInt(3, libro.getNumPag());
		insertar.execute();
	
		conectar.cerrarConexion();
	}
	
	public void eliminarLibro(int id) throws ClassNotFoundException, SQLException {
		conectar.conectar();
		PreparedStatement eliminar = conectar.getCon().prepareStatement("DELETE FROM libros WHERE id = ?");
		eliminar.setInt(1, id);
		eliminar.execute();
		
		conectar.cerrarConexion();
	}
	
	public void modificarLibro(int id, Libro libro) throws ClassNotFoundException, SQLException {
		conectar.conectar();
        PreparedStatement modificar = conectar.getCon().prepareStatement("UPDATE libros SET titulo= ?, autor= ?, num_pag= ? WHERE id = ?");
        modificar.setString(1, libro.getTitulo());
        modificar.setString(2, libro.getAutor());
        modificar.setInt(3, libro.getNumPag());
        modificar.setInt(4, id);
        
        modificar.execute();
        
        conectar.cerrarConexion();
	}
	
	public ArrayList<Libro> verLibros() throws ClassNotFoundException, SQLException {
	
		conectar.conectar();
		PreparedStatement ver = conectar.getCon().prepareStatement("SELECT * FROM libros");
		ver.execute();
		ResultSet resultado = ver.executeQuery();
		
		ArrayList<Libro> libros = new ArrayList<Libro>();
		while(resultado.next()) {
			Libro libro = new Libro();
			libro.setId(resultado.getInt("id"));
			libro.setTitulo(resultado.getString("titulo"));
			libro.setAutor(resultado.getString("autor"));
			libro.setNumPag(resultado.getInt("num_pag"));
			
			libros.add(libro);
		}
		conectar.cerrarConexion();
		return libros;
	}
	
	public ArrayList<Socio> verSocios() throws ClassNotFoundException, SQLException {
		
		conectar.conectar();
		PreparedStatement ver = conectar.getCon().prepareStatement("SELECT * FROM socios");
		ver.execute();
		ResultSet resultado = ver.executeQuery();
		
		ArrayList<Socio> socios = new ArrayList<Socio>();
		while(resultado.next()) {
			Socio socio = new Socio();
			socio.setId(resultado.getInt("id"));
			socio.setNombre(resultado.getString("nombre"));
			socio.setApellido(resultado.getString("apellido"));
			socio.setDireccion(resultado.getString("direccion"));
			socio.setPoblacion(resultado.getString("poblacion"));
			socio.setProvincia(resultado.getString("provincia"));
			socio.setDni(resultado.getString("dni"));
			
			socios.add(socio);
		}
		conectar.cerrarConexion();
		return socios;
	}
	
	
	public Libro getLibro(int id) {
		
		return null;
	}
	
}
