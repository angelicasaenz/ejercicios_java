import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class App {

/*     Ejercicio 5: catch anidados
    Objetivo:
    Practicar bloques try-catch dentro de otros bloques.

    Enunciado:
    Crea un programa que:

    Solicite el nombre de un archivo.
    Intente abrir el archivo.
    Dentro de ese proceso, solicite dos números y realice una división.
    Debe manejar:

    FileNotFoundException
    ArithmeticException
    Indicaciones:
    Un try-catch externo para el archivo.
    Un try-catch interno para la división. */
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        try {
            // Abrir archivo
            System.out.println("Ingrese el nombre del archivo que desea abrir");
            String nomArchivo = sc.nextLine();
            FileReader leer = new FileReader(nomArchivo);
            
            try {
                // Realizar la división
                System.out.println("Ingrese un número: ");
                int num1 = sc.nextInt();
                System.out.println("Ingrese otro número: ");
                int num2 = sc.nextInt();

                System.out.println("El resultado de la división es: " +  num1/num2);
            } catch (ArithmeticException e) {
                System.out.println("Error! no puede dividir entre 0");
            }
        } catch (FileNotFoundException e) {
                System.out.println("Lo sentimos el archivo que busca no existe :(");
        }
        sc.close();
    }
}
