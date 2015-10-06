package entidades;


public class Pieza {
    
    private final String idPieza;
   
    private boolean estado;
    

    public Pieza(String idPieza) {
        this.idPieza = idPieza;
        
        estado = true;
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
