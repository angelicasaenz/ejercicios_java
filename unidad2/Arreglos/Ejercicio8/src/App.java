import java.util.Scanner;

public class App {

/*     Posición de un elemento
    Llena un arreglo de 6 elementos y luego solicita un número. Indica su posición.

    Guía:

    Usa el índice del ciclo.
    Detén cuando lo encuentres. */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] arreglo = new int[6];

        for(int i = 0; i < arreglo.length; i++){
            System.out.println("Ingrese un número: ");
            arreglo[i] = sc.nextInt();
        }

        System.out.println("Ingrese el número a consultar: ");
        int num = sc.nextInt();
        int posicion = 0;

        for(int i = 0; i < arreglo.length; i++){
            if (num == arreglo[i]) {
                posicion = i;   
                break;
            }
        }
        System.out.println("El número buscado esta en la posición: " + posicion);

        sc.close();
    }
}
