import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

/*     Ejercicio 4: Múltiples catch
    Objetivo:
    Practicar el manejo de varias excepciones en una misma estructura.

    Enunciado:
    Solicita al usuario dos números enteros y realiza una división.

    Debes controlar:

    Si el usuario divide entre cero.
    Si el usuario ingresa texto en vez de números.
    Indicaciones:
    Usa Scanner.
    Usa un try con varios catch.
    Captura:
    ArithmeticException
    InputMismatchException */
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Ingrese el primer número: ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            System.out.println("El resultado de la división es: " + num1/num2);

        } catch (ArithmeticException e) {
            System.out.println("Error! no se puede dividir entre 0");
        } catch (InputMismatchException e) {
            System.out.println("Error! ingrese solo valores númericos");
        }
        sc.close();
    }
}
