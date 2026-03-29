public class Coche extends Vehiculo implements Arrancable{

    private int numeroPuertas;

    public Coche(String marca, String modelo, int anio, int numeroPuertas){
        super(marca, modelo, anio);
        this.numeroPuertas = numeroPuertas;
    }

    // get

    public int getNumeroPuertas(){
        return this.numeroPuertas;
    }

    @Override
    public void mover(){
        System.out.println("El coche se mueve por la carretera.");
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Número de puertas: "+numeroPuertas);
    }

    public void arrancar(){
        System.out.println("El coche arranca luego de encenderlo");
    }
}
