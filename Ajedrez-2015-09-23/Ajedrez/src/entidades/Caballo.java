package entidades;

public class Caballo extends Pieza{

    public Caballo(int posX, int posY, String idPieza) {
        super(posX, posY, idPieza);
    }
    
    public boolean validarMovimiento(int inix, int iniy, int finx, int finy){
        int x = inix - finx;
        int y = iniy - finy;
        boolean valido = false;
        if (((Math.abs(x) == 1)&&(Math.abs(y) == 2)) || (Math.abs(x) == 2)&&(Math.abs(y) == 1)) {
            valido = true;
        }
        return valido;
    }

}
