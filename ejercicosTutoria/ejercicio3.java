import java.util.Scanner;

public class ejercicio3 {
    
    static Scanner sc = new Scanner(System.in);
    static double ventasRealizadas;
    public static void main(String[] args) {
        menu();

    }

    // Menú
    public static void menu() {

        int opcion;
        double ventaIngresada;

        do {
            System.out.println("""
                **** MENÚ VENTAS ****
                1. Registrar ventas
                2. Ver total vendido
                3. Salir

                Por favor elija una opción: 
                """);
        opcion = sc.nextInt();
        

        switch (opcion) {

            // Registrar venta
            case 1:
                System.out.println("Ingrese el valor de la venta: ");
                ventaIngresada = sc.nextDouble();
                if (ventaIngresada > 0) {
                    ventasRealizadas += ventaIngresada;
                    System.out.println("Su venta ha sido registrada, total vendido: " + ventasRealizadas);
                } else{
                    System.out.println("El valor debe ser mayor a 0");
                }
                
                break;
            // Ver total vendio
            case 2:
                System.out.println("El total vendido es: " + ventasRealizadas);
                break;
            // Salir
            case 3:
                System.out.println("Saliendo del programa...");
                break;        
            default:
                break;
        }
        } while (opcion != 3);
    }
}
