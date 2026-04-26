import java.util.Scanner;

public class App {

/*     Ejercicio 1: División segura (Unchecked Exception)
    Objetivo:
    Practicar el manejo de una excepción no verificada (ArithmeticException).

    Enunciado:
    Crea un programa que solicite al usuario dos números enteros y realice la división entre ellos.

    Si el usuario intenta dividir entre cero, el programa debe capturar la excepción y mostrar un mensaje indicando que no es posible realizar esa operación.

    Indicaciones:
    Usa Scanner para pedir los números.
    Usa un bloque try-catch.
    Captura ArithmeticException.
    Muestra un mensaje amigable al usuario. */

    public static void main(String[] args) throws Exception {
        

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Ingrese el primer número: ");
            int num1 = sc.nextInt();
            System.out.println("Ingrese el segundo número: ");
            int num2 = sc.nextInt();
            System.out.println("La división entre " + num1 + " y " + num2 + " es: " + num1/num2);
        } catch (ArithmeticException e) {
            System.out.println("No es posible realizar esta operación.");
        }

        sc.close();
    }
}
