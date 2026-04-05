import java.util.Scanner;

/*  Contar números pares
    Llena un arreglo de 10 números y cuenta cuántos son pares.

    Guía:

    Declara una variable int contador para almacenar la cantidad de numeros pares.
    Usa el operador %.
    Incrementa contador. */

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] arreglo = new int[10];

        for(int i = 0; i < arreglo.length; i++){
            System.out.println("Ingrese un número: ");
            arreglo[i] = sc.nextInt();
        }

        int contador = 0;

        for(int i = 0; i < arreglo.length; i++){
            if (arreglo[i] % 2 == 0) {
                contador++;
            }
        }

        System.out.println("La cantidad de pares es: " + contador);
    }
}
