package entidades;


public class Ficha {
    private int idPieza;
    private boolean estado;
    private int posX;
    private int posY;
    private TipoFicha tipo;
    
    public Ficha(){}
    
    public Ficha(int idFicha, int posx, int posy, char cod){
        this.idPieza = idFicha;
        this.posX = posx;
        this.posY = posy;
        this.tipo = new TipoFicha(cod);
    }

    public int getIdPieza() {
        return idPieza;
    }

    public void setIdPieza(int idPieza) {
        this.idPieza = idPieza;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
    
    public boolean validarMovimiento(int inix, int iniy, int finx, int finy, TipoFicha tipo){
        return tipo.validarMovimiento(inix, iniy, finx, finy);
    }
    
}
