package negocio;

import datos.CatalogoJugadores;
import entidades.Jugador;
import entidades.Partida;


public class ControladorAjedrez {
    private final CatalogoJugadores catJug;
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
        if ((jug1!=null)&&(jug2!=null)) {
            Partida partida;
            partida = new Partida(jug1, jug2);
        }
    }
}
