package biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {
		protected Connection con;
		
		private static final String HOST = "localhost";
		private static final String BBDD = "biblioteca";
		private static final String USERNAME = "root";
		private static final String PASSWORD = "";
		
		public void conectar() throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://"+HOST+"/"+BBDD, USERNAME, PASSWORD);
//			con = (Connection) DriverManager.getConnection(url, "root", "");
		}
		
		public void cerrarConexion() throws SQLException {
			con.close();
		}

		public Connection getCon() {
			return con;
		}

		public void setCon(Connection con) {
			this.con = con;
		}
		
}
