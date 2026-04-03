import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] arreglo = new int[5];

        // Llenar el arreglo
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese un número: ");
            arreglo[i] = sc.nextInt(); //guardanos en la posición arreglo[i] lo leído por consola
        }

        // Mostrar el arreglo
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Posición " + i + ": " + arreglo[i]);
        }
    }
}
    

