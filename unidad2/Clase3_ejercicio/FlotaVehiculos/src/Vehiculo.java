public class Vehiculo {

    private String marca;
    private String modelo;
    private int anio;

    // Metodos
    //Constructor vacio
    public Vehiculo(){
        marca = "";
        modelo = "";
        anio = 0;
    }
    // Constructor con parametros
    public Vehiculo(String marca, String modelo, int anio){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    // Getters
    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }    
    public int getAnio(){
        return this.anio;
    }

    // Setters
/* 
    public void marca(String marca){
        this.marca = marca;
    }
    public void modelo(String modelo){
        this.modelo = modelo;
    }
    public void anio(int anio){
        this.anio = anio;
    } */


}
