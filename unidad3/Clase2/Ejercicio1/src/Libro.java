public class Libro {

    // Atributos

    String titulo;
    int cantidadDisponible;

    // Constructor 
    public Libro(String titulo, int cantidadDisponible){
        this.titulo = titulo;
        this.cantidadDisponible = cantidadDisponible;
    }

    // Metodo prestar

    public void prestar(int cantidad){

        if (cantidad > 0 && cantidad <= cantidadDisponible) {
            
            
        }
    }

}
