package datos;

import entidades.Jugador;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogoDeJugadores {
    private ArrayList<Jugador> jugadores;
    public CatalogoDeJugadores(){}
    
    public void crearJugadores(){
        
        Jugador jug1 = new Jugador(37903582,"julio","togn");
        jugadores.add(jug1);
        Jugador jug2 = new Jugador(123456,"julian","giov");
        jugadores.add(jug2);
    }
      public Jugador buscarJugador(int dni){
          boolean exist = false;
          Jugador jug = null;
          for(Jugador j: jugadores){
              if (j.getDni()== dni){
                  exist = true;
                  jug = j;
                  
              }
          }
          if (exist){
              return jug;
          }else{
              return jug;
          }
      }
    //public Jugador buscarJugador(int dni){
       // ResultSet rs=null;
       // PreparedStatement stmt=null;
        //Jugador j = null;     
        //Codigo para BD
       // try {
               // stmt = 	FactoryConexion.getInstancia().getConn().prepareStatement(
               //                "select dni, nombre, apellido from jugadores where dni = ?"
               //                 );
               // stmt.setInt(1, dni);
               // rs = stmt.executeQuery();
               // if(rs !=null && rs.next()){
               //         j=new Jugador();
               //         j.setDni(rs.getInt("dni"));
               //         j.setNombre(rs.getString("nombre"));
               //         j.setApellido(rs.getString("apellido"));
               // }
        //} catch (SQLException e) {
        //        e.printStackTrace();
        //}
       // finally
       // {
       //         try {
        //                if(rs!=null)rs.close();
       //                 if(stmt!=null) stmt.close();
       //         } catch (SQLException e) {
       //                 e.printStackTrace();
       //         }
       //         FactoryConexion.getInstancia().releaseConn();
      //  }
      //  return j;
    //}
    
}
