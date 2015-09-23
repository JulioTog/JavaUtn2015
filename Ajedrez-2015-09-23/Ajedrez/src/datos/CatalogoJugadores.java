package datos;

import entidades.Jugador;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogoJugadores {
    
    public CatalogoJugadores(){}
    
    public Jugador buscarJugador(int dni){
        ResultSet rs=null;
        PreparedStatement stmt=null;
        Jugador j = null;
        try {
                stmt = 	FactoryConexion.getInstancia().getConn().prepareStatement(
                                "select dni, nombre, apellido from jugadores where dni = ?"
                                );
                stmt.setInt(1, dni);
                rs = stmt.executeQuery();
                if(rs !=null && rs.next()){
                        j=new Jugador();
                        j.setDni(rs.getInt("dni"));
                        j.setNombre(rs.getString("nombre"));
                        j.setApellido(rs.getString("apellido"));
                }
        } catch (SQLException e) {
                e.printStackTrace();
        }
        finally
        {
                try {
                        if(rs!=null)rs.close();
                        if(stmt!=null) stmt.close();
                } catch (SQLException e) {
                        e.printStackTrace();
                }
                FactoryConexion.getInstancia().releaseConn();
        }
        return j;
    }
    
    public void add(Jugador j){
		ResultSet rs=null;
		PreparedStatement stmt=null;
			
		try {
			stmt = FactoryConexion.getInstancia().getConn().prepareStatement(
					"insert into jugadores(dni, nombre, apellido) values (?,?,?,?)",PreparedStatement.RETURN_GENERATED_KEYS
				   );
			stmt.setInt(1, j.getDni());
			stmt.setString(2, j.getNombre());
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
