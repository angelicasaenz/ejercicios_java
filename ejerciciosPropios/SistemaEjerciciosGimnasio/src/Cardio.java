public class Cardio extends Actividad implements Ejercicio{

    // constructor

    public Cardio(String nombre){
        super(nombre);
    }
    
    @Override
    public void calcularCalorias(int minutos){
        if (minutos >= 60 ) {
            System.out.println("Felicidades quemaste entre 300 - 500 kcal");
        }

    }

    

}
