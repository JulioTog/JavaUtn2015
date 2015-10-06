package entidades;


public class Alfil extends Pieza {

    public Alfil(String idPieza) {
        super(idPieza);
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
