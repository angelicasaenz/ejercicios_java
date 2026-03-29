public class Motocicleta extends Vehiculo implements Arrancable{

    private int cilindrada;

    public Motocicleta (String marca, String modelo, int anio, int cilindrada){
        super(marca, modelo, anio);
        this.cilindrada = cilindrada;
    }

    // get

    public int getCilindrada(){
        return this.cilindrada;
    }

    @Override
    public void mover(){
        System.out.println("La motocicleta acelera");
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Cilindrada: "+cilindrada);
    }

    public void arrancar(){
        System.out.println("La motocicleta arranca luego de soltar el clutch");
    }
}
