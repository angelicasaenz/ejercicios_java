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
        System.out.println("---- ELIMINAR PRODUCTO ----");
        try {
            inventario.eliminarProducto("Celular Samsung");
            System.out.println("Producto eliminado con exito");
        } catch (ProductoNoEncontradoException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();

        // Buscar producto
        System.out.println("---- BUSCAR PRODUCTO ----");
        try {
            System.out.println("Buscando producto...");
            System.out.println(inventario.buscarProducto("Laptop Lenovo"));
        } catch (ProductoNoEncontradoException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();

        // Actualizar cantidad
        System.out.println("---- ACTUALIZAR CANTIDAD ----");
        try {
            inventario.actualizarCantidad("Laptop Huawei", 1);
            System.out.println("Cantidad actualizada correctamente");
        } catch (CantidadInvalidaException e){
            System.out.println("Error: " + e.getMessage());
        } catch (ProductoNoEncontradoException e) {
            System.out.println("Error: " + e.getMessage());
        } 

    }
}
