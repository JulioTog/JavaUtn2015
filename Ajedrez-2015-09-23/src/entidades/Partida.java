package entidades;

import java.util.ArrayList;
import java.util.Random;


public class Partida {
    
    private int nroPartida;
    private Jugador jugadorBlanco;
    private Jugador jugadorNegro;
    private ArrayList<Pieza> piezas;
    private Pieza[][] tablero;
    private ArrayList<Turno> turnos;
    
    public Partida(){
        piezas = new ArrayList<>();
        this.tablero = new Pieza[8][8];
        this.tablero = null;
    }
    
    public void inicializar(Jugador blanco, Jugador negro){
        Random rndm = new Random();
        this.nroPartida = rndm.nextInt();
        this.jugadorBlanco = blanco;
        this.jugadorNegro = negro;
        inicializarTablero();
        
    }
    
    public void inicializarTablero(){
        
        this.tablero[1][1] = new Torre("Tb");
        this.tablero[1][2] = new Caballo("Cb");
        this.tablero[1][3] = new Alfil("Ab");
        this.tablero[1][4] = new Dama("Db");
        this.tablero[1][5] = new Rey("Rb");
        this.tablero[1][6] = new Alfil("Ab");
        this.tablero[1][7] = new Caballo("Cb");
        this.tablero[1][8] = new Torre("Tb");
        this.tablero[2][1] = new Peon("Pb");
        this.tablero[2][2] = new Peon("Pb");
        this.tablero[2][3] = new Peon("Pb");
        this.tablero[2][4] = new Peon("Pb");
        this.tablero[2][5] = new Peon("Pb");
        this.tablero[2][6] = new Peon("Pb");
        this.tablero[2][7] = new Peon("Pb");
        this.tablero[2][8] = new Peon("Pb");
        this.tablero[8][1] = new Torre("Tn");
        this.tablero[8][2] = new Caballo("Cn");
        this.tablero[8][3] = new Alfil("An");
        this.tablero[8][4] = new Dama("Dn");
        this.tablero[8][5] = new Rey("Rn");
        this.tablero[8][6] = new Alfil("An");
        this.tablero[8][7] = new Caballo("Cn");
        this.tablero[8][8] = new Torre("Tn");
        this.tablero[7][1] = new Peon("Pn");
        this.tablero[7][2] = new Peon("Pn");
        this.tablero[7][3] = new Peon("Pn");
        this.tablero[7][4] = new Peon("Pn");
        this.tablero[7][5] = new Peon("Pn");
        this.tablero[7][6] = new Peon("Pn");
        this.tablero[7][7] = new Peon("Pn");
        this.tablero[7][8] = new Peon("Pn");
        
    }
    
   
    
    public Pieza[][] getTablero(){
        return this.tablero;
    }

    public int getNroPartida() {
        return nroPartida;
    }

    public void setNroPartida(int nroPartida) {
        this.nroPartida = nroPartida;
    }

    public Jugador getJugadorBlanco() {
        return jugadorBlanco;
    }

    public void setJugadorBlanco(Jugador jugadorBlanco) {
        this.jugadorBlanco = jugadorBlanco;
    }

    public Jugador getJugadorNegro() {
        return jugadorNegro;
    }

    public void setJugadorNegro(Jugador jugadorNegro) {
        this.jugadorNegro = jugadorNegro;
    }

    public ArrayList<Pieza> getPiezas() {
        return piezas;
    }

    public void setPiezas(ArrayList<Pieza> piezas) {
        this.piezas = piezas;
    }
    //Array con turnos
    public  ArrayList<Turno> setTurnos(ArrayList<Turno> turnos){
        this.turnos = turnos;
    }
    
    public ArrayList<Turno> getTurnos() {
        return turnos;
    }
    
}
