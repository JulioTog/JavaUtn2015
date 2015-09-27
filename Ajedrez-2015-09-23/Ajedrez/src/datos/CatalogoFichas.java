package datos;

import entidades.Ficha;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class CatalogoFichas {
    
    public CatalogoFichas(){}
    public Ficha[] getFichas(){
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Ficha[] fichas = new Ficha[32];
        try{
            stmt = FactoryConexion.getInstancia().getConn().prepareStatement(
                    "select distinct * from ficha");
            rs = stmt.executeQuery();
            if (rs != null && rs.next()) {
                for (int i = 0; i < fichas.length; i++) {
                    Ficha aux = new Ficha(rs.getInt("id_ficha"), rs.getInt("pos_x"), rs.getInt("pos_y"), (rs.getString("cod_pieza").charAt(0))); 
                    fichas[i] = aux;
            }
            }
        }
        catch(SQLException e){
            
        }
        return fichas;
    }
    public Ficha getFichaById(int idPieza) throws SQLException{
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Ficha f = null;
        try{
            stmt = FactoryConexion.getInstancia().getConn().prepareStatement(
                    "select id_pieza, pos_x, pos_y, cod_pieza from piezas where id_pieza = ?"
            );
            stmt.setInt(1, idPieza);
            rs = stmt.executeQuery();
            if (rs != null && rs.next()) {
                f = new Ficha();
                
            }
        }
        catch(SQLException e){
            
        }
        return null;
    }
}
