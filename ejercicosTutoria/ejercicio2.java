
import java.util.Scanner;

public class ejercicio2 {

    static Scanner sc = new Scanner(System.in);
    static double dineroDispo = 5_000_000;

    public static void main(String[] args) {
        menu();

    }

    // Menú
    public static void menu(){

        int opcion;
        double montoARetirar  = 0;
        do {
        System.out.println("""
                *****MENÚ BANCO*****
                1. Consultar dinero
                2. Retirar saldo
                3. Salir

                Por favor seleccione una opción...
                """);
        opcion = sc.nextInt();
        sc.nextLine();
        switch (opcion) {
            // Consultar saldo
            case 1:
                System.out.println("Su saldo es: " + dineroDispo);
                break;
            //Retirar
            case 2:
                System.out.println("Cuanto dinero desea retirar? ");
                montoARetirar = sc.nextDouble();
                if (montoARetirar <= 0) {
                    System.out.println("Ingrese un monto mayor a 0");
                } else if (montoARetirar > dineroDispo) {
                    System.out.println("Cantidad de saldo no disponible. Saldo disponible: "+ dineroDispo);
                } else {                    
                    dineroDispo -= montoARetirar;
                    System.out.println("Retiro exitoso. Su nuevo saldo es: " + dineroDispo);
                }
                break;
            case 3:
                System.out.println("Saliendo del sistema...");
                break;
            default:
                break;
        }
        } while (opcion != 3);
    }
    
}
