import java.util.Scanner;

public class App {

   /*  1. Guardar y mostrar números
    Crea un arreglo de 5 números enteros. Solicita al usuario que ingrese los valores y luego muéstralos en pantalla en el mismo orden.
    Guía:
    Declara un arreglo de tamaño fijo.
    Usa un ciclo para llenarlo.
    Usa otro ciclo para imprimirlo. */

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        // Creación de arreglo
        int[] arreglo = new int[5];

        // Llenar arreglo
        for(int i = 0; i < arreglo.length; i++){
            System.out.println("Ingrese un número: ");
            arreglo[i] = sc.nextInt();
        }

        for(int i = 0; i < arreglo.length; i++){
            System.out.println("Posición " + i + ": " + arreglo[i]);
        }

    }
}
