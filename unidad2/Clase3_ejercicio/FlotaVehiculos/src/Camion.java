public class Camion extends Vehiculo{

    private double capacidadCarga;

    public Camion(String marca, String modelo, int anio, double capacidadCarga){
        super(marca, modelo, anio);
        this.capacidadCarga = capacidadCarga;
    }

    // get

    public double getCapacidadCarga(){
        return this.capacidadCarga;
    }
    @Override
    public void mover(){
        System.out.println("El camión avanza lentamente.");
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Capacidad de carga: "+ capacidadCarga);
    }
}
