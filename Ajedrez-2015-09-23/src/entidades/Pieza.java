package entidades;


public class Pieza {
    
    private final String idPieza;
    private int posX;
    private int posY;
    private boolean estado;
    

    public Pieza(int posX, int posY, String idPieza) {
        this.idPieza = idPieza;
        this.posX = posX;
        this.posY = posY;
        estado = true;
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public String getIdPieza(){
        return this.getIdPieza();
    }
    
    
}
