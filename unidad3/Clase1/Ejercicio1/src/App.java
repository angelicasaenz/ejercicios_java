public class App {
    public static void main(String[] args) throws Exception {
        
        // Crear objeto inventario
        Inventario inventario = new Inventario();
        inventario.agregarProducto("Laptop Huawei", 3);
        inventario.agregarProducto("Celular Samsung", 5);
        inventario.agregarProducto("TV LG", 8);
        inventario.agregarProducto("Nevera Samsung", 20);

        // Agregar producto
        inventario.agregarProducto("Tablet apple", 2);

        // Eliminar producto

        try {
            inventario.eliminarProducto("Celular Samsung");
        } catch (ProductoNoEncontradoException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Buscar producto
        try {
            System.out.println(inventario.buscarProducto("Laptop Huawei"));
        } catch (ProductoNoEncontradoException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Actualizar cantidad
        try {
            inventario.actualizarCantidad("Laptop Huawei", 1);
        } catch (CantidadInvalidaException e){
            System.out.println("Error: " + e.getMessage());
        } catch (ProductoNoEncontradoException e) {
            System.out.println("Error: " + e.getMessage());
        } 

    }
}
