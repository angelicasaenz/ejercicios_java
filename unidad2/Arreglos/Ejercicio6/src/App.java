import java.util.Scanner;

public class App {
/*     Número mayor
    Solicita 7 números y determina cuál es el mayor.

    Guía:

    Declara una variable nunMayor
    Inicializa con el primer valor del arreglo.
    Compara y actualiza. */
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int[] arreglo = new int[7];

        for(int i = 0; i < arreglo.length; i++){
            System.out.println("Ingrese un número: ");
            arreglo[i] = sc.nextInt();
        }
        int numMayor = arreglo[0];

        for(int i = 1; i < arreglo.length; i++){
            if (arreglo[i] > numMayor) {
                numMayor = arreglo[i];
            }
        }
        System.out.println("El mayor es: " + numMayor);
    }
}
