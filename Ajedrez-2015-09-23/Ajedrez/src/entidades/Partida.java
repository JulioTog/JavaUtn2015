package entidades;

import datos.CatalogoFichas;
import java.util.Random;

public class Partida {
    private int nroPartida;
    private final Jugador[] jugadores;
    private final Ficha[][] tablero;
    CatalogoFichas catFi = new CatalogoFichas();
    public Partida(Jugador jug1, Jugador jug2, Ficha fichas[]){
        Random rndm = new Random();
        this.nroPartida = rndm.nextInt();
        tablero = new Ficha[8][8];
        jugadores = new Jugador[2];
        jugadores[0]=jug1;
        jugadores[1]=jug2;
        for (int i = 0; i < fichas.length; i++) {
            if (fichas[i].getEstado()) {
                this.tablero[fichas[i].getPosX()][fichas[i].getPosY()] = fichas[i];
            }
        }
    }

    public void setNroPartida(int nro) {
        this.nroPartida=nro;
    }
    
    public void mover(int inix, int iniy, int finx, int finy){
        Ficha aux = tablero[inix][iniy];
        tablero[inix][iniy] = null;
        tablero[finx][finy] = aux;
    }
}
