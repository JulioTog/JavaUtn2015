package negocio;

import datos.CatalogoDeJugadores;
import entidades.Jugador;
import entidades.Partida;


public class ControladorAjedrez {
    
    private CatalogoDeJugadores catJug;
    private Partida partida;
    
    public void iniciarPartida(int dni1, int dni2){
        Jugador jug1 = catJug.buscarJugador(dni1);
        Jugador jug2 = catJug.buscarJugador(dni2);
        partida = new Partida();
        partida.inicializar(jug1, jug2);
        
    }
    
    public Partida getPartida(){
        return this.partida;
    }
    
    public void realizarMovimiento(int iniX, int iniY, int finX, int finY){
        
    }
    
}
