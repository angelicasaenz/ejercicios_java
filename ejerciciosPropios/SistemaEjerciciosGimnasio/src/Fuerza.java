public class Fuerza extends Actividad implements Ejercicio{

    // Constructor
    public Fuerza(String nombre){
        super(nombre);
    }

    @Override
    public void calcularCalorias(int minutos){
        if (minutos >= 60 ) {
            System.out.println("Felicidades quemaste entre 200 - 400 kcal");
        }

    }

}
