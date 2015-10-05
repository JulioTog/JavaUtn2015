package entidades;

public class Rey extends Pieza{

    public Rey(int posX, int posY, String idPieza) {
        super(posX, posY, idPieza);
    }
    
    public boolean validarMovimiento(int inix, int iniy, int finx, int finy){
        boolean valido = false;
        int xR = inix - finx;
        int yR = iniy - finy;
        int xD = inix - 1;
        int yD = iniy -1;
        if (((Math.abs(xR) == 1)||(Math.abs(yR) == 1))||(Math.abs(xD) == Math.abs(yD))){
            valido = true;
        }
        return valido;
    }    

}
