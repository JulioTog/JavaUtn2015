package datos;

import entidades.Partida;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogoDePartidas {
    public CatalogoDePartidas(){}
    public void registrarPartida(Partida p){
		ResultSet rs=null;
		PreparedStatement stmt=null;
			
		try {
			stmt = FactoryConexion.getInstancia().getConn().prepareStatement(
					"insert into jugadores(dni, nombre, apellido) values (?,?,?,?)",PreparedStatement.RETURN_GENERATED_KEYS
				   );
			stmt.setInt(1, p.getNroPartida());
			stmt.setString(2, );
			stmt.setString(3, j.getApellido());
			stmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			
			try {
				if(rs!=null ) rs.close();
				if(stmt != null) stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			FactoryConexion.getInstancia().releaseConn();
		}
	}
}
