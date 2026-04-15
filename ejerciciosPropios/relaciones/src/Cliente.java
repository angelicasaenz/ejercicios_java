public class Cliente {

    private String nombre;
    private int edad;

    // Construcor

    public Cliente(){

    }

    public Cliente(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters

    public String getNombre(){
        return this.nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    // Setters 

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }





}
