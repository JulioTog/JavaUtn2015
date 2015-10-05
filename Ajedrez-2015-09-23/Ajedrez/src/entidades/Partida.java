package entidades;

import java.util.ArrayList;
import java.util.Random;


public class Partida {
    
    private int nroPartida;
    private Jugador jugadorBlanco;
    private Jugador jugadorNegro;
    ArrayList<Pieza> piezas;
    private Pieza[][] tablero;
    
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
        
        this.tablero[1][1] = new Torre(1,1,"Tb");
        this.tablero[1][2] = new Caballo(1,2,"Cb");
        this.tablero[1][3] = new Alfil(1,3,"Ab");
        this.tablero[1][4] = new Dama(1,4,"Db");
        this.tablero[1][5] = new Rey(1,5,"Rb");
        this.tablero[1][6] = new Alfil(1,6,"Ab");
        this.tablero[1][7] = new Caballo(1,7,"Cb");
        this.tablero[1][8] = new Torre(1,8,"Tb");
        this.tablero[2][1] = new Peon(2,1,"Pb");
        this.tablero[2][2] = new Peon(2,2,"Pb");
        this.tablero[2][3] = new Peon(2,3,"Pb");
        this.tablero[2][4] = new Peon(2,4,"Pb");
        this.tablero[2][5] = new Peon(2,5,"Pb");
        this.tablero[2][6] = new Peon(2,6,"Pb");
        this.tablero[2][7] = new Peon(2,7,"Pb");
        this.tablero[2][8] = new Peon(2,8,"Pb");
        this.tablero[8][1] = new Torre(8,1,"Tn");
        this.tablero[8][2] = new Caballo(8,2,"Cn");
        this.tablero[8][3] = new Alfil(8,3,"An");
        this.tablero[8][4] = new Dama(8,4,"Dn");
        this.tablero[8][5] = new Rey(8,5,"Rn");
        this.tablero[8][6] = new Alfil(8,6,"An");
        this.tablero[8][7] = new Caballo(8,7,"Cn");
        this.tablero[8][8] = new Torre(8,8,"Tn");
        this.tablero[7][1] = new Peon(7,1,"Pn");
        this.tablero[7][2] = new Peon(7,2,"Pn");
        this.tablero[7][3] = new Peon(7,3,"Pn");
        this.tablero[7][4] = new Peon(7,4,"Pn");
        this.tablero[7][5] = new Peon(7,5,"Pn");
        this.tablero[7][6] = new Peon(7,6,"Pn");
        this.tablero[7][7] = new Peon(7,7,"Pn");
        this.tablero[7][8] = new Peon(7,8,"Pn");
        
    }
    
    public void realizarMovimiento(int iniX, int iniY, int finX, int finY){
        this.tablero[iniX][iniY].setPosX(finX);
        this.tablero[iniX][iniY].setPosY(finY);
        
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
    
    
}
