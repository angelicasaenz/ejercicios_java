import java.util.Scanner;
import java.util.spi.CalendarDataProvider;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        System.out.println("""
                ****** Menú Gym ******
                1. Cardio
                2. Fuerza
                0. Salir

                Ingrese una opción:
                """);
        opcion = sc.nextInt();
        
        switch (opcion) {
            case 1:
                // Cardio
                Cardio c1 = new Cardio("Correr");
                c1.calcularCalorias(60);
                break;
            case 2:
                
                break;
            case 0:
                System.out.println("Saliendo del sistema");
            break;
            default:
                break;
        }
    }
}
