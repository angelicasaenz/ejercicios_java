package unidad1.clase8.vsModularEjercicio2.src;

import java.util.Scanner;

public class App {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
        double precio = 120000;
        double descuento = 0;
        if (tieneDescuento(descuento, precio)) {
            descuento = precio * 0.10;
        }
        double precioFinal = calcularPrecioTotal(precio, descuento);
        mostrarInfo(precio, precioFinal, descuento);
    }

    
    // Tiene descuento?
    public static boolean tieneDescuento(double descuento, double precio) {
        return precio > 100000;
    }

    // Calculo precio total
    public static double calcularPrecioTotal(double precio, double descuento ) {
        return precio - descuento;

    }

    // Mostrar información
    public static void mostrarInfo(double precio, double total, double descuento) {
        System.out.println("Precio original: " + precio);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total: " + total);
    }

}
