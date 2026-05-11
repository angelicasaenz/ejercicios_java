public class Curso {

    // Atributos

    private String nombre;
    private int cuposDisponibles;

    // Constructor

    public Curso(String nombre, int cuposDisponibles){
        this.nombre = nombre;
        this.cuposDisponibles = cuposDisponibles;
    }

    // Metodo para reservar cupo

    public void reservarCupo(int cantidad) throws CantidadInvalidaException, CuposNoDisponiblesException{

        if (cantidad <= 0) {
            throw new CantidadInvalidaException("Cantidad invalida");
        } else if (cantidad > cuposDisponibles) {
            throw new CuposNoDisponiblesException("Lo sentimos, se agotaron los cupos :( ");
        }
        cuposDisponibles -= cantidad;

    }

}
