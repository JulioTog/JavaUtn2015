package entidades;


public class Alfil extends Pieza {

    public Alfil(int posX, int posY, String idPieza) {
        super(posX, posY, idPieza);
    }
    
    
    public boolean validarMovimiento(int inix, int iniy, int finx, int finy){
        int x = inix - finx;
        int y = iniy - finy;
        boolean valido = false;
        if ((Math.abs(x)) == (Math.abs(y))) {
            valido = true;
        }
        return valido;
    }
    
}
