public class Libro {

    // Atributos

    private String titulo;
    private int cantidadDisponible;

    // Constructor 
    public Libro(String titulo, int cantidadDisponible){
        this.titulo = titulo;
        this.cantidadDisponible = cantidadDisponible;
    }

    // Metodo get

    public String getTitulo(){
        return this.titulo;
    }

    // Metodo prestar

    public void prestar(int cantidad) throws CantidadInvalidaException, LibroNoDisponibleException{
        if (cantidad <= 0) {
            throw new CantidadInvalidaException("Cantidad invalida");
        } else if (cantidad > cantidadDisponible) {
            throw new LibroNoDisponibleException("Libro no disponible :( ");
        } else {
            cantidadDisponible -= cantidad;
        }
    }

}
