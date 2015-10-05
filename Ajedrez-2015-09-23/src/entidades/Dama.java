package entidades;


public class Dama extends Pieza {

    public Dama(int posX, int posY, String idPieza) {
        super(posX, posY, idPieza);
    }

    public boolean validarMovimiento(int inix, int iniy, int finx, int finy){
        int xD = inix - finx;
        int yD = iniy - finy;
        boolean valido = false;
        if ((Math.abs(xD)==Math.abs(yD))||((xD == 0)||(yD == 0))){
            valido = true;
        }
        return valido;
    }
    
}
