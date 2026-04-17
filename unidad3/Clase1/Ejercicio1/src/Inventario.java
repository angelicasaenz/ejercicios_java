
public class Inventario {

    private String[] nombres;
    private int[] cantidades;
    private int totalProductos;

    // Constructor
    public Inventario(){
        this.nombres = new String[10];
        this.cantidades = new int[10];
        totalProductos = 0;   
    }

    // Metodo agregar producto
    public void agregarProducto(String nombre, int cantidad){

        if ( totalProductos < nombres.length ) {
            nombres[totalProductos] = nombre;
            cantidades[totalProductos] = cantidad;
            totalProductos ++;
        } else {
            System.out.println("El Stock esta completo");
        }
        

    }
    // Eliminar producto
    public void eliminarProducto(String nombre) throws ProductoNoEncontradoException{
        int posicion = -1;
        for(int i = 0; i < totalProductos; i++){
            if (nombres[i].equals(nombre)) {
                posicion = i;
                break;
            }
        }

        if (posicion == -1) {
                throw new ProductoNoEncontradoException("Producto no encontrado");
            }

        for(int i = posicion; i < totalProductos -1; i++) {
                nombres[i] = nombres[i+1];
                cantidades[i] = cantidades[i+1];
            }
        totalProductos--;
    }

    // Buscar producto

    public String buscarProducto(String nombre) throws ProductoNoEncontradoException{

        for(int i = 0; i < totalProductos; i++){
            if (nombres[i].equals(nombre)) {
                return "La cantidad disponible es: " + cantidades[i];
            }
        }
        throw new ProductoNoEncontradoException("El producto no fue encontrado.");
    }
    
    // Actualizar cantidad

    public void actualizarCantidad(String nombre, int nuevaCantidad) throws CantidadInvalidaException, ProductoNoEncontradoException{

        for(int i = 0; i < totalProductos; i++){
            if (nombres[i].equals(nombre)) {
                if (nuevaCantidad < 0) {
               throw new CantidadInvalidaException("La cantidad ingresada es invalida");
            } else {
                cantidades[i] = nuevaCantidad;
                return;
            }
            }
            
        }
        throw new ProductoNoEncontradoException("El producto no encontrado");

    }

    }