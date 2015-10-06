package entidades;

public class Jugador {
    
    private int dni;
    private String nombre;
    private String apellido;
    private String color;
    
    public Jugador(int dni, String nombre, String apellido){
        this.setDni(dni);
        this.setApellido(apellido);
        this.setNombre(nombre);
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    
    
}
