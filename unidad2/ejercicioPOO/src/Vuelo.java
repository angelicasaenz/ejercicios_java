package unidad2.ejercicioPOO.src;

public class Vuelo {

     //atributos: encapsulados
    private String destino;
    private String origen;
    private String fecha;
    private int pasajeros;

    //constructor por defecto
    public Vuelo(){
        this.destino = "";
        this.origen = "";
        this.fecha = "";
        this.pasajeros = 0;
    }

    //constructor con parámetros

    public Vuelo(String destino, String origen, String fecha, int pasajeros){
        this.destino = destino;
        this.origen = origen;
        this.fecha = fecha;
        this.pasajeros = pasajeros;
    }
    //getters
    public String getDestino(){
        return this.destino;
    }
    public String getOrigen(){
        return this.origen;
    }
    public String getFecha(){
        return this.fecha;
    }
    public int getPasajeros(){
        return this.pasajeros;
    }

    // Setters
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    public void setFecha(String fecha){
        this.fecha = fecha;
    }
    public void setPasajeros(int pasajeros){
        this.pasajeros = pasajeros;
    }
}

