package entidades;


public class TipoFicha {
    private char codPieza;
    
    public TipoFicha(){}

    public TipoFicha(char cod) {
        this.codPieza = cod;
    }
    
    public boolean validarMovimiento(int inix, int iny, int finx, int finy){
        return true;
    }
    public boolean movCaballo(int inix, int iniy, int finx, int finy){
        int x = inix - finx;
        int y = iniy - finy;
        boolean valido = false;
        if (((Math.abs(x) == 1)&&(Math.abs(y) == 2)) || (Math.abs(x) == 2)&&(Math.abs(y) == 1)) {
            valido = true;
        }
        return valido;
    }
    
    public boolean movAlfil(int inix, int iniy, int finx, int finy){
        int x = inix - finx;
        int y = iniy - finy;
        boolean valido = false;
        if ((Math.abs(x)) == (Math.abs(y))) {
            valido = true;
        }
        return valido;
    }
    
    public boolean movTorre(int inix, int iniy, int finx, int finy){
        boolean valido = false;
        if ((inix - finx == 0)||(iniy - finy == 0)) {
            valido = true;
        }
        return valido;
    }
    
    
}

