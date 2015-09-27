package negocio;

import datos.CatalogoFichas;
import datos.CatalogoJugadores;
import entidades.Ficha;
import entidades.Jugador;
import entidades.Partida;
import entidades.TipoFicha;
import java.sql.SQLException;


public class ControladorAjedrez {
    private final CatalogoJugadores catJug;
    private CatalogoFichas catFichas;
    public ControladorAjedrez(){
        catJug = new CatalogoJugadores();
    }
    public void registrarJugador(int dni, String nombre, String apellido){
        if (catJug.buscarJugador(dni)== null){
            Jugador j = new Jugador(dni,nombre,apellido);
            catJug.add(j);
        }    
    }
    public void iniciarPartida(int dni1, int dni2){
        Jugador jug1 = catJug.buscarJugador(dni1);
        Jugador jug2 = catJug.buscarJugador(dni2);
        Ficha[] fichas = new Ficha[32];
        fichas = catFichas.getFichas();
        if ((jug1!=null)&&(jug2!=null)) {
            Partida partida;
            partida = new Partida(jug1, jug2, fichas);
        }
    }
    public void realizarMovimiento(int idPieza, int inix, int iniy, int finx, int finy, TipoFicha tipo){
        Ficha f;
        try{
            f = catFichas.getFichaById(idPieza);
            if(f.validarMovimiento(inix, iniy, finx, finy, tipo)){
                
            }
        }
        catch(SQLException e){
            
        }
    }
}
