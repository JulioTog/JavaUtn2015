package entidades;


public class Partida {
    private int nroPartida;
    private final Jugador[] jugadores;
    private final Ficha[] fichas = new Ficha[32];
    public Partida(Jugador jug1, Jugador jug2){
        jugadores = new Jugador[2];
        jugadores[0]=jug1;
        jugadores[1]=jug2;
    }

    public Partida() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setNroPartida(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
