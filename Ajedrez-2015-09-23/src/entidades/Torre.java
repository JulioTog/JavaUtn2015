package entidades;

public class Torre extends Pieza{

    public Torre(String idPieza) {
        super(idPieza);
    }

    public boolean validarMovimiento(int inix, int iniy, int finx, int finy){
        boolean valido = false;
        if ((inix - finx == 0)||(iniy - finy == 0)) {
            valido = true;
        }
        return valido;
    }
    
}
